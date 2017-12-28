/*Wayne Smith
 *CISS111
 *Program 5 reads a users file and outputs to a file each word of the
 *users file and how many times that word was found in the users file*/ 

import java.io.*;
import java.util.*;
import javax.swing.*;

public class SmithW_program5
{
  public static void main(String args[]) throws Exception
  {
    boolean found = false;
    Scanner scanFile = null;
    String fileName, word, outFileName, input;    
    ArrayList<Word> words = new ArrayList<>();
    //Loop until a file is found
    while(!found)
    {
      //Prompt the user for a filename then test to see if the file exists 
      fileName = JOptionPane.showInputDialog("Enter the name of a file: ");    
      
      try
      {
        File file = new File(fileName);
        scanFile = new Scanner(new FileReader(file));
        found = true;
      }
      catch(Exception e)
      {
        JOptionPane.showMessageDialog(null, "That file was not found. Please try again.");
      }
    }
    //loop the read the file word by word
    while(scanFile.hasNext())
    {          
      found = false;
      try
      {         
        //Scan the next word, put it to lowercase and strip all the puncuation and numbers
        word = scanFile.next();
        word = word.toLowerCase();
        String nWord = "";
        
        for(int i = 0; i < word.length(); i++)
        {
          char ch = word.charAt(i);          
          if(Character.isAlphabetic(ch))
          {
            nWord = nWord + ch;
          }
        }        
        //For loop to look for the word in the array. If it isn't found then it will be added to the array        
        for(int j = 0; j < words.size(); j++)
        {          
          if(nWord.equals(words.get(j).getWord()))
          {            
            words.get(j).incrementWord();
            found = true;
            break;
          }            
        }
        if(!found)
        {
          words.add(new Word(nWord));
        }        
      }      
      catch(Exception e)
      {
        JOptionPane.showMessageDialog(null, "All done reading the file");
        scanFile.close();
      }       
    }
    //Ask user if they want to write results to a file
    input = JOptionPane.showInputDialog("Would you like to write the results to a file? Y or N");
    //test users input. If y then write the file. Else print to console
    if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"))
    {
      //Prompt user for an output filename
      outFileName = JOptionPane.showInputDialog("Please enter a filename for the output data: ");
      FileWriter fw = new FileWriter(outFileName);
      //For loop to write all the words and counts to the output file
      for(int i = 0; i < words.size(); i++)
      {      
        fw.write(words.get(i).toString());
      } 
      fw.close();
      JOptionPane.showMessageDialog(null, "Finished writing " + outFileName);
    }
    else
    {
      //for loop to print all words and counts to the console
      for(int i = 0; i < words.size(); i++)
      {      
        System.out.println(words.get(i).toString());
      } 
    }
  }
}
