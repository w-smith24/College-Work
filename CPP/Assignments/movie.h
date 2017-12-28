/* Wayne Smith
Assingment 4 movie class
This class will define a movie class
*/

#include<iostream>
#include"media.h"
#include<cstring>
using namespace std;

class movie : public media
{
 private:
  char rating[3];
 public:
  movie() : media()
    {
      strcpy(rating, " ");
    }
  movie(char sname[], float p, char rat[]) : media(sname, p)
    {
      strcpy(rating, rat);
    }
  void print()//print the movie data
  {
    cout << "Movie" << endl;
    media::print();//call super print to print the name and price
    cout << "Rating is " << rating << endl;
  }
};
