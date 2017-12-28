//Wayne Smith
//Exercise 3-1b

#include <iostream>
#include <iomanip>

using namespace std;
int getGrades(int []);
float getAverage(int [], int);
void printArray(int []);

int main()
{
  int grades[100], size;
  float average;
  size = getGrades(grades);
  average = getAverage(grades, size);
  cout.setf(ios::fixed|ios::showpoint);
  cout << "Your average is " << setprecision(1) << average << endl;
  printArray(grades);
  return 1;  
}

int getGrades(int a[])
{
  int n = 0;
  cout << "Enter three grades followed by -1" << endl;
  cin >> a[n];
  while(a[n] != -1)
    {
      n++;
      cin >> a[n];
    }
  return n;
}

float getAverage(int a[], int n)
{
  int i;
  float sum = 0;
  if (n == 0)
    return 0;
  for (i = 0; i < n; i++)
    sum += a[i];
  return sum / n;
}

void printArray(int a[])
{
  int i;
  cout << "\nIndex Number\tValue\tAddress\n--------------------------------------\n";
  for(i = 0; i < 3; i++)
    cout << i << "\t\t" << a[i] << "\t" << &a[i] << endl;
}
