/*Wayne Smith
 * This applet will draw a scene with a yellow Ellipse2D sun, a tree that consists of a Rectangle2D for the trunk
 * and an Arc2D for the leaves, a gradient Rectangle2D sky from cyan to white and green Rectangle2D grass
 * using Graphics2D. It will then draw a cat face using a GeneralPath and 2 Ellipse2D eyes in the grass 
 * and move it across the screen until the right side of the cat reaches the edge of the applet.
 * */

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class catSnake extends JApplet 
{
  
  boolean firstTime = true;       
  int x = 20;  
  
  //2D Objects
  Rectangle2D.Float grass;
  Rectangle2D.Float sky;
  GradientPaint gp1;
  Ellipse2D.Float sun;
  Line2D.Float treeTrunk;
  BasicStroke b;
  Arc2D.Float leaves;
  GeneralPath cat;
  Ellipse2D.Float eye;
  
  public void paint(Graphics g)
  {    
    
    Graphics2D g2 = (Graphics2D)g;   
    
    //If it's the first time through draw everything in the applet
    if(firstTime)
    {   
      firstTime = false;//make it so paint won't repaint everything when it's called from update()
     
      sky = new Rectangle.Float(0, 0, getSize().width, getSize().height / 2);
      grass = new Rectangle.Float(0, getSize().height / 2, getSize().width, getSize().height);
      gp1 = new GradientPaint(0, 0, Color.cyan, getSize().width, getSize().height / 2, Color.white);
      sun = new Ellipse2D.Float(20, 10, 40, 40);
      treeTrunk = new Line2D.Float(240, getSize().height / 2 - 8, 240, (getSize().height / 2) - 60);
      b = new BasicStroke(15, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER);
      leaves = new Arc2D.Float(200, ((getSize().height / 2) - 60) - 20, 80, 100, 160, -140, Arc2D.CHORD); 
      
      cat = new GeneralPath();
      cat.moveTo(x, getSize().height - 100);
      cat.lineTo(x, getSize().height - 50);
      cat.lineTo(x + 50, getSize().height - 50);
      cat.lineTo(x + 50, getSize().height - 100);
      cat.lineTo(x + 40, getSize().height - 90); 
      cat.lineTo(x + 10, getSize().height - 90);
      cat.lineTo(x, getSize().height - 100);   
      
      g2.setPaint(gp1);
      g2.fill(sky);
      g2.setColor(Color.green);
      g2.fill(grass);
      g2.setColor(Color.yellow);
      g2.fill(sun);
      g2.setColor(Color.darkGray);
      g2.setStroke(b);
      g2.draw(treeTrunk);
      g2.setColor(Color.green);
      g2.fill(leaves);      
      b = new BasicStroke(5, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
      g2.setStroke(b);
      g2.setColor(Color.red);
      g2.draw(cat);
      eye = new Ellipse2D.Float(x + 10, getSize().height - 80, 10, 10);
      g2.setColor(Color.blue);
      g2.fill(eye);      
      eye = new Ellipse2D.Float(x + 30, getSize().height - 80, 10, 10);
      g2.fill(eye);
    }
    else//Cover the cat with the grass then repaint the cat and eyes onto the grass
    {
      //Redraw the grass to cover up the cat
      grass = new Rectangle.Float(0, getSize().height / 2, getSize().width, getSize().height);
      g2.setColor(Color.green);
      g2.fill(grass); 
      
      x = x + 1;//Move the x coordinate to the right
      
      //Redraw the 1st eye
      eye = new Ellipse2D.Float(x + 10, getSize().height - 80, 10, 10);
      g2.setColor(Color.blue);
      g2.fill(eye);
      
      //Redraw the 2nd eye
      eye = new Ellipse2D.Float(x + 30, getSize().height - 80, 10, 10);
      g2.fill(eye);
      
      //Redraw the cat
      cat = new GeneralPath();
      cat.moveTo(x, getSize().height - 100);
      cat.lineTo(x, getSize().height - 50);
      cat.lineTo(x + 50, getSize().height - 50);
      cat.lineTo(x + 50, getSize().height - 100);
      cat.lineTo(x + 40, getSize().height - 90); 
      cat.lineTo(x + 10, getSize().height - 90);
      cat.lineTo(x, getSize().height - 100);   
      
      g2.setStroke(b);
      g2.setColor(Color.red);
      g2.draw(cat); 
    }
    
     try
      {
        Thread.sleep(80);//sleep for 80 milliseconds  
      }
      catch (InterruptedException ex)
      {}
      //test to see if the right side of the cat reached the edge of the applet       
      if(x + 50 < getSize().width)
      {       
        repaint();
      }   
  }   
  public void update(Graphics g)
  {
    paint(g);    
  }  
}