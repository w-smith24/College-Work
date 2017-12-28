import java.util.*;
import java.math.*;

public class p4 {
  
  static Scanner kb = new Scanner(System.in);
  
  public static void main (String[] args) {
    
    int x, lowerBound, upperBound;
    double square, squareRoot;
    
    System.out.print("Please enter a lower bound number:");
    lowerBound = kb.nextInt();
    System.out.print("Please enter an upper bound number:");
    upperBound = kb.nextInt();
    
    if (lowerBound <= upperBound) {
      
      for (x = lowerBound; x <= upperBound; x++) {
        
        square = Math.pow(x,2);
        squareRoot = Math.sqrt(x);
        
        System.out.printf("For the value %d the square is %.2f the square root is %.2f.%n", x, square, squareRoot);
        
      }
      
    }
    else { 
      
      System.out.println("The lower bound is greater than the upper bound.\nNo work will be performed.");
      
    }  
    
  } 
  
}   

