import java.util.*;
import java.math.*;

public class p5 {
  
  static Scanner kb = new Scanner(System.in);
  
  public static void main (String[] args) {
    
    int inputNum, sum = 0;
    int numValid = 0, numInvalid = 0;
    double average;
    
    System.out.print("Enter a positive value (CTRL-D to quit): ");
    
    while ( kb.hasNext() ){
      inputNum = kb.nextInt();  
      
      if(inputNum < 0){
        System.out.printf("The number %d is invalid.%n", inputNum);
        numInvalid++;
      }
      else{
        sum = sum + inputNum;
        numValid ++;      
      }
      
      System.out.print("Enter a positive value (CTRL-D to quit): ");
      
    }
    
    if(numValid != 0){
      average = (double)sum / numValid;
      System.out.printf("There were %d valid numbers entered.%n", numValid);
      System.out.printf("The sum of the valid numbers was %d and the average was %.2f%n", sum, average); 
      System.out.printf("There were %d invalid numbers entered.%n", numInvalid);
    }
    else if(numInvalid != 0){
      System.out.println("You only entered invalid numbers.");
    }
    else{
      System.out.println("There were no valid or invalid numbers entered.");
    }
    
  }

}