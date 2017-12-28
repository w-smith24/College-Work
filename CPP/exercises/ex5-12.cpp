//Wayne Smith
//Exercise 5-12

#include "colorrectangle5-12.h"
#include "cube5-12.h"
#include "rectangle5-12.h"

int main()
{
  rectangle512 *r[3];
  int i;
  r[0] = new rectangle512(5,2);
  r[1] = new cube512(5,2,4);
  r[2] = new colorrectangle512(5,2,"red");

  for(i = 0; i < 3; i++)
    {
      cout << "The address of spot " << i << " is " << r[i] << endl << endl;
    }
  for(i = 0; i < 3; i++)
    {
      cout << "\nSpot " << i << endl;
      r[i]->print();
    }

  return 1;
}
