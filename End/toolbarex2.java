import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class toolbarex2 extends JApplet implements ActionListener
{
  JLabel colorlab = new JLabel("Background Colors");
  Font colorfont = new Font("TimesRoman", Font.BOLD, 36);
  JButton bb = new JButton("Blue");
  JButton cb = new JButton("Cyan");
  JButton rb = new JButton("Red");
  JToolBar bar = new JToolBar(SwingConstants.HORIZONTAL);
  Container c = getContentPane();
// init and actionPerformed continued
  
  public void init()
  {
    c.setBackground(Color.pink);
    c.setForeground(Color.green);
    c.setLayout(new FlowLayout());
    colorlab.setFont(colorfont);
    c.add(colorlab);
    bb.setMnemonic('b');  // <alt>b hotkey
    bb.setToolTipText("Blue");
    /* when hold mouse over the blue button, will display the tip Blue <alt>b */
    cb.setMnemonic('c');
    cb.setToolTipText("Cyan");
    rb.setMnemonic('r');
    rb.setToolTipText("Red");
    bar.add(bb);
    bar.add(cb);
    bar.add(rb);
    c.add(bar);
    bb.addActionListener(this);
    cb.addActionListener(this);
    rb.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource() == bb)
      c.setBackground(Color.blue);
    else if (e.getSource() == cb)
      c.setBackground(Color.cyan);
    else if (e.getSource() == rb)
      c.setBackground(Color.red);
  }
}