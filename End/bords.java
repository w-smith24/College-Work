import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
public class bords extends JApplet
{
  JLabel lab1 = new JLabel("Sample Label 1");
  JLabel lab2 = new JLabel("Sample Label 2");
  JLabel lab3 = new JLabel("Sample Label 3");
  JLabel lab4 = new JLabel("Sample Label 4");
  JLabel lab5 = new JLabel("Sample Label 5");
  JLabel lab6 = new JLabel("Sample Label 6");
  JLabel lab7 = new JLabel("Sample Label 7");
  Container c = getContentPane();
  public void init()
  {
    c.setLayout(new FlowLayout());
    lab1.setBorder(new MatteBorder(5, 10, 5, 10,Color.blue));
    /* blue border - 10 pixels wide on left and right and 5 pixels on top and botton */
    lab2.setBorder(new BevelBorder(BevelBorder.RAISED));
// raised BevelBorder 
    lab3.setBorder(new EtchedBorder(EtchedBorder.RAISED));
// raised EtchedBorder - smaller border than Bevel
    lab4.setBorder(new LineBorder(Color.blue, 10));
// blue border - 10 pixels wide all around 
    lab5.setBorder(new EmptyBorder(10, 10, 10, 10));
// 10 pixel space border around label
    lab6.setBorder(new TitledBorder(new
                                      LineBorder(Color.blue, 10), "Title Label 6"));
    /* same as #4, but with Title Label 6 as a title in the top border */
    lab7.setBorder(new CompoundBorder(new
                                        LineBorder(Color.blue, 10), new
                                        BevelBorder(BevelBorder.RAISED)));
    /* same as #2 & #4 - label has inner raised BevelBorder & outer 10 pixel blue LineBorder*/
    c.add(lab1);
    c.add(lab2);
    c.add(lab3);
    c.add(lab4);
    c.add(lab5);
    c.add(lab6);
    c.add(lab7);
  }
}