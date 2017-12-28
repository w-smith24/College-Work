/*Wayne Smith
  Exercise 3-10b
*/
#include<iostream>
#include<string>

using namespace std;

int main()
{
  string str[3];
  int i, len;

  cout << "Enter 3 strings" << endl;
  for(i = 0;i < 3;i++)
    getline(cin, str[i], '\n');
  cout << endl << "Strings that end in \"es\"" << endl;
  for(i = 0;i < 3;i++)
    {
      len = str[i].length();
      if(str[i].at(len - 2) == 'e' && str[i].at(len - 1) == 's')
      	cout << str[i] << endl;		
    }
  cout << endl << "Strings the begin with \"yan\"" << endl;
  for(i = 0;i < 3;i++)
    {
      if(str[i].substr(0, 3).compare("yan") == 0)
	cout << str[i] << endl;
    }
  return 0;
}
