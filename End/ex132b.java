import java.io.*;
import java.util.*;

public class ex132b
{
  public static void main(String[] args) 
    throws IOException, Exception 
  {
    
    InputStream is;  // super input stream
    OutputStream os;  // super output stream
    int value;
    String filenamein, filenameout, name;
    BufferedReader br = new
      BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    File fout, fin;
    try
    {
      System.out.print("Enter input filename:  ");
      filenamein = br.readLine();
      fin = new File(filenamein); // file object connected to input file
      System.out.print("Enter output filename:  ");
      filenameout = br.readLine();
      fout = new File(filenameout); // file object connected to output file
      is = new FileInputStream(fin); // file streams connected to objects
      os = new FileOutputStream(fout);
      System.out.println("Enter employee names and numbers (EOF to END):");
      value = is.read();  // read one character from input file
      name = sc.nextLine();
      while (sc.hasNext()) // while not eof marker -1
      {
        for(int i = 0; i < name.length(); i++)
        {
          os.write(name.charAt(i)); // write one character to output file
        }
        System.out.println("Enter employee names and numbers (EOF to END):");
      }
      is.close(); // close streams
      os.close();
      System.out.println("\n" + fout + " created");
    }
    catch(IOException e) // read of write problems
    {
      e.printStackTrace();
    }
  }
}