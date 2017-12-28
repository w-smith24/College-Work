import java.util.*;

public class p7 {
  
  static Scanner kb = new Scanner(System.in);
    
  public static char displayMenu() {
    char choice;
    boolean valid;
    valid = false;
    do{
      
      System.out.println("\nPlease select one of the following:\n");
      System.out.println("\tF - To convert Fahrenheit to Celsius");
      System.out.println("\tC - To convert Celsius to Fahrenheit");
      System.out.println("\n\tQ - To Quit.");
      System.out.print("Choice: ");
      choice = Character.toUpperCase(kb.next().charAt(0));
      switch (choice) 
      { 
        case 'F': case 'C': case 'Q': 
          valid = true; 
          break;
      }
    }
    while(! valid);
    return choice;
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
 
  
  public static void main (String[] args) { 
    
    char choice;
    int f, c;
    do{
      
      choice = displayMenu();
      
      if(choice =='F'){
        System.out.print("Enter the Fahrenheit temperature:  ");
        f = kb.nextInt();
        c = farToCel(f);
        System.out.printf("The Temperature %d Fahrenheit is %d Celsius.%n", f, c);
      } 
      else if(choice == 'C'){
        System.out.print("Enter the Celcius temperature:  ");
        c = kb.nextInt();
        f = celToFar(c);
        System.out.printf("The Temperature %d Celcius is %d Fahrenheit.%n", c, f);
      }
    }
    while(choice != 'Q');
  }
} 