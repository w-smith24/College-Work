import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class toolbarex extends JApplet implements ActionListener
{
  JLabel colorlab = new JLabel("Background Colors"); // label on applet
  Font colorfont = new Font("TimesRoman", Font.BOLD, 36);
  JButton bb = new JButton("Blue");  // 3 buttons for toolbar
  JButton cb = new JButton("Cyan");
  JButton rb = new JButton("Red");
  JToolBar bar = new JToolBar(SwingConstants.HORIZONTAL);
// buttons will line up horizontally on toolbar
  Container c = getContentPane();
  public void init()
  {
    c.setBackground(Color.pink); // initial background color for container
    c.setForeground(Color.green); // color for label
    c.setLayout(new FlowLayout());
    colorlab.setFont(colorfont);
    c.add(colorlab);
    bar.add(bb); // add buttons to toolbar
    bar.add(cb);
    bar.add(rb);
    c.add(bar);  // add toolbar to container
    bb.addActionListener(this);  // can click on buttons
    cb.addActionListener(this);
    rb.addActionListener(this);
  }    // actionPerformed() continued
  
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource() == bb) // blue button
      c.setBackground(Color.blue); 
// change container's background color
    else if (e.getSource() == cb)
      c.setBackground(Color.cyan);
    else if (e.getSource() == rb)
      c.setBackground(Color.red);
  }
}