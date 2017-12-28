/*Wayne Smith
  Assignment 1
  This program will show some of the C++ library functions, stream manipulators,
  and selection contol structures. The user will be promted with a menu of 4 choices.
  They can input 1 for cosines, 2 for finding logarithms, 3 for converting decimal and
  hexadecimal, and 4 to exit.*/

#include <iostream>
#include <cmath>
#include <ctime>
#include <iomanip>

using namespace std;

int main()
{
  int choice, convert;
  float num;
  char repeat = 'y';
  bool lowercase;
  cout.setf(ios::fixed|ios::showpoint);
  
  //While statement so the user can do it over and over 
  while (repeat == 'y')
    {
      repeat = 'n';
      //Prompt the user with the menu
      cout << endl << "Please make a selection from the following menu:" << endl << endl
	   << "1 - Cosines" << endl << "2 - Logarithms" << endl << "3 - Convert Decimals and Hexadecimals"
           << endl << "4 - Exit" << endl;
      cin >> choice;
	    
      //nested if else statments to decide which choice the user made 
      if(choice == 1)//cosines
	{
	  //Prompt the user to tell us what they want to find
	  cout << endl << "Please choose from the following:" << endl << "1 - Cosines" << endl << "2 - Arc Cosines"
	       << endl << "3 - Hyperbolic Cosines" << endl;
	  cin >> choice;
	  
	  //switch statement to decide what choice the user made each case includes the calcualtion for the choice
	  switch(choice)
	    {
	    case 1:
	      cout << "Please enter a floating point number in radians:";
	      cin >> num;
	      cout << "The cosine of " << setprecision(3) << num << " is " << cos(num) << endl;
	      break;
	    case 2:
	      cout << "Please enter a floating point number in radians:";
	      cin >> num;		    
	      cout << "The arc cosine of " << setprecision(3) << num << " is " << acos(num) << endl;
	      break;
	    case 3:
	      cout << "Please enter a floating point number in radians:";
	      cin >> num;
	      cout << "The hyperbolic cosine of " << setprecision(3) << num << " is " << cosh(num) << endl;
	      break;
	    default:
	      cout << "That wasn't one of the options. Would you like to try again? (y or n)" << endl;//Tell the user that their choice
	      cin >> repeat;                                                                          //was invalid and give them the option
	    }                                                                                        //to try again	    
	}
      else if(choice == 2)//logarithms
	{
	  cout << "Press 1 for common logarithms or 2 for natural logarithms:";
	  cin >> choice;
	  cout.setf(ios::showpos);
	  if(choice == 1)
	    {
	      cout << "Please enter a floating point number:";
	      cin >> num;
	      cout << "The common logarithm for " << setprecision(3) << num << " is " << log10(num) << endl;
	    }
	  else if(choice == 2)
	    {	     
	      cout << "Please enter a floating point number:";
	      cin >> num;
	      cout << "The natural logarithm for " << setprecision(3) << num << " is " << log(num) << endl;
	    }
	  else
	    {
	      cout << "That wasn't one of the options. Would you like to try again (y or n):";
	      cin >> repeat;
	      if(repeat == 'n')
		break;
	    }
	  cout.unsetf(ios::showpos);
	}
      else if(choice == 3)//convert between decimal and hexadecimal
	{
	  cout << "Which would you like to do?" << endl << "1 - Covert Decimal to Hexadecimal" << endl
	       << "2 - Convert Hexadecimal to Decimal" << endl;
	  cin >> choice;
	  cout.setf(ios::showbase);//make it so the hex numbers are prefixed
	  if(choice == 1)//convert decimal to hexadecimal
	    {
	      cout << "Enter true to use lowercase letters or false to use uppercase letters" << endl;
	      cin >> boolalpha >> lowercase;	     
	      
	      //switch statement for whether or not the user wants to use lowercase or uppcase letters
	      if(lowercase == false)//uppercase
		{
		  cout << "Enter a decimal number to convert to hexadecimal" << endl;
		  cin >> convert;
		  cout << dec << convert << " converted to hexadecimal with uppercase letters is " << hex << uppercase << convert << endl;
		}
	      else if(lowercase == true)//lowercase
		{
		  cout << "Enter a decimal number to convert to hexadecimal" << endl;
		  cin >> convert;
		  cout << dec << convert << " converted to hexadecimal with lowercase letters is " << hex << nouppercase << convert << endl;
		}	      
	    }	  	
          else if(choice == 2)//convert hexadecimal to decimal
	    {
	      cout << "Enter a hexadecimal number to convert to decimal" << endl;
	      cin >> hex >> convert;
	      cout << nouppercase << hex << convert << " converted to decimal is " << dec << convert << endl;
	    }
	  else
	    {
	      cout << "That wasn't one of the options. Would you like to try again? (y or n):";
	    }
	}
      else if(choice == 4)//exit
	{
	  break;
	}
      else//invalid option
	{
	  cout << "That is not an option. Would you like to try again? (y or n):";//error check the users choice then give them the option
	  cin >> repeat;                                                          //to try again 	  
	}
      if(repeat == 'n')
	{
	  cout << "Would you like to try again? (y or n)";
	  cin >> repeat;
	}
    }
  return 0;
}
