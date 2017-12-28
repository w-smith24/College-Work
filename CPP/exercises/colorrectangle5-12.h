/* Bill Wohlleber
Exercise 5-12 sub
This class will define a colored rectangle class
*/
#include"rectangle5-12.h"
#include<iostream>
#include<cstring>
using namespace std;

class colorrectangle512 : public rectangle512
{
private:
	char color[20];

public:
	colorrectangle512() : rectangle512()
	{
		strcpy(color, "blue");
	}

	colorrectangle512(float l, float w, char c[]) : rectangle512(l, w)
	{
		strcpy(color, c);
	}

	void print()
	{
		rectangle512::print();
		cout << "Color is " << color << endl;
	}
};

