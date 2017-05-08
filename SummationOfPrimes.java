/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.*/

// NOte that the result is off by 2 because 2 was not found to be rpime in isprime() funciton.

import java.lang.Math;

public class SummantionOfPrimes 
{

	public static void main(String[] args)
	{
		//int count=0; // use to count the number of prime numbers found so far.
		long i=2; // use to store each numbers to be tested in a while loop
		//int number=0; //use to store the result
		long sum=0;
		while(i<2000000)
		{
			if(isPrime(i))
			{
				System.out.println(""+i);
				sum+=i;
				//System.out.println(""+sum);
			}
			i++;
		}
		System.out.println(""+sum);
		// TODO Auto-generated method stub

	}
	/* a function to determine if a number is a prime number or not*/
	public static boolean isPrime(long i)
	{
		if(i%2==0) // If the number is divisible by 2 then it is not a prime number
			return false;
		// check if the number is divisible by any odd numbers up to squaroot of the number. As all prime numbers are odd.
		for(long j=3;j<=Math.sqrt(i);j+=2) 
		{
			if(i%j==0)
				return false;
		}
		return true;
	}

}
