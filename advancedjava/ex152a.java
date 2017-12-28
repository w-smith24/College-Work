/* Wayne Smith
 * Exercise 15-2a
 * This applet will draw random colored random thick lines
 * */

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class ex152a extends JApplet
{
  public void paint(Graphics g)
  {    
    super.paint(g);
    Graphics2D g2 = (Graphics2D)g;
    //Array of colors
    Color[] colors = {Color.blue, Color.cyan, Color.red, Color.green,
      Color.yellow, Color.pink, Color.gray, Color.lightGray,
      Color.darkGray, Color.magenta, Color.orange};
    
    float y, x, w;
    int c;
    Line2D.Float line;  
    BasicStroke b;  
    //Loop until y is equal to the applets height
    for(y = 15; y < getSize().height; y += 15)
    {
      x = 0;
      //Form the line
      line = new Line2D.Float(x, y, x + (int)(Math.random() * getSize().width), y);
      w = (int)(Math.random() * 15 + 1);//Determine the width of the line(no wider than y's increment)
      b = new BasicStroke(w, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);//Build the stroke
      c = (int)(Math.random() * colors.length);//Determine the color of the line
      g2.setColor(colors[c]);//Set the color to draw
      g2.setStroke(b);//Set the stroke
      g2.draw(line);//Draw the line      
    }
  }
}                                          
