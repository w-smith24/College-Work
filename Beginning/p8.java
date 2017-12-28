import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

public class p8 extends JFrame 
{ 
  
  private JLabel tempL, resultL; 
  private JTextField tempTF, displayTF; 
  private JButton celToFarB, farToCelB;
  private CelciusButtonHandler cfHandler;
  private FarButtonHandler fcHandler;
  
  
  public p8() 
  { 
    setLayout(new GridLayout(3,2)); 
    
    tempL = new JLabel("Temperature:"); 
    tempTF = new JTextField("0",10);
    resultL = new JLabel("Results:");    
    displayTF = new JTextField("",40); 
    celToFarB = new JButton("Celsius to Fahrenhiet"); 
    farToCelB = new JButton("Fahrenheit to Celsius"); 
    cfHandler = new CelciusButtonHandler(); 
    celToFarB.addActionListener(cfHandler);
    fcHandler = new FarButtonHandler();
    farToCelB.addActionListener(fcHandler);
    
    add(tempL); 
    add(tempTF); 
    add(celToFarB); 
    add(farToCelB); 
    add(resultL);
    add(displayTF); 
    displayTF.setEditable(false);  
    
    
    setTitle("Celsius and Fahrenheit Conversion"); 
    setSize(375,120); 
    setDefaultCloseOperation(EXIT_ON_CLOSE); 
    setVisible(true); 
  } 
  
  private class CelciusButtonHandler implements ActionListener 
  { 
    public void actionPerformed(ActionEvent e) 
    { 
      int c,f;
      String s;
      
      try
      {
        c = Integer.parseInt(tempTF.getText()); 
        f = celToFar(c);
        s = Integer.toString(f);
        displayTF.setText(c + " Celcius is " + f + " Fahrenheit");
      }
      catch (NumberFormatException r)
      {
        displayTF.setText("Not A Valid Number!");
        
      } 
    }
  }
  
  private class FarButtonHandler implements ActionListener 
  { 
    public void actionPerformed(ActionEvent e) 
    { 
      int c,f;
      String s; 
      try
      {
        f = Integer.parseInt(tempTF.getText()); 
        c = farToCel(f);
        s = Integer.toString(c);
        displayTF.setText(f + " Fahrenheit is " + c + " Celcius");
      }
      catch (NumberFormatException r)
      {
        displayTF.setText("Not A Valid Number!");
      }
    } 
  } 
  
  public static int farToCel(int f){
    int c; 
    c = ( f - 32 ) * 5 / 9;
    return c;
  }
  
  
  public static int celToFar(int c){
    int f; 
    f = c * 9 / 5 + 32;
    return f;
  }
  
  public static void main(String[] args) 
  { 
    p8 window = new p8(); 
  } 
}