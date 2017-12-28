import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class boxbases extends JApplet 
{
  Box boxlay = new Box(BoxLayout.Y_AXIS);
  /* uses Box class to declare an object called boxlay with the BoxLayout vertical arrangement - y axis */
  JButton b1 = new JButton("First Base"); // 4 buttons
  JButton b2 = new JButton("Second Base");
  JButton b3 = new JButton("Third Base");
  JButton b4 = new JButton("Home Plate");
  Container c = getContentPane(); // container for box
  public void init()
  {
    c.setLayout(new FlowLayout()); 
// container has flowlayout
    c.add(boxlay); 
    /* add the boxlay with the BoxLayout to the Container c with the FlowLayout */
    boxlay.add(b1); // add the buttons to the boxlay Box
    boxlay.add(b2);
    boxlay.add(b3);
    boxlay.add(b4);
  }
}