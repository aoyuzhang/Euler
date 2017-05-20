import java.math.BigInteger;
public class DigitFactorials 
{
	public static void main(String[] args) 
	{
		BigInteger sum=BigInteger.ZERO;
		for(BigInteger num=BigInteger.ZERO;num.compareTo(new BigInteger("1000000"))<0;num.add(BigInteger.ONE))
		{
			if(isDigitFactorialSum(num))
				sum=sum.add(num);
		}
		System.out.println(sum);
				
		// TODO Auto-generated method stub

	}
	public static boolean isDigitFactorialSum(BigInteger number)
	{
		BigInteger temp=BigInteger.ZERO.add(number);
		
		BigInteger sum =BigInteger.ZERO; // use to store the sum of digits factorial.
		while(temp.equals(BigInteger.ZERO)!=true)
		{
			sum=sum.add(factorial(temp.mod(new BigInteger("10"))));
			temp=temp.divide(new BigInteger("10"));
		}
		if(sum.equals(number))
			return true;
		return false;
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
