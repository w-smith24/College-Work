/*Wayne Smith
  Assignment 3
  This program will pass three integers by reference to refrandom. In refrandom each integer will 
  be assigned a random number between 1 and 30. Then in main each randomly generated integer will be passed to 
  pointfill along with the specific character and the array address. In pointfill each array will be filled
  with the assigned character up to the integer spot in the array. Then after the array is full a '/0' will be
  inserted into the last spot to complete the cstring. Each array will be printed on a separate line and then a 
  winner will be announced.
*/

#include <iostream>
#include <cmath>
#include <ctime>
using namespace std;

void refrandom(int*, int*, int*);
void pointfill(int, char, char*);

int main ()
{
  int a, b, c;
  char cstr1[30], cstr2[30], cstr3[30];
  refrandom(&a, &b, &c);//generate random integers for each variable
  cout << a << " " << b << " " << c<< endl;//print the random integers
  //fill the arrays using pointfill
  pointfill(a, '@', cstr1);
  pointfill(b, '~', cstr2);
  pointfill(c, ';', cstr3);
  cout << cstr1 << endl << cstr2 << endl << cstr3 << endl;
  //if else statement to decide which character won
  if(a > b && a > c)
    cout << "@ is the winner!!!!" << endl;
  else if(b > c && b > a)
    cout << "~ is the winner!!!!" << endl;
  else
    cout << "; is the winner!!!!" << endl;
  
  return 1;
}

//Function to randomly generate 3 numbers and assign them to each integer variable passed by reference
void refrandom(int* x, int* y, int* z)
{
  int seed;
  srand(seed);
  //Randomly generate the numbers and assign them to the variables
  *x = rand() % 30 + 1;
  *y = rand() % 30 + 1;
  *z = rand() % 30 + 1;  
}

//Function to fill the character arrays with the characters up to the x spot of the array
void pointfill(int x, char ch, char* str)
{
  int i = 0;
  //Loop through the array and input the character into each spot in the array
  while(i < x)
    {
      *(str + i) = ch;//assign the i spot of the array with the character
      i++;
    }
  *(str + i) = '\0';//insert the NULL at the end of the cstring
}
