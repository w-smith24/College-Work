import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cardboxbases 
  extends JApplet implements ActionListener
{
  BorderLayout bord = new BorderLayout();
// for Container for JApplet
  CardLayout cl = new CardLayout(10, 10);
// for JPanel with bases for Center
  JButton b1 = new JButton("First Base");
  JButton b2 = new JButton("Second Base");
  JButton b3 = new JButton("Third Base");
  JButton b4 = new JButton("Home Plate");
  JButton b5 = new JButton("Dugout");
  JPanel bases = new JPanel();
  Box boxlay = new Box(BoxLayout.Y_AXIS);
// for West hit buttons 
  JButton s = new JButton("Single");
  JButton d = new JButton("Double");
  JButton t = new JButton("Triple");
  JButton h = new JButton("Home Run");
  JPanel hits= new JPanel();
  Container c = getContentPane();
// init() continued
  public void init()
  {
    c.setLayout(bord); // for JApplet
    bases.setLayout(cl); // CardLayout for bases JPanel     bases.add("1st", b1); // add bases to JPanel
    bases.add("2nd", b2);
    bases.add("3rd", b3);
    bases.add("Home", b4);
    bases.add("Dug", b5);
    c.add(bases, bord.CENTER); // put JPanel in Center area
    boxlay.add(s); // add hit buttons to Box
    boxlay.add(d);
    boxlay.add(t);
    boxlay.add(h);
    c.add(boxlay, bord.WEST); // box with hit buttons to West
    b1.addActionListener(this); // add buttons - ActionListener
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    s.addActionListener(this);
    d.addActionListener(this);
    t.addActionListener(this);
    h.addActionListener(this);
    cl.show(bases, "Home");  //start buttons for JPanel at Home Plate
  }
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource() == s)
      cl.show(bases, "1st");  // single, so show 1st base
    else if (e.getSource() == d)
      cl.show(bases, "2nd");
    else if (e.getSource() == t)
      cl.show(bases, "3rd");
    else if (e.getSource() == h)
      cl.show(bases, "Home");
    else if (e.getSource() == b4)  
    { // at home after scoring, so go to dugout
      cl.next(bases);
      b5.setEnabled(false);
    }
    else      // move up to next base showing
      cl.next(bases);
  }
}