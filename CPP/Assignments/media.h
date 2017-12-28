/* Wayne Smith
Assignment 4 Super media class
This class will define a super media class with name and price
data fields. It will be able to construct itself. It will have a 
virtual print function and overload the > operator. 
*/
#ifndef media_h
#define media_h
#include<iostream>
#include<iomanip>
#include<cstring>
using namespace std;

class media
{
 protected:
  char name[50];
  float price;

 public:
  media()
    {
      *name = '\0';
      price = 0.00;
    }
  media(char sname[], float p)//media constructor
    {
      strcpy(name, sname);
      price = p;
    }

  virtual void print()//virtual print of the super media class
  {
    cout.setf(ios::fixed|ios::showpoint);
    cout << "Name is " << name << endl;
    cout << "Price is " << setprecision(2) << price << endl;
  }

  bool operator<(media med)//overload the < operator
  {
    if(strcmp(name, med.name) > 0)
       return true;
    else
       return false;
  }
};

#endif
