#include<iostream>
#include<iomanip>
using namespace std;
class rectangle58a
{
 protected:
  float area;
  float perimeter;
 public:
  float length;
  float width;
  rectangle58a()
    {
      length = 1;
      width = 1;
      area = calcarea();
      perimeter = calcperimeter();
    }
  void setwidth(float wid)
  {
    width = wid;
  }
  void setlength(float len)
  {
    length = len;
  }
  float calcarea()
  {
    area = length * width;
  }
  float calcperimeter()
  {
    perimeter = 2*(length + width);
  }
  float getlength()
  {
    return length;
  }
  float getwidth()
  {
    return width;
  }
  float getarea()
  {
    return area;
  }
  float getperimeter()
  {
    return perimeter;
  }
};
