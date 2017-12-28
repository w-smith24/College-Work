
/* Wayne Smith
Exercise 6-4a
This program will create a movie set
*/
#include<iostream>
#include<set>
#include<string>
#include<iterator>
#include<algorithm>
using namespace std;

int main()
{
    string name;
    int ans, pos;
    bool found = false;
    set<string> vm; // declare set of strings vm
    set<string>::iterator vmit; // declare set iterator vmit
    ostream_iterator<string> osit(cout, "\n"); // declare iterator to cout osit
    pair<set<string>::iterator, bool> p;  // declare pair of set of string iterator named p

    cout << "Enter movie name (-1 to end):  ";
    getline(cin, name, '\n');
    while (name != "-1")
    {
      p = vm.insert(name); // insert name into set, assign to pair object
      if(p.second) // if pair's second field is true
	cout << *p.first << " inserted\n"; // print that pair's first field was inserted
      else
	cout << *p.first << " already in set\n"; // print that pairs' first field was already in set
        cout << "Enter movie name (-1 to end):  ";
        getline(cin, name, '\n');
    }

    cout << "Enter 1 to insert, 2 to delete:  ";
    cin >> ans;
    if (ans == 1)
    {
        cout << "Enter movie name:  ";
        cin.ignore(1, '\n');
        getline(cin, name, '\n');

	p = vm.insert(name);// insert name into set, assign to pair object
	if(p.second)// if pair's second field is true
	  cout << *p.first << " inserted\n";// print that pair's first field was inserted
        else
	  cout << *p.first << " already in set\n";// print that pairs' first field was already in set
    }
    else if (ans == 2)
    {
        cout << "Enter movie name to delete:  ";
        cin.ignore(1, '\n');
        getline(cin, name, '\n');
	vmit = vm.find(name);// find name in set, return to iterator
	if(vmit != vm.end()) // if iterator is not at the end of set
	  {
	    cout << *vmit << " will be deleted\n";// print what iterator is pointing at to say will be deleted
	    vm.erase(vmit);// delete that name from set
	  }
        else
            cout << name << " not in set\n";
    }

    cout << "Number of movies in set is " << vm.size() << endl;// print size
    copy(vm.begin(), vm.end(), osit);// copy set to cout iterator

    return 0;
}
