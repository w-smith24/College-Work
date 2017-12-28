/* Wayne Smith
 * CISS111
 * This program will out put a portion of a poem depending on what month and year the user inputs*/

import java.util.*;

public class SmithW_program1
{
  
  static Scanner kb = new Scanner(System.in);
  
  public static void main(String[] args) 
  { 
    //define an ArrayList 
    ArrayList<String> months = new ArrayList<String>();
    //add the months to the ArrayList
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
    
    //Variables
    String input = "";
    int year, index;
    boolean leapYear;
    boolean validMonth = false;//initialized to false to run the while loop
    
    leapYear = false;
    
    //Loop to keep prompting the user if they don't enter a valid month
    while(!validMonth)
    {
      System.out.print("Enter a month.");
      
      input = kb.nextLine();
      input = input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();//capitalize the users input so they can enter uppercase or lowercase months
      
      //This is my test to see if the users input is a valid month and break the loop if it is a valid month
      for(String word : months)
      {
        if(input.equals(word))
        {
          validMonth = true;
          break;          
        }
      } 
      
      //re-prompt the user if they enter an invalid month
      if(validMonth == false)
      {
        System.out.println("You did not enter a valid month please try again.");
      }
      
    }
        
    System.out.print("Enter a year.");
    
    year = kb.nextInt();  
    
    leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);//determine if the year entered is a leap year
    
    index = months.indexOf(input);//determine what month was entered
    
    //Output specific to what the user entered
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
