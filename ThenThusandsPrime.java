/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?*/

import java.lang.Math;

public class TenThusandsPrime 
{

	public static void main(String[] args)
	{
		int count=0; // use to count the number of prime numbers found so far.
		int i=1; // use to store each numbers to be tested in a while loop
		int number=0; //use to store the result
		while(true)
		{
			if(isPrime(i))
				count++;
			
			if(count==10001)
			{
				number=i;
				break;
			}
			i++;
		}
		System.out.println(""+number);
		// TODO Auto-generated method stub

	}
	/* a function to determine if a number is a prime number or not*/
	public static boolean isPrime(int number)
	{
		if(number%2==0) // If the number is divisible by 2 then it is not a prime number
			return false;
		// check if the number is divisible by any odd numbers up to squaroot of the number. As all prime numbers are odd.
		for(int i=3;i<=Math.sqrt(number);i+=2) 
		{
			if(number%i==0)
				return false;
		}
		return true;
	}

}
