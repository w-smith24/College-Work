import java.util.*;

public class SmithW_program1
{
  
  static Scanner kb = new Scanner(System.in);
  
  public static void main(String[] args) 
  { 
    
    ArrayList<String> months = new ArrayList<String>();
    
    months.add("January");
    months.add("February");
    months.add("March");
    months.add("April");
    months.add("May");
    months.add("June");
    months.add("July");
    months.add("August");
    months.add("September");
    months.add("October");
    months.add("November");
    months.add("December");
    
    String input = "";
    int year, index;
    boolean leapYear;
    boolean results = false;
    
    leapYear = false;
    
    while(!results)
    {
      System.out.print("Enter a month.");
      
      input = kb.nextLine();
      input = input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();
      for(String word : months)
      {
        if(input.equals(word))
        {
          results = true;
          break;          
        }
      } 
      
      if(results == false)
      {
        System.out.println("You did not enter a valid month please try again.");
      }
      
    }
    
    index = months.indexOf(input);
    
    System.out.print("Enter a year.");
    
    year = kb.nextInt();  
    
    leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    
    if(index == 8)
      System.out.println("Thirty days hath September");
    else if(index == 3 || index == 5 || index == 10)
      System.out.println("April, June, and November");
    else if(index == 1 && leapYear == false)
      System.out.println("with February's 28 to make it fun.");
    else if(index == 1 && leapYear == true)
      System.out.println("Leap Year happening one in four, Gives February one day more.");
    else
      System.out.println("all the rest have thirty-one");
  }
}
