/*Wayne Smith
  ex1-11*/

#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
	cout.setf(ios::fixed|ios::showpoint);
	cout << setw(10) << "Fahrenheit" << setw(12) << "Celsius" << endl;

	int i;
	float celsius = 0;

	for(i = 0; i <= 212; i++)
	{
		celsius =(i - 32) / 1.8;
		cout << setw(6) << setfill(' ') << i << setw(16) << setfill('.')
		<< setprecision(3) << setiosflags(ios::showpos) << celsius <<
		resetiosflags(ios::showpos) << endl;
		//cout.setf(ios::showpos);
	}

	return 0;
}

