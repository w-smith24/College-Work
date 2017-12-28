/*Wayne Smith
  Exercise 3-7
  This program will generate random sentences
*/
#include<iostream>
#include<cstring>
#include<ctime>
#include<cmath>
#include<cctype>
using namespace std;

int main()
{
  char article[5][5] = {"the", "a", "one", "some", "any"};
  char noun[5][5] = {"boy", "girl", "dog", "town", "car"};
  char verb[5][8] = {"drove", "jumped", "ran", "walked", "skipped"};
  char preposition[5][6] = {"to", "from", "over", "under", "on"};
  char sent[36];
  int i, num;
  srand(time(NULL));
  
  for(i = 1; i <= 10; i++)
    {
      num = rand() % 5;
      strcpy(sent, article[num]);
      sent[0] = toupper(sent[0]);
      strcat(sent, " ");
      num = rand() % 5;
      strcat(sent, noun[num]);
      strcat(sent, " ");
      num = rand() % 5;
      strcat(sent, verb[num]);
      strcat(sent, " ");
      num = rand() % 5;
      strcat(sent, preposition[num]);
      strcat(sent, " ");
      num = rand() % 5;
      strcat(sent, article[num]);
      strcat(sent, " ");
      num = rand() % 5;
      strcat(sent, noun[num]);
      strcat(sent, ".");
      cout << sent << endl;
    }
  return 1;
}
	 
