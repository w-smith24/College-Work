/* Wayne Smith
 * CISS111
 * Program 8 will display the prime factors of a number
 * using recursion*/

import java.util.*;

public class SmithW_program8
{  
  //Method to determine if the factor is prime
  public static boolean isPrime(int num)
  {
    //test for numbers less than 2 because they aren't prime
    if(num < 2)
    {
      return false;
    }
    //test to see if the number has factors
    for(int i = 2; i < num; i ++)
    {
      if(num % i == 0) 
        return false;
    }
    
    return true;
  }  
  //array to store the prime factors
  public static ArrayList<Integer> primeFactorsList = new ArrayList<Integer>();  
  //Method to get the factors of the number then pass them to isPrime to determine if they are prime
  public static ArrayList primeFactors(int num, int num2)
  {    
    //if the number is prime add it to the arrayList
    if(isPrime(num))
    {
      primeFactorsList.add(num);      
      return primeFactorsList;
    }      
    else if(num % num2 == 0)
    {
      primeFactors(num2, num2 -1); 
      primeFactors(num / num2, (num / num2) - 1);              
    }
    else
    {
      primeFactors(num, num2 - 1);
    }
    //return the arrayList to be printed
    return primeFactorsList;
  }
  
  public static void main(String[] args) throws Exception
  { 
    Scanner kb = new Scanner(System.in);
    String input;  
    int number = 0;
    //prompt the user for a number    
    System.out.println("Enter a number and this program will display the prime factors:");
    input = kb.nextLine();
    try
    {
      //convert the users input to an integer
      number = Integer.parseInt(input);
      // if number is 0 will display that it doesn't have any prime factors
      if(number!=0)
        System.out.println(primeFactors(number, number - 1));
      else
        System.out.println(number + " has no prime factors");
    }
    //catch if the user enters a 1 or not a number
    catch(Exception e)
    {
      if(number == 1)
        System.out.println(number + " has no prime factors");
      else
        System.out.println("That was not a number");
    } 
  }
} 