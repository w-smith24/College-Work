
class rectangle51
{
 private:
  float area;
  float perimeter;
 public:
  float length;
  float width;
  rectangle51()
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
    perimeter = length * 2 + width * 2;
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
  
