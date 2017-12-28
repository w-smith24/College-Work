/* *Wayne Smith
   Assignment 4
       This program will declare an array of 3 super media pointers
   It will use a loop to prompt the user to input all the data fields
   for the media type the user chooses. Ayt the end of the loop it will
   construct the next object(of the given media type) and insert it into
   the array. */

#include <iostream>
#include "media.h"
#include "book.h"
#include "movie.h"
using namespace std;

void sort(media *[], int);

int main()
{
  media *med[3]; //array of media pointers
  int i;
  char name[30], rating[3], author[30], mediatype;
  float price;
  //loop to prompt the user for the data and assign the media to the array
  for(i = 0; i < 3; i++)
    {
      cout << "Enter name: ";
      cin.getline(name, sizeof(name), '\n');
      cout << "Enter price: ";
      cin >> price;
      cin.ignore(1, '\n');   
      cout << "Is media a book(b) or a movie(m): ";
      cin >> mediatype;
      cin.ignore(1, '\n');   
      if(mediatype == 'b')//if the mediatype is a book do this
	{
	  cout << "Enter author: ";
	  cin.getline(author, sizeof(author), '\n');
	}
      else if(mediatype == 'm')//if the mediatype is a movie do this
	{
	  cout << "Enter rating: ";
	  cin >> rating;
	  cin.ignore(1, '\n');
	}
     
      if(mediatype == 'b')
	med[i] = new book(name, price, author);//book
      if(mediatype == 'm')
	med[i] = new movie(name, price, rating);//movie
      cout << endl;
    }
  sort(med, 3);
  //loop to print each media
  for(i = 0; i < 3; i++)
    {
      med[i]->print();
      cout << endl;
    }
  return 0;
}

//function to sort the array of medias
void sort(media *m[], int N)
{
  int pass, j, min;
  media *temp;
  for (pass = 0; pass <= N - 1; pass++)  // passes
    {
      min = pass;
      for (j = pass + 1; j < N; j++)  // in each pass
	if (*m[min] < *m[j])
	  min = j;
      temp = m[min];
      m[min] = m[pass];
      m[pass] = temp;
    }
}


