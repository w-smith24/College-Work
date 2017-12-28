/* I can't get Eclipse to work at the moment so I did this in DrJava.
 * I will work on getting Eclipse to work for the next project
 * Wayne Smith
 * Exercise 13-3
 * This program will input into a file using binary streams */

import java.io.*;
import java.util.*;
public class ex133
{
  public static void main(String[] args) throws IOException
  {
    DataInputStream is;//Variables
    DataOutputStream os;
    int value;
    String filenamein, filenameout, name;
    BufferedReader br = new
      BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    FileOutputStream fout;
    FileInputStream fin;
    System.out.print("Enter output filename:  ");//prompt the user for the output filename
    filenameout = br.readLine(); //get the output filename from the user   
    fout = new FileOutputStream(filenameout);//create a file for outputting
    os = new DataOutputStream(fout);//connect the DataOutputStream to FileOutputStream
    
    try
    {
      System.out.println("Enter the employee name (CNTRL-D to quit): ");//Prompt the user for the employee name
      name = br.readLine();//assign input to name using BufferedReader
      
      while(true)//Enter the loop 
      {
        if(name == null || name.equals("")) break;//exit the loop if the user doesn't enter an employee name
        
        System.out.println("Now enter the employee number: ");//prompt the user for the employee number
        
        value = sc.nextInt();//read the employee number using scanner and assign it to value
        
        os.writeUTF(name);//write the name to the file
        os.writeInt(value);//write the int to the file        
        
        System.out.println("Enter the employee name (CNTRL-D to quit): ");//re-prompt the user for the employee name
        name = br.readLine();
      }
      
      os.close();//close the output streams
      fout.close();
      System.out.println("\n" + filenameout + " created");
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
    catch(NullPointerException ne) {}//Catch the empty name
    
    fin = new FileInputStream(filenameout);//create the input file
    is = new DataInputStream(fin);//connect the DataInputStream to the FileInputStream
    try
    {
      while(true)//Enter the loop
      {        
        System.out.println(is.readUTF() + " " + is.readInt());//display the names and number from the output file
      }
    }
    catch(EOFException ef)//catch the end of file
    {
      System.out.println("That's the end of the file.");
    }
    is.close();//close the inout streams
    fin.close();
  }
}
