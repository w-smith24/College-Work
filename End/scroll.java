import java.awt.*;
import javax.swing.*;
public class scroll extends JApplet
{
  JLabel prompt = new JLabel("Enter your classes");
  JTextArea classes = new JTextArea(3, 15);
  JScrollPane s = new JScrollPane(classes,
                                  ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                                  ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
  public void init()
  {
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(prompt);
    c.add(s);
  }
}