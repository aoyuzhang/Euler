/*
 * Problem 20
 * n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
 */
import java.math.BigInteger;
public class FactorialDigitSum 
{

	public static void main(String[] args) 
	{	
		BigInteger oneHundred= new BigInteger("100");
		System.out.println(sumOfDigits(factorial(oneHundred)));
	}
	public static BigInteger factorial(BigInteger n)
	{
		if(n.compareTo(BigInteger.ZERO)==0||n.compareTo(BigInteger.ONE)==0)
			return BigInteger.ONE;
		BigInteger result= BigInteger.ONE;
		for(BigInteger i=BigInteger.ONE;i.compareTo(n.add(BigInteger.ONE))==-1;i=i.add(BigInteger.ONE))
			result=result.multiply(i);
		return result;
	}
	public static BigInteger sumOfDigits(BigInteger num)
	{
		BigInteger sum= BigInteger.ZERO;
		BigInteger temp= BigInteger.ZERO.add(num);
		while(temp.equals(BigInteger.ZERO)!=true)
		{
			sum=sum.add(temp.mod(new BigInteger("10")));
			temp=temp.divide(new BigInteger("10"));
		}
		return sum;
	}
}
