#include<iostream>
#include"rectangle5-8a.h"
using namespace std;
class cube58a : public rectangle58a
{
 private:
  float depth;
 public:
  cube58a()
    {
      depth = 1;
    }
  float calcarea()
  {
    area = 2*(width*depth + length*depth + width*length);
  }
  float calcperimeter()
  {
    perimeter = 4*(width + length + depth);
  }
  void setdepth(float dep)
  {
    depth = dep;
  }
  float getdepth()
  {
    return depth;
  }
};
