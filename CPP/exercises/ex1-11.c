/* Wayne Smith
Exercise 1-11b
This program will print a temperature table
*/
#include<stdio.h>

int main()
{
	int fah, f1, f2;
	float cel;

	printf("Enter starting fahrenheit:  ");
	scanf("%d", &f1);
	printf("Enter ending fahrenheit:  ");
	scanf("%d", &f2);

	printf("Fahrenheit       |        Celsius\n");
	printf("-------------------------------------\n");
	for (fah = f1; fah <= f2; fah++)
	  {
	    cel = (fah - 32) * 5 / 9.0;
	    printf("%5d            |        %+-.3f\n", fah, cel);
	    
	  }
	return 1;
}
