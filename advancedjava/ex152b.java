/* Bill Wohlleber
 * Exercise 15-2b
 * This applet will draw random colored and random thick lines
 * */

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class ex152b extends JApplet
{
    public void paint(Graphics g)
    {
        super.paint(g);
        
        Graphics2D g2 = (Graphics2D)g;
       
        Color[] colors = {Color.blue, Color.cyan, Color.red, Color.green,
                Color.yellow, Color.pink, Color.gray, Color.lightGray,
                    Color.darkGray, Color.magenta, Color.orange};
        int y, w, c;
        float h;
        BasicStroke b;
       
        int x, i;
        GeneralPath triangle;
       
        for (i = 1; i <= 10; i++)
        {
            triangle = new GeneralPath();
                       // 1st triangle point
            x = (int)(Math.random() * 351 + 25); // random x 25 - 375
            y = (int)(Math.random() * 251 + 25); // random y 25 - 275
            triangle.moveTo(x, y);
                      // 2nd triangle point
            x = (int)(Math.random() * 351 + 25);
            y = (int)(Math.random() * 251 + 25);
            triangle.lineTo(x, y);
                      // 3rd triangle point
            x = (int)(Math.random() * 351 + 25);
            y = (int)(Math.random() * 251 + 25);
            triangle.lineTo(x, y);

            triangle.closePath();
                 // random color from array
            c = (int)(Math.random() * colors.length);
            g2.setColor(colors[c]);
                 // does the actual drawing
            g2.fill(triangle);
        }
    }
}
