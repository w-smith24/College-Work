import java.util.*;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

public class CrapsGUI extends JFrame
{
  
  
  private JLabel die1L, die2L, totalL;
  private JTextField die1TF, die2TF, totalTF, resultTF;
  private JButton rollDice;
  private Die1ButtonHandler d1Handler;
  
  public CrapsGUI()
  {
    
    setLayout(new GridLayout(4,4));
    die1L = new JLabel("Die 1");
    die1TF = new JTextField("0",40);
    die2L = new JLabel("Die 2");
    die2TF = new JTextField("0",40);    
    rollDice = new JButton("Roll Dice");
    d1Handler = new Die1ButtonHandler();
    rollDice.addActionListener(d1Handler);   
    totalL = new JLabel("Total");
    totalTF = new JTextField("0",40);
    resultTF = new JTextField("",40);
    
    add(die1L);
    add(die1TF);
    add(die2L);
    add(die2TF);
    add(totalL);
    add(totalTF);
    add(rollDice);
    add(resultTF);
    
    die1TF.setEditable(false); 
    die2TF.setEditable(false); 
    resultTF.setEditable(false); 
    totalTF.setEditable(false);
    
    setTitle("Craps Game"); 
    setSize(375,120); 
    setDefaultCloseOperation(EXIT_ON_CLOSE); 
    setVisible(true); 
  }
  
  private class Die1ButtonHandler implements ActionListener 
  { 
    public void actionPerformed(ActionEvent e) 
    {  
      int d1, d2, total;
      String s;
      
      Die die1 = new Die();
      Die die2 = new Die();
      
      d1 = die1.rollDie();
      d2 = die2.rollDie();
      total = d1 + d2;
      
      die1TF.setText(d1 + "");
      die2TF.setText(d2 + "");
      totalTF.setText(total + "");
      
      if(total == 2 || total == 3 || total == 12)
      {
        resultTF.setText("You Lose!!");
      }
      else if(total == 7 || total == 11)
      {
        resultTF.setText("You WIN!!!");
      }
      else
      {
        resultTF.setText("Roll Again");
      }
      
      
    }
  }
  
  
  public static void main(String[] args) 
  { 
    CrapsGUI game = new CrapsGUI();
  }
}  