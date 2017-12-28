#include<iostream>
#include"cube5-8a.h"
using namespace std;

int main()
{
    rectangle58a r;
    cube58a c;     // run no argument cube constructor
    r.setlength(20);
    r.setwidth(10);
    r.calcarea();
    r.calcperimeter();

    c.setlength(10);
    c.setwidth(5);
    c.setdepth(3);
    c.calcarea();
    c.calcperimeter();

    cout << "\nRectangle's length = " << r.getlength() << endl;
    cout << "Rectangle's width = " << r.getwidth() << endl;
    cout << "Rectangle's area = " << r.getarea() << endl;
    cout << "Rectangle's perimeter = " << r.getperimeter() << endl;

    cout << "\nCube's length = " << c.getlength() << endl;
    cout << "Cube's width = " << c.getwidth() << endl;
    cout << "Cube's depth = " << c.getdepth() << endl;
    cout << "Cube's area = " << c.getarea() << endl;
    cout << "Cube's perimeter = " << c.getperimeter() << endl;

    return 1;
}
