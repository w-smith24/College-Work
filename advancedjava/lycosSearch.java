/*Wayne Smith
 * This Applet will recreat a Lycos search page using manual positioning*/

import java.awt.*;
import javax.swing.*;
public class lycosSearch extends JApplet
{
  Image lycos;
  JCheckBox webCheck = new JCheckBox("Web");
  JCheckBox imgCheck = new JCheckBox("Image");
  JButton searchButton = new JButton("Search");
  JTextField textField = new JTextField(50);
  Container c;
  
  public void init()
  {
    setSize(600,300);
    lycos = getImage(getDocumentBase(), "lycos.png");
    c = getContentPane();
    c.setLayout(null);
    c.setBackground(Color.cyan);
    webCheck.setBackground(Color.cyan);
    webCheck.setForeground(Color.blue);
    webCheck.setBounds(280, 40, 75, 20);
    c.add(webCheck); 
    imgCheck.setBackground(Color.cyan);
    imgCheck.setForeground(Color.blue);
    imgCheck.setBounds(360, 40, 75, 20);
    c.add(imgCheck);
    textField.setBounds(285, 60, 180, 25);
    c.add(textField);
    searchButton.setForeground(Color.blue);
    searchButton.setBounds(470, 60, 95, 25);
    c.add(searchButton);
  }
  public void paint(Graphics g)
{
    super.paint(g);
    g.drawImage(lycos, 20, 40, this);
    
  }
  public void update(Graphics g)
  {
    paint(g);
  }
}