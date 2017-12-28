/* Wayne Smith
 * Exercise 16-4
 * This program will use a toolbar and menubar to pick a graphic
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ex164 extends JApplet implements ActionListener
{
    JButton b = new JButton("Brosius");
    JButton m = new JButton("Martinez");
    JButton j = new JButton("Jeter");
    JToolBar bar = new JToolBar(SwingConstants.VERTICAL);

    JMenuItem br = new JMenuItem("Brosius");
    JMenuItem ma = new JMenuItem("Martinez");
    JMenuItem je = new JMenuItem("Jeter");
    JMenu homers = new JMenu("Home Runs");
    JMenuBar mbar = new JMenuBar();
    Container c;
    Image bros, mart, jet;

    public void init()
    {
        setSize(500, 500);
        c = getContentPane();
        c.setLayout(new FlowLayout());
        
        /* set hot keys, add buttons to the toolbar, add the toolbar into the
           applet, listen to the buttons, and get the images */
        // then add menu bar with menu and menu items
        
        //set the hot keys for each button with text
        b.setMnemonic('b');
        b.setToolTipText("Brosius");
        m.setMnemonic('m');
        m.setToolTipText("Martinez");
        j.setMnemonic('j');
        j.setToolTipText("Jeter");
        //add the buttons to the toolbar
        bar.add(b);
        bar.add(m);
        bar.add(j);
        c.add(bar);
        //add the ActionListener flor each button
        b.addActionListener(this);
        m.addActionListener(this);
        j.addActionListener(this);
        //get the image files
        bros = getImage(getDocumentBase(), "brosius1.jpeg");
        mart = getImage(getDocumentBase(), "martinez1.jpeg");
        jet = getImage(getDocumentBase(), "jeter1.jpeg");
        //set the JMenuBar for the applet
        setJMenuBar(mbar);
        //add the MenuItems to the menu
        homers.add(br);
        homers.add(ma);
        homers.add(je);
        //add the menu to the MenuBar
        mbar.add(homers);
        //add the ActionListener for the MenuItems
        br.addActionListener(this);
        ma.addActionListener(this);
        je.addActionListener(this);          
        
    }

    public void actionPerformed(ActionEvent e)
    {
        Graphics g = getGraphics();  // to draw
        paint(g);  // clear screen

        // add e.getSource() being the menu items (or toolbar) to if tests
 // if click on b button draw brosius at 100, 100     
        if (e.getSource() == b) 
            g.drawImage(bros, 100, 100, this);
        else if (e.getSource() == m)
            g.drawImage(mart, 100, 100, this);
        else if (e.getSource() == j)
            g.drawImage(jet, 100, 100, this);
        else if (e.getSource() == br)
            g.drawImage(bros, 100, 100, this);
        else if (e.getSource() == ma)
            g.drawImage(mart, 100, 100, this);
        else if (e.getSource() == je)
            g.drawImage(jet, 100, 100, this);
    }
}