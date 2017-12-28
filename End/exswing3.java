import java.awt.*;
import javax.swing.*;
public class exswing3 extends JApplet
{
  Container c = getContentPane();
  JButton jb1 = new JButton("Button One");
  JButton jb2 = new JButton("Button Two");
  JCheckBox jcb1 = new JCheckBox("Checkbox 1");
  JCheckBox jcb2 = new JCheckBox("Checkbox 2");
  JLabel jlab = new JLabel("Java Motif Label");
  JTextField jf = new JTextField(20);
  public void init()
  {
    c.setLayout(new FlowLayout());
    c.add(jb1);
    c.add(jb2);
    c.add(jcb1);
    c.add(jcb2);
    c.add(jlab);
    c.add(jf);
    setSize(450, 200);
    try
    {
      UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
      SwingUtilities.updateComponentTreeUI(this);
    }
    catch(Exception e)
    {
      System.out.println("Exception occurred");
    }
  }
}