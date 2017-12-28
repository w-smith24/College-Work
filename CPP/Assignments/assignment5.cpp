/*Wayne Smith
  Assignment 5
  This program will prompt the user for the number of elements for the list
  then it will populate the list with random numbers between 1 and 150.
  It will then perform calculations for sum, average, median, and range
  and print them to the screen.
*/
#include<iostream>
#include<list>
#include<iterator>
#include<algorithm>
#include<iomanip>
using namespace std;

int main()
{
  int usrInput, i = 0, num, seed, range;
  int total = 0, size, midpt, max, min;
  float average;
  list<int> ls;
  list<int>::iterator lsit;
  ostream_iterator<int> osit(cout, "\n");
  seed = time(NULL);
  srand(seed);
  cout.setf(ios::fixed|ios::showpoint);
  cout << "Enter a number of elements to generate for the list: ";
  cin >> usrInput;
  //load the list with random number between 1 and 150
  while(i < usrInput)
    {
      num = rand() % 150 + 1;
      ls.push_front(num);
      i++;
    }
  ls.sort();
  copy(ls.begin(), ls.end(), osit);//print the list to the screen
  //find the sum 
  for(lsit = ls.begin(); lsit != ls.end(); lsit++)
    total += *lsit;
  cout << "Sum: " << total << endl;
  size = ls.size();//# elements of the list
  average = (float)total / size;//calculate the average
  cout << "Average: " << setprecision(3) << average << endl;
  midpt = ls.size() / 2;//calculate the midpoint of the list
  int count = 0;
  //Find the median
  for(lsit = ls.begin(); lsit != ls.end(); lsit++)
    {
      if(count++ <= midpt)
	num = *lsit;
    }  
  cout << "Median: " << num << endl;
  lsit = max_element(ls.begin(), ls.end());//find the largest element
  max = *lsit;
  lsit = min_element(ls.begin(), ls.end());//find the lowest element
  min = *lsit;
  range = max - min;//calculate the range of the list
  cout << "Range: " << range << endl;
  return 0;
}
