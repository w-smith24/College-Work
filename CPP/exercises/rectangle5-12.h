/* Bill Wohlleber
Exercise 5-12 super
This class will define a rectangle
*/
#ifndef rectangle512_h
#define rectangle512_h
#include<iostream>
using namespace std;

class rectangle512
{
protected:
	float length;
	float width;
	float area;
	float perimeter;

public:
	rectangle512()
	{
		length = 1;
		width = 1;
		area = 1;
		perimeter = 4;
	}

	rectangle512(float l, float w)
	{
		length = l;
		width = w;
		area = length * width;
		perimeter = 2 * (length + width);
	}

	void virtual print()
	{
		cout << "Length is " << length << endl;
		cout << "Width is " << width << endl;
		cout << "Area is " << area << endl;
		cout << "Perimeter is " << perimeter << endl;
	}
};

#endif
