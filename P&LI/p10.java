import java.util.*;
import java.util.InputMismatchException;
public class p10
{
  
  static Scanner kb = new Scanner(System.in);
  
  public static void main(String[] args) 
  { 
    int[] seqArray = new int[1000]; 
    int[] binArray = new int[1000]; 
    int x, num, binNum, seqNum; 
    P10Class search;
    
    search = new P10Class();
    
    for (x = 0; x < seqArray.length; x++) 
    { 
      seqArray[x] = (int) (Math.random() * 1000 + 1); 
      binArray[x] = seqArray[x];
    } 
    
    Arrays.sort(binArray);
    
    System.out.println("1000 random numbers from 0 to 999 have been generated\n");
    System.out.print("Enter an integer to search the arrays (EOF to stop): ");
    boolean y = true;
    while (y == true)
    {
      try
      {
        while ( kb.hasNext() )
        {
          
          num = kb.nextInt();
          
          binNum = search.bin_search(binArray,num); 
          seqNum = search.seq_search(seqArray,num);
          
          if(seqNum == -1)
            System.out.printf("sequential search did not find the value %d with  %d items scanned.%n",num ,search.SEQ_NUM);
          else
            System.out.printf("sequential search found the value %d in element %d with %d items scanned.%n",num, seqNum, search.SEQ_NUM);
          
          if(binNum == -1)
            System.out.printf("binary search did not find the value %d with %d items scanned.%n%n",num ,search.BIN_NUM);
          else
            System.out.printf("binary search found the value %d in element %d with %d items scanned.%n%n",num, binNum, search.BIN_NUM);
          
          System.out.print("Enter an integer to search the arrays (EOF to stop): ");
          
        }
      }
      catch (InputMismatchException e)
      {
        System.out.println("That was not an integer, please try again.");
        kb.nextLine();
        System.out.print("\nEnter an integer to search the arrays (EOF to stop): ");
      }
    }
  }
}



