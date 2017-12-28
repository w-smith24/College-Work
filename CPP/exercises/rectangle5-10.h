#ifndef rectangle510_h  // if not defined (by multiple includes), define it
#define rectangle510_h
#include<iostream>
using namespace std;

class rectangle510
{
protected:   // sub class direct access
    float length;
    float width;
    float area;
    float perimeter;

public:
    rectangle510()  // no argument constructor
    {
        length = 1;
        width = 1;
        area = 1;
        perimeter = 4;
    }

    rectangle510(float l, float w)  // overloaded constructor
    {
        length = l;
        width = w;
        area = length * width;
        perimeter = 2 * (length + width);
    }
    
    float operator+(rectangle510 rec)
    {
      float total;
      total = length + width + rec.length + rec.width;
      return total;
    }

    float operator-(rectangle510 rec)
    {
      float total;
      total = (length + width) - (rec.length + rec.width);
      return total;
    }

    bool operator>(rectangle510 rec)
    {
      if(area > rec.area)
	return true;
      else
	return false;
    }

    bool operator<(rectangle510 rec)
    {
      if(area < rec.area)
	return true;
      else
	return false;
    }

    bool operator==(rectangle510 rec)
    {
      if(area == rec.area)
	return true;
      else
	return false;
    }

    bool operator!=(rectangle510 rec)
    {
      if(area != rec.area)
	return true;
      else
	return false;
    }

    void print()
    {
        cout << "Length is " << length << endl;
        cout << "Width is " << width << endl;
        cout << "Area is " << area << endl;
        cout << "Perimeter is " << perimeter << endl;
    }
};

#endif
