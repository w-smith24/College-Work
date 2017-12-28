/* Wayne Smith
Exercise 4-13f
This program will make a student structure
*/
#include<iostream>
#include"student4-13.h"   // define student and address structures
using namespace std;

void printstudent(student*, student*);

int main()
{
    student s[2];  // array of two student structures
    student* endptr;
    int i, j;

    for (i = 0; i < 2; i++)
    {
    cout << "Enter Student First Name:  ";
    cin >> s[i].first;   // input into the ith student's first name field
    cout << "Enter Student Last Name:  ";
    cin.ignore(1, '\n');   // clear enter
    cin >> s[i].last;
    cout << "Enter Street Address:  ";
    cin.ignore(1, '\n');
    cin.getline(s[i].home.street, sizeof(s[i].home.street), '\n'); /* whole line for street*/
    cout << "Enter City:  ";
    cin.getline(s[i].home.city, sizeof(s[i].home.city), '\n');
    cout << "Enter State (ex. NY):  ";
    cin >> s[i].home.state;
    cout << "Enter Zip Code:  ";
    cin.ignore(1, '\n');
    cin >> s[i].home.zip;
    cout << "Enter Class Year:  ";
    cin >> s[i].year;
    cout << endl;
    }
    endptr = s + sizeof(s)/sizeof(s[0]);//point to the end of s
    printstudent(s, endptr);
            // pass student array to separate function - student pointer
    return 1;
}

void printstudent(student* x, student* y)
{
  while(x < y)//While x is not pointing to the end of the array of students
    {    
      cout << "\n\n";    // change to print fields using pointer and arrow operator
      cout << x->first << " " << x->last << "  " << x->year << endl;
      cout << x->home.street << endl;
      cout << x->home.city << ", " << x->home.state << "  " << x->home.zip << endl;
      x++;
    }
}
