/*Wayne Smith
  Exercise 4-5*/

#include<iostream>
using namespace std;

void triple(int*, int&);

int main()
{
  int num1, num2;
  cout << "Enter 2 numbers to triple: ";
  cin >> num1 >> num2;  
  triple(&num1, num2);
  cout << "The values tripled are: " << num1 << " " << num2 << endl;
  return 1;  
}

void triple(int* a, int& b)
{
  *a = *a * 3;
  b = b * 3;
}
