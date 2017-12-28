import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class metrics3 extends JApplet
{
  Font tnr = new Font("TimesRoman", Font.PLAIN, 14);
  
  public void paint(Graphics g)
  {
    g.setFont(tnr);
    FontMetrics fm = g.getFontMetrics();
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int height = fm.getHeight();
    int width = fm.stringWidth(alphabet);
    int leading = fm.getLeading();
    int ascent = fm.getAscent();
    int descent = fm.getDescent();
    int border = 5;
    int x = 30, y = 50; // lower left of string
    g.setColor(Color.blue);
    g.drawString(alphabet, x, y); // draw alphabet string
    g.drawRect(x  border, y ‑ (ascent + leading + border), width + 2 * border, height + 2 * border);
    /* draw rectangle starting border back from left of string, ascent, leading, & border up from bottom of string, with width of string plus the border to left & right, with height of string plus the border to top & bottom */
  }
}