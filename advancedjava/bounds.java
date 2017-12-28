import java.awt.*;
import javax.swing.*;
public class bounds extends JApplet
{
  JLabel lab1 = new JLabel("Label 1");
  JTextField field1 = new JTextField(10);
  JButton but1 = new JButton("Button 1");
  JLabel lab2 = new JLabel("Label 2");
  Container c;
  
  public void init()
  {
    c = getContentPane();
    c.setLayout(null); // take off layout manager
    lab1.setBounds(50, 100, 50, 30); // x, y, width, height
    c.add(lab1); // add to container with our coordinates
    field1.setBounds(110, 100, 200, 30);
    c.add(field1);
    but1.setBounds(130, 140, 100, 30); // 180 is half way
    c.add(but1);
    lab2.setBounds(130, 170, 100, 30);
    lab2.setHorizontalAlignment(JLabel.CENTER); 
// center in oversized bounds
    c.add(lab2);
  }
}