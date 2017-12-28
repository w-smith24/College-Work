//Wayne Smith
//CISS111
//Project 4 String Analyzer using dialog boxes. Will loop until user decides to stop

import java.util.*;
import javax.swing.*;

public class SmithW_program4
{
  //Method to get the # of vowels in the string
  public static int getVowelCount(String s)
  {
    int count=0;
    int i;
    s = s.toLowerCase();
    
    for(i = 0; i < s.length(); i++){
      if((s.charAt(i) == 'a') || 
         (s.charAt(i) == 'e') ||
         (s.charAt(i) == 'i') || 
         (s.charAt(i) == 'o') ||
         (s.charAt(i) == 'u'))         
        count++;
    }
    return count;
  }
  //Method to get the # of Consonants in the string
  public static int getConsonantCount(String s)
  {
    int count=0;
    int i;
    char ch;
    s = s.toLowerCase();
    
    for(i = 0; i < s.length(); i++){
      ch = s.charAt(i);
      if(((ch != 'a') && 
         (ch != 'e') &&
         (ch != 'i') && 
         (ch != 'o') &&
         (ch != 'u')&& Character.isLetter(ch)))
        count++;
    }
    return count;
  }
  //Method will return the string Backwards
  public static String Backwards(String s)
  {
    StringBuilder backwardsString = new StringBuilder();
    for(int i = s.length() - 1; i >= 0; --i)
      backwardsString.append(s.charAt(i));
    return backwardsString.toString();
  }
  //Method to get the number of whitespaces in the string
  public static int getWhiteSpace(String s)
  {
    int count=0;
    int i;
    char ch;
    for(i = 0; i < s.length(); i++){
      ch=s.charAt(i);
      if(Character.isWhitespace(ch))
        count++;    
    }
    return count;
  } 
  //Method to get the number of Digits in the string
  public static int getDigits(String s)
  {
    int count=0;
    int i;
    char ch;
    for(i = 0; i < s.length(); i++)
    {
      ch=s.charAt(i);
      if(Character.isDigit(ch))
        count++;    
    }
    return count;
  }  
  
  public static void main(String[] args)
  {
    //Prompt the user for a String then display what each method returns. 
    //This will loop until the user decides they are done usng a do while loop
    String inputString;
    
    do{
    inputString = JOptionPane.showInputDialog("Please enter a string to be analyzed: ");
    
    JOptionPane.showMessageDialog(null, "The Vowel Count is: " + getVowelCount(inputString));
    JOptionPane.showMessageDialog(null, "The Consonant Count is: " + getConsonantCount(inputString));
    JOptionPane.showMessageDialog(null, "The String Backwards is: " + Backwards(inputString));
    JOptionPane.showMessageDialog(null, "The Number of Whitespace Characters is: " + getWhiteSpace(inputString));
    JOptionPane.showMessageDialog(null, "The Number of Digits is: " + getDigits(inputString));
    
    inputString = JOptionPane.showInputDialog("Would you like to try another string? yes or no ");
    
    inputString = inputString.toLowerCase();
    
    }while(inputString.equals("yes") || inputString.equals("y"));
        
    JOptionPane.showMessageDialog(null, "Thanks for using this String Analyzer. Good-Bye");
    
  }
  
}