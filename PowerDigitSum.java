/*
 * Problem 16
 * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
	What is the sum of the digits of the number 21000?
 */

import java.math.BigInteger;
public class PowerDigitSum 
{

	public static void main(String[] args) 
	{
		/* COmpute 2^1000*/
		BigInteger two = new BigInteger("2");
		BigInteger result= BigInteger.ONE;
		for(int i=0;i<1000;i++)
		{
			result=result.multiply(two);
		}
		/* get the sum of digits ofresult*/
		BigInteger sum= BigInteger.ZERO;
		while(result.equals(BigInteger.ZERO)!=true)
		{
			sum=sum.add(result.mod(new BigInteger("10")));
			result=result.divide(new BigInteger("10"));
		}
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
