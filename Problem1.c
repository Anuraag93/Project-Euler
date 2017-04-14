/*
 * multiple.c
 *
 *  Created on: 13-Apr-2017
 *      Author: Anurag
 */
#include<stdio.h>


int main()
{
	int count,sum = 0,n=1000,number = 0;

	for (count = 1;count < n;count++)
	{
		if(count % 3 == 0 || count % 5 == 0)
		{
			printf("%d is a multiple of 3 & 5\n",count);
			sum= sum + count;
			number= number + 1;
		}
	}
	printf("sum of all the mutiples of 3 and 5 are %d.\n",sum);
	printf("the number of multiples are %d.",number);


	return(0);
}

