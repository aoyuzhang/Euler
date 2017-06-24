/*
 * 145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
 * Find the sum of all numbers which are equal to the sum of the factorial of their digits.
 * Note: as 1! = 1 and 2! = 2 are not sums they are not included.
 */
import java.math.BigInteger;

public class DigitFactorials {

	public static void main(String[] args) 
	{
		BigInteger sum = BigInteger.ZERO;
		for (BigInteger i=new BigInteger("10");i.compareTo(new BigInteger("1000000"))==-1;i=i.add(BigInteger.ONE))
		{
			if(sumFactorialDigit(i).equals(i))
				sum=sum.add(i);
		}
		System.out.println(sum);
		// TODO Auto-generated method stub

	}
	public static BigInteger sumFactorialDigit(BigInteger num)
	{
		BigInteger sum= BigInteger.ZERO;
		BigInteger temp= BigInteger.ZERO.add(num);
		while(temp.equals(BigInteger.ZERO)!=true)
		{
			sum=sum.add(factorial(temp.mod(new BigInteger("10"))));
			temp=temp.divide(new BigInteger("10"));
		}
		return sum;
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

}
