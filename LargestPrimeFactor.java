/*The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
*/

import java.math.BigInteger;
import java.lang.Math; // import The math library
public class LargestPrimeFactor 
{
	public static void main(String[] args) 
	{
		BigInteger number= new BigInteger("600851475143");//square root of the number is approximately 800000
		long largestPrime=2;
		for(BigInteger m=new BigInteger("3"); m.compareTo(new BigInteger("800000"))==-1;m=m.add(new BigInteger("2")))
		{
			System.out.println("iteration"+m);
			if(number.mod(m).equals(BigInteger.ZERO))
			{
				System.out.println(m);
				long longValueM= m.longValueExact();
				if(isPrime(longValueM)&&longValueM>largestPrime)
				{
					largestPrime=longValueM;
				}
			}	
		}
		System.out.println(""+largestPrime);


		// TODO Auto-generated method stub

	}
	public static boolean isPrime(long i)
	{
		if(i==1)
			return false;
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
