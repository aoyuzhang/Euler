/*
 * Problem 30
 * Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

1634 = 14 + 64 + 34 + 44
8208 = 84 + 24 + 04 + 84
9474 = 94 + 44 + 74 + 44
As 1 = 14 is not a sum it is not included.

The sum of these numbers is 1634 + 8208 + 9474 = 19316.

Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 * 
 */

import java.math.BigInteger;
public class DigitFifthPower 
{

	public static void main(String[] args) 
	{
		BigInteger sum= BigInteger.ZERO;// use to store the sum of all number whose sum of digits to the fifth power is itself
		for(int i=2;i<10000000;i++)
		{
			if(isDigitsFifthPower(new BigInteger(i+"")))
					sum=sum.add(new BigInteger(i+""));
		}
		System.out.println(sum);
		// TODO Auto-generated method stub

	}
	public static boolean isDigitsFifthPower(BigInteger num)
	{
		BigInteger sum= BigInteger.ZERO; // use to store the sum of the digits
		BigInteger temp= BigInteger.ZERO.add(num); // make a duplicate of the number num
		while(temp.equals(BigInteger.ZERO)!=true)
		{
			sum=sum.add(temp.mod(new BigInteger("10")).pow(5));
			temp=temp.divide(new BigInteger("10"));
		}
		if(sum.equals(num))
			return true;
		return false;
	}

}
