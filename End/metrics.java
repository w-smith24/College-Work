import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class metrics extends JApplet
{
  Font tnr = new Font("TimesRoman", Font.PLAIN, 14);
  Font cn = new Font("Courier New", Font.PLAIN, 14);
  // no init() – no components added to JApplet
  public void paint(Graphics g)
  {
    g.setFont(tnr);
// set tnr font to graphics object
    FontMetrics fm = g.getFontMetrics();
    /* create FontMetrics object from Graphics object that is set to the tnr Font */
    int leading = fm.getLeading();
// get leading of Times New Roman font
    int ascent = fm.getAscent();
    int descent = fm.getDescent();
    int height = fm.getHeight();
    System.out.println("Times New Roman Leading is " + leading);
    System.out.println("Times New Roman Ascent is " + ascent);
    System.out.println("Times New Roman Descent is " + descent);
    System.out.println("Times New Roman Height is " + height);
    g.drawString("Times New Roman", 25, 25);
// Courier New part continued
    g.setFont(cn); // change font of graphics to cn
    FontMetrics fmk = g.getFontMetrics();
    leading = fmk.getLeading();
    ascent = fmk.getAscent();
    descent = fmk.getDescent();
    height = fmk.getHeight();
    System.out.println("Courier New Leading is " + leading);
    System.out.println("Courier New Ascent is " + ascent);
    System.out.println("Courier New Descent is " + descent);
    System.out.println("Courier New Height is " + height);
    g.drawString("Courier New", 75, 75);
  }
}