/*
There are exactly ten ways of selecting three from five, 12345:
123, 124, 125, 134, 135, 145, 234, 235, 245, and 345
In combinatorics, we use the notation, 5C3 = 10.
In general,
nCr =	n!/r!/(n−r)!
,where r ≤ n, n! = n×(n−1)×...×3×2×1, and 0! = 1.
It is not until n = 23, that a value exceeds one-million: 23C10 = 1144066.
How many, not necessarily distinct, values of  nCr, for 1 ≤ n ≤ 100, are greater than one-million?
*/
import java.math.BigInteger;
public class BruteForceCombinatoricSelection 
{

	public static void main(String[] args) 
	{
		int count=0;
		for(BigInteger i=BigInteger.ONE;i.compareTo(new BigInteger("24"))==-1;i.add(BigInteger.ONE))
		{
			for(BigInteger j=BigInteger.ZERO;j.compareTo(i.add(BigInteger.ONE))==-1;j.add(BigInteger.ONE))
			{
				if(chooseFunction(i,j).compareTo(new BigInteger("1000000"))==1);
					count++;
			}
		}
		//System.out.println(chooseFunction(new BigInteger("23"),new BigInteger("21")));
		System.out.println(""+count);
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
	
	public static BigInteger chooseFunction(BigInteger number1, BigInteger number2)
	{
		BigInteger result=BigInteger.ONE;
		result=factorial(number1); 
		
		result=result.divide(factorial(number2));
		result=result.divide(factorial(number1.subtract(number2)));
		return result;
		
	}

}
