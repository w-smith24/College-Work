import java.awt.*;
import javax.swing.*;
public class exswing2 extends JFrame
{
public exswing2(String lnf, String title)
// name of lookandfeel class and titlebar
{
setTitle(title); // titlebar
Container c = getContentPane();
JButton jb1 = new JButton("Button One");
JButton jb2 = new JButton("Button Two");
JCheckBox jcb1 = new JCheckBox("Checkbox 1");
JCheckBox jcb2 = new JCheckBox("Checkbox 2");
JLabel jlab = new JLabel("Java Label");
JTextField jf = new JTextField(20);
c.setLayout(new FlowLayout());
c.add(jb1);  // add different components
c.add(jb2);
c.add(jcb1);
c.add(jcb2);
c.add(jlab);
c.add(jf);
setSize(450, 200); // frame size
try
{
UIManager.setLookAndFeel(lnf);
// set look and feel to constructive argument
SwingUtilities.updateComponentTreeUI(this);
// update this frame's lookandfeel
}
catch(Exception e) // all possible kinds
{
System.out.println("Exception occurred");
}
}
// main continued
public static void main(String[] args)
{
exswing2 s1 = new
exswing2 ("javax.swing.plaf.metal.MetalLookAndFeel",
"Metal");
/* send the frame exswing2 constructor the path and name of the lookandfeel class and the title */
s1.setVisible(true); // frame visible
exswing2 s2 = new
exswing2("com.sun.java.swing.plaf.motif.MotifLookAndFeel",
"Motif");
s2.setVisible(true);
exswing2 s3 = new   exswing2("com.sun.java.swing.plaf.gtk.GTKLookAndFeel",
"Windows");
s3.setVisible(true);
}
}