import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cardbases extends JApplet implements ActionListener
{
  CardLayout cl = new CardLayout(10, 10);
  /* 10 pixel horizontally and vertically around component on container applet */
  JButton b1 = new JButton("First Base"); 
// top button on stack
  JButton b2 = new JButton("Second Base");
// 2nd button on stack
  JButton b3 = new JButton("Third Base");
  JButton b4 = new JButton("Home Plate");
  JButton b5 = new JButton("Dugout");
// bottom button on stack
  Container c = getContentPane();
  boolean atbat = true; 
  /* if at bat means at home plate, so will run to first base, but if at home plate after scoring a run will return to dugout */
  
// init and actionPerformed continued
  public void init()
  {
    c.setLayout(cl); // container set to CardLayout
    c.add("1st", b1); 
    // add b1 first base on top and name the button card 1st 
    c.add("2nd", b2); // add b2 button under b1
    c.add("3rd", b3);
    c.add("Home", b4);
    c.add("Dug", b5);
    b1.addActionListener(this); 
    // can click on any button when it is on top
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    cl.show(c, "Home"); 
    /*show the card called Home on top since you are at bat at home plate*/
  }
  public void actionPerformed(ActionEvent e)
  {
    if (atbat)
      /* if at bat, go to first (show the first button b1 first base) and you are no longer at bat */
    {
      cl.first(c);
      atbat = false;
    }
    else if (e.getSource() == b4)
      /* if you are not at bat and are at b4 button home plate, then you just scored, so go to the next button b5 dugout and sit down (disable button b5) */
    {
      cl.next(c);
      b5.setEnabled(false);
    }
    else // otherwise get the next card down and go to the next base
      cl.next(c);
  }
}