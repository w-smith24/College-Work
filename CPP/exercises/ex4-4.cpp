/*Wayne Smith
  Exercise 4-4*/

#include <iostream>
#include <iomanip>
using namespace std;

int getgrades(int*);

int main()
{
  int numgrades;
  float average, total = 0;
  int grades[50], *gradeptr, *limitptr;
  cout.setf(ios::fixed|ios::showpoint);
  numgrades = getgrades(grades);
  gradeptr = grades;
  limitptr = grades + numgrades;
  while(gradeptr < limitptr)
    {
      total += *gradeptr;
      gradeptr++;
    }
  average = (float)(total / numgrades);
  cout << setprecision(1) << "The average of the grades is: " <<  average << endl;
  return 1;
}

int getgrades(int* a)
{
  int grade = 0;
  int spot = 0;
  cout << "Enter grades and end with -1" << endl;
  while(grade != -1)
    {
      cin >> grade;
      *(a + spot) = grade;
      spot++;
    }
  return spot - 1;
}
