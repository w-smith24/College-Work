/*Wayne Smith
  ex2-4*/

#include <iostream>
#include <cmath>
#include <ctime>

using namespace std;

int main()
{
	int seed, throw1, throw2, sum, wins, losses;
	char choice;

	seed = time(NULL);
	srand(seed);

	cout << "Would you like to roll the dice? y or n" << endl;
	cin >> choice;
	wins = 0;
	losses = 0;
	
	while(choice == 'y')
	{
		throw1 = rand() % 6 + 1;
                throw2 = rand() % 6 + 1;
		sum = throw1 + throw2;

		cout << "You rolled " << throw1 << " and " << throw2 << endl;

		if(sum == 7 || sum == 11)
		{
			cout << "The total of the two thrown dice was " << sum << "." << endl << "YOU WON!!!!" << endl;
			wins++;
		}
		else if(throw1 == throw2)
		{
			cout << "You rolled doubles! YOU WIN!!!!!!" << endl;
			wins++;
		}
		else
		{
			cout << "You lost" << endl;
			losses++;
		}

		cout << endl << "Would you like to play again? y or n" << endl;
		cin >> choice;
	}

	if(wins == 1 && losses == 1)
	{
		cout << endl << "You had " << wins << " win and " << losses << " loss. Thanks for playing." << endl;
	}
	else if(losses == 1)
	{
	        cout << endl << "You had " << wins << " wins and " << losses << " loss. Thanks for playing." << endl;
	}
	else if(wins == 1)
	{
	        cout << endl << "You had " << wins << " win and " << losses << " losses. Thanks for playing." << endl;
	}
	else
	{
		cout << endl << "You had " << wins << " wins and " << losses << " losses. Thanks for playing." << endl;
	}

	return 0;
}
