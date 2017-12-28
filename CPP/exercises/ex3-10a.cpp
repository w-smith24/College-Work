/*Wayne Smith
  Exercise 3-10a
*/
#include<iostream>
#include<cstring>
#include<cctype>
#include<string.h>
using namespace std;

int main()
{
  char last[3] = "";
  char cstr[3][30];
  int i, len;

  cout << "Enter 3 strings" << endl;
  for(i = 0;i < 3;i++)
    cin.getline(cstr[i],sizeof(cstr[i]), '\n');
  for(i = 0;i < 3;i++)
    {
      len = strlen(cstr[i]);
      if(cstr[i][len - 2] == 'e' && cstr[i][len - 1] == 's')
      	cout << cstr[i] << endl;		
    }
  for(i = 0;i < 3;i++)
    {
      if (strncmp (cstr[i],"yan",3) == 0)
	cout << cstr[i] << endl;
    }
  return 0;
}
