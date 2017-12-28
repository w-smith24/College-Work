#include<iostream>
#include"rectangle5-1.h"
using namespace std;

int main()
{
    rectangle51 r;  // write constructor
    float len, wid;
    cout << "Enter length:  ";
    cin >> len;
    r.setlength(len); // write functions
    cout << "Enter width:  ";
    cin >> wid;
    r.setwidth(wid);
    r.calcarea();
    r.calcperimeter();
    cout << "Rectangle's length = " << r.getlength() << endl;
    cout << "Rectangle's width = " << r.getwidth() << endl;
    cout << "Rectangle's area = " << r.getarea() << endl;
    cout << "Rectangle's perimeter = " << r.getperimeter() << endl;

    return 1;
}
