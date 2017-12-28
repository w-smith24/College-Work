import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class comboex extends JApplet 
  implements ActionListener
{
  JLabel ins = new
    JLabel("Vote for your Favorite show");
  String[] initial = {"The Andy Griffith Show", "Leave it to Beaver", "Get Smart"}; // initial choices
  JComboBox choices = new JComboBox(initial);
  /* initialize the JComboBox with the elements in the array of String objects, instead of using the addItem() method on each of the elements in the array */
  JButton pick = new JButton("Vote");
  JLabel yourpick = new JLabel(" ");
  Font yourfont = new Font("TimesRoman", Font.BOLD, 20);
  public void init()
  {
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(ins);
    c.add(choices);
    choices.setEditable(true);
// let user use the TextField part of the JComboBox
    c.add(pick);
    yourpick.setFont(yourfont);
    c.add(yourpick);
    choices.addActionListener(this);
    pick.addActionListener(this); // for JButton
  }
  // actionPerformed() method continued
  
  public void actionPerformed(ActionEvent e)
  {
    int answer, index;
    String show;
    show = choices.getSelectedItem().toString();
    /* convert Object selected to a String for name of your language */
    index = choices.getSelectedIndex(); // get index number
    if (index == -1) 
      choices.addItem(show);
// if typed in item not in JCombBox, add it
    yourpick.setText("You picked " + show);
  }
}