//Wayne Smith

#include <iostream>
#include <iomanip>

using namespace std;

int main()

{
	double principle, rate, interest;
	int days;

	cout.setf(ios::fixed|ios::showpoint);
	cout << "Enter principle (-1 to end): ";
	cin >> principle;
	while(principle  != -1)
	{
		cout << "Enter annual interest rate (as a decimal): ";
		cin >> rate;
		cout << "Enter number of days: ";
		cin >> days;
		interest = principle * rate / 365 * days;
		cout << "Interest is " << setprecision(2) << interest << endl;
		cout << "Enter Principle (-1 to end): ";
		cin >> principle; 
	}
	return 0;
}
