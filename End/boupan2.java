import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class boupan2 extends JApplet
{
  JLabel left = new JLabel("Left Field");
  JLabel center = new JLabel("Center Field");
  JLabel right = new JLabel("Right Field");
  JPanel outfield = new JPanel();
  GridLayout grid = new GridLayout(1, 3);
  JLabel first = new JLabel("First Base");
  JLabel second = new JLabel("Second Base");
  JLabel shortstop = new JLabel("Short Stop");
  JLabel third = new JLabel("Third Base");
  JLabel pitcher = new JLabel("Pitcher");
  JPanel infield = new JPanel();
  JLabel home = new JLabel("Home Plate");
  JPanel south = new JPanel();
  FlowLayout flow = new FlowLayout();
  Container c;
  BorderLayout bord = new BorderLayout();
// init continued
  public void init()
  {
    c = getContentPane();
    c.setLayout(bord);
    outfield.setLayout(grid);
    outfield.add(left);  // 1 row, 3 columns  
    center.setHorizontalAlignment(JLabel.CENTER);
    outfield.add(center);
    right.setHorizontalAlignment(JLabel.RIGHT);
    outfield.add(right);
    c.add(outfield, bord.NORTH);
// add outfield Panel to North area
    c.add(first, "East");
    c.add(third, "West");
    
    infield.setLayout(null);
    shortstop.setBounds(25, 50, 75, 55);
// upper left of center panel
    infield.add(shortstop);
    second.setBounds(165, 50, 75, 55);
// upper right of center panel
    infield.add(second);
    pitcher.setBounds(115, 150, 75, 55);
// lower center of center panel
    infield.add(pitcher);
    c.add(infield, bord.CENTER);
    
    south.setLayout(flow);
// flow on south so home goes to center
    south.add(home);
    c.add(south, bord.SOUTH);
  }
}