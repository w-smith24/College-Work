#include<iostream>
#include"rectangle5-10.h"  // modified rectangle5-8b.h with operators overloaded
using namespace std;

int main()
{
    rectangle510 r1(7, 5), r2(5, 3);  // construct two rectangles 
    float sum, dif;        // use the overload operator + to add length and width from both rectangles ; 
    sum = r1 + r2;      dif = r1 - r2;
    if (r1 > r2)   // use the overload operator > to compare areas
        cout << "r1 has a greater area\n";
    else if (r1 < r2)
        cout << "r1 has a less area\n";
    else if (r1 == r2) 
        cout << "r1 and r2 have the same area\n";
    if (r1 != r2)
        cout << "Not equal\n";
    cout << "Sum of two rectangles is " << sum << endl;
    cout << "Difference of two rectangles is " << dif << endl;
    cout << "Rectangle 1\n";
    r1.print();
    cout << "Rectangle 2\n";
    r2.print();

    return 1;
}
