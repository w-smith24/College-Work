//Wayne Smith
//ex2-13

#include <iostream>
using namespace std;
template <class T>	
T max(T, T, T);

int main()
{
  int x, y, z;
  float a, b, c;
  char d, e, f;

  cout << "Enter three integers: ";//prompt for integers
  cin >> x >> y >> z;
  cout << max(x, y ,z) << " is the largest integer" << endl;//output the largest integer
  cout << "Enter three floats: ";//prompt for floats
  cin >> a >> b >> c;
  cout << max(a, b, c) << " is the largest float" << endl;//output the largest float
  cout << "Enter three characters: ";//prompt for the characters
  cin >> d >> e >> f;
  cout << max(d, e, f) << " is the largest character" << endl;//output the character with the largest ascii value
  return 0;
}

template <class T>
T max(T a, T b, T c)
{
  if(a > b && a > c)
    return a;
  else if(b > a && b > c)
    return b;
  else
    return c;
}
  
  
