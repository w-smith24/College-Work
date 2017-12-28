/* Wayne Smith
Assignment 4 book class
This class will define a book class
*/

#include<iostream>
#include"media.h"
#include<cstring>
using namespace std;

class book : public media
{
 private:
  char author[30];
 public:
  book() : media()
  {
    strcpy(author, " ");
  }	
  book(char sname[], float p, char auth[]) : media(sname, p)
  {		
    strcpy(author, auth);
  }
  void print()//print the book data
  {
    cout << "Book" << endl;
    media::print();//call super print to print name and price
    cout << "Author is " << author << endl;
  }
};
