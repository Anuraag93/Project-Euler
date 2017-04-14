/*
 * Fibonacci_seq.c
 *
 *  Created on: 14-Apr-2017
 *      Author: Anurag
 */

/*
 * Fibonacci.c
 *
 *  Created on: 14-Apr-2017
 *      Author: Anurag
 */

#include<stdio.h>

int main()
{
	printf("Prg Starts...\n");

	int number1 = 1,number2 = 2,count1 = 1, sum = 0,count2 = 0;
	printf("%d +",number1);

	for(int repeat = 1;repeat <= 4000000;repeat++)
	{
		printf(" %d +",number2);

		repeat = number1 + number2;
		number1 = number2;
		number2 = repeat;
		count1 = count1 + 1;

		if(number1 %2 == 0)
		{
			sum = sum + number1;
			count2 = count2 + 1;
		}

	}
	printf("\nValues in the fibonacci sequence = %d.",count1);
	printf("\nSum of all the even values = %d.",sum);
	printf("\nNumber of even values = %d.",count2);

	printf("\nPrg ends...");
}

