import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class metrics2 extends JApplet
{
  Font tnr = new Font("TimesRoman", Font.PLAIN, 14);
  
  public void paint(Graphics g)
  {
    g.setFont(tnr);
    FontMetrics fm = g.getFontMetrics();
    int height = fm.getHeight();
// get height of Times New Roman font
    int width = fm.stringWidth("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
// get width of alphabet string
    g.drawString("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", 1, 25);
    g.drawString("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 1, 
                 25 + height);
    /* draw 1st half of 2nd line height pixels under the 1st line by adding height of font to y coordinate */
    g.drawString("abcdefghijklmnopqrstuvwxyz", 1 + width, 
                 25 + height);
    /* draw 2nd half of 2nd line at same height as 1st half of 2nd line, but width pixels over so it starts right at the end of the 1st half */
  }
}