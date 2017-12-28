/* Wayne Smith
   Assignment 2
   This program will take a user inputed c-string and determine if it is a palindrome
   or not. It will use user defined functions. The first will remove any spaces, punctuations, and
   make any uppercase letter lowercase. Then it will copy the c-string back to the original.
   The second will determine if the c-string is a palindrome.*/

#include <iostream>
#include <cstring>
using namespace std;

void edit(char[]);
bool palindrome(char[]);

int main()
{
  char cstr[50];
  bool test;
  
  cout << "Please enter a c-string:" << endl;
  cin.getline(cstr, sizeof(cstr), '\n');
  
  edit(cstr);//remove all punctuation and spaces and make uppercase lowercase
  
  test = palindrome(cstr);//test to see if cstr is a plaindrome
  
  if(test == true)//print cstr and whether or not the cstr is a palindrome
    cout << cstr << " is a palindrome" << endl;
  else
    cout << cstr << " is not a palindrome" << endl;
}

//Function to remove spaces and punctuation and make uppercase lowercase
void edit(char str[])
{
  char *tokenptr;
  char temp[50] = "\0";
  int i = 0;
  //make all uppercase letter lowercase
  for(int i = 0; i < strlen(str); i++)
    {
      str[i] = tolower(str[i]);
    }
  //remove the spaces and punctuation
  tokenptr = strtok(str, " ,.!?;:@#&");
  while(tokenptr != '\0')
    {
      strcat(temp, tokenptr);
      tokenptr = strtok('\0', " ,.!?;:@#&");
    }
  strcpy(str, temp);  
}

//Function to test if the cstring is a palindrome or not
bool palindrome(char str[])
{
  char pal[50] = "\0";
  int length, rev;
  char ch;
  
  length = strlen(str);
  rev = length - 1;
  //fill pal with the reverse of str
  for(int i = 0; i < length; i++)
    {
      ch = str[rev];
      pal[i] = ch;
      rev--;      
    }
  //compare the cstrings and if they match return true. If not return false
  if(strcmp(str, pal) == 0)
    return true;
  else
    return false;
}

	      
