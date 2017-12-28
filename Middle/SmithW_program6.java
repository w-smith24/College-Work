/*Wayne Smith
 *CISS111
 *Program 6 GUI takes a number and either tells if it is prime or not or gives prime factors
 *Depending on what radio button is selected*/

import java.util.*;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;


public class SmithW_program6 extends JFrame 
{ 
  
  private JRadioButton primeNumberRadio, primeFactorRadio;
  private ButtonGroup buttonGroup;
  private JLabel promptLabel, resultLabel; 
  private JTextField promptTextField, resultTextField; 
  private JButton calcButton, cancelButton;
  private CalculateButtonHandler calcHandler;
  private CancelButtonHandler cancelHandler;
  
  /*Constructor for the window*/
  public SmithW_program6() 
  { 
    setLayout(new GridLayout(4,2)); 
    
    /*Radio buttons added to a button group*/
    primeNumberRadio = new JRadioButton("Prime Numbers", true);
    primeFactorRadio = new JRadioButton("Prime Factors");
    buttonGroup = new ButtonGroup();
    buttonGroup.add(primeNumberRadio);
    buttonGroup.add(primeFactorRadio);
    
    promptLabel = new JLabel("Enter a number:"); 
    promptTextField = new JTextField("0",10);
    resultLabel = new JLabel("Results:");    
    resultTextField = new JTextField("",40); 
    calcButton = new JButton("Calculate"); 
    cancelButton = new JButton("Cancel"); 
    calcHandler = new CalculateButtonHandler(); 
    calcButton.addActionListener(calcHandler);
    cancelHandler = new CancelButtonHandler();
    cancelButton.addActionListener(cancelHandler);
    
    /*Add the radio buttons, labels, textfields, and buttons*/
    add(primeNumberRadio);
    add(primeFactorRadio);
    add(promptLabel); 
    add(promptTextField); 
    add(calcButton); 
    add(cancelButton); 
    add(resultLabel);
    add(resultTextField); 
    resultTextField.setEditable(false);  
    
    /*Set the window title and make it visible*/
    setTitle("Prime Numbers and Prime Factors"); 
    setSize(375,200); 
    setDefaultCloseOperation(EXIT_ON_CLOSE); 
    setVisible(true); 
  } 
  //Calculate Button Actions depending on what radio button is selected
  private class CalculateButtonHandler implements ActionListener 
  { 
    public void actionPerformed(ActionEvent e) 
    { 
      /*test to make sure the user enters a valid number*/
      try
      {
        //Convert the test field to an integer
        int n = Integer.parseInt(promptTextField.getText());
        //Prime Numbers
        if(primeNumberRadio.isSelected())
        {            
          int result = 1;
          if (n % 2 == 0) 
          {
            result = 0;
          }
          for(int i = 3;i * i <= n; i+=2) 
          {
            if(n % i == 0)
            {
              result = 0;
            }            
          }
          if(result == 1)
          {
            resultTextField.setText(n + " is prime");
          }
          else
          {
            resultTextField.setText(n + " is not prime");
          }
        }
        //Prime Factors
        else
        {
          ArrayList<Integer> primeFactors = new ArrayList<Integer>();  
          for (int i = 2; i <= n; i++) 
          {  
            while (n % i == 0) 
            { 
              primeFactors.add(i);              
              n /= i;
            }
          }
          resultTextField.setText(primeFactors.toString());
        }
      }
      catch (NumberFormatException r)
      {
        resultTextField.setText("Not A Valid Number. Try Again.");
      }
    }
  }  
  //Pressing the cancel button closes the program
  private class CancelButtonHandler implements ActionListener 
  { 
    public void actionPerformed(ActionEvent e) 
    { 
      System.exit(0);
    } 
  }  
  //start an instance of the window
  public static void main(String[] args) 
  { 
    SmithW_program6 window = new SmithW_program6(); 
  } 
}