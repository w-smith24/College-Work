import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class menus extends JApplet implements ActionListener
{
  JLabel label1 = new JLabel("             ");
  Font labelfont = new Font("TimeRoman", Font.BOLD, 36);
  JMenuItem blue = new JMenuItem("Blue");
// menu items for 1st menu - colors
  JMenuItem red = new JMenuItem("Red");
  JMenuItem green = new JMenuItem("Green");
  JMenuItem pink = new JMenuItem("Pink");
  JMenuItem cyan = new JMenuItem("Cyan");
  JMenu colors = new JMenu("Colors"); // 1st menu
  JMenuItem yankees = new JMenuItem("Go Yankees");
// menu items for 2nd menu - messages
  JMenuItem hello = new JMenuItem("Hello World");
  JMenuItem fun = new JMenuItem("Java is Fun");
  JMenu messages = new JMenu("Messages"); // 2nd menu
  JMenuBar bar = new JMenuBar(); // menu bar
  Container c = getContentPane();
// init and actionPerformed continued
  public void init()
  {
    c.setLayout(new FlowLayout());
    setJMenuBar(bar); 
// set the menu bar for this applet
    colors.add(blue);  // add menu items to colors menu
    colors.add(red);
    colors.add(green);
    colors.add(pink);
    colors.add(cyan);
    bar.add(colors); // add menu to menu bar
    messages.add(yankees); 
//add menu items to messages menu
    messages.add(hello);
    messages.add(fun);
    bar.add(messages); // add menu to menu bar
    label1.setFont(labelfont);
    c.add(label1);  // add blank label for messae
    blue.addActionListener(this); 
// can take action on any menu items on either menu
    red.addActionListener(this);
    green.addActionListener(this);
    pink.addActionListener(this);
    cyan.addActionListener(this);
    yankees.addActionListener(this);
    hello.addActionListener(this);
    fun.addActionListener(this);
  }
// actionPerformed continued
  public void actionPerformed(ActionEvent e)
  {
    label1.setForeground(Color.yellow); 
    /* set label's foreground color to yellow to show on any background color */
    if (e.getSource() == blue) 
// see what menu item was clicked on
      c.setBackground(Color.blue); 
//color menu items changes background color of container of JApplet
    else if (e.getSource() == red)
      c.setBackground(Color.red);
    else if (e.getSource() == green)
      c.setBackground(Color.green);
    else if (e.getSource() == pink)
      c.setBackground(Color.pink);
    else if (e.getSource() == cyan)
      c.setBackground(Color.cyan);
    else if (e.getSource() == yankees)
// messages menu items sets text of label
      label1.setText("Go Yankees");
    else if (e.getSource() == hello)
      label1.setText("Hello World");
    else if (e.getSource() == fun)
      label1.setText("Java is Fun");
  }
}