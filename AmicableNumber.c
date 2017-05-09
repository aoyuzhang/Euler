/*
Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. 
The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
Evaluate the sum of all the amicable numbers under 10000.
*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define TRUE 1
#define FALSE 0
 
int isDivisible(int n, int m)
{
	if(n%m==0)
		return TRUE;
	else
		return FALSE;
}
int isAmicalble(int n)
{
	int sum=0;
	int i=0;
	for(i=1;i<n;i++)
	{
		if(isDivisible(n,i)==TRUE)
			sum=sum+i;
	}
	int sum2=0;
	for(i=1;i<sum;i++)
	{
		if(isDivisible(sum,i)==TRUE)
			sum2=sum2+i;
	}
	if(sum2==n&&sum!=n)
	{
		//printf("%d %d ",n,sum);
		return sum;
	}
	return -1;

}

int main()
{

	int amicable[10000];
	int index=0;
	int sum=0;
	for(int index=0;index<10000;index++) // clear the amicable array
		amicable[index]=0;
	for(int index=1;index<10000;index++)
	{
			amicable[index]=isAmicalble(index);
	}
	for(int index=1;index<10000;index++)
	{
		if(amicable[index]!=-1)
			sum=sum+index;
	}	
	printf(" sum of amical numbers less than 10000 is %d",sum);
	return 0;
}

