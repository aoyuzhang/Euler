/*There are exactly ten ways of selecting three from five, 12345:

123, 124, 125, 134, 135, 145, 234, 235, 245, and 345
In combinatorics, we use the notation, 5C3 = 10.
In general,
nCr =	n!/r!/(n−r)!
,where r ≤ n, n! = n×(n−1)×...×3×2×1, and 0! = 1.
It is not until n = 23, that a value exceeds one-million: 23C10 = 1144066.
How many, not necessarily distinct, values of  nCr, for 1 ≤ n ≤ 100, are greater than one-million?*
// Note that any negative numbered result from addition of two positive number will be necessarily larger than 1000000
// So this fact is used in the program. solution is :4075


import java.math.BigInteger;
public class CombinatoricSelection 
{

	public static void main(String[] args) 
	{
		/* Build Pascal triangle
		 */
		long layer=100; //  the layer of Pascal triangle required
		long[][] pascal=new long[101][101];
		pascal[0][0]=1;
		pascal[0][1]=1;
		long count=0;
			
		for(int i=1;i<layer;i++)
		{
			for(int j=0;j<=i+1;j++)
			{
				if(j==0||j==i+1)
				{
					pascal[i][j]=1;
					System.out.print(" "+pascal[i][j]);
				}
				else
				{
					pascal[i][j]=pascal[i-1][j]+pascal[i-1][j-1];
					System.out.print(" "+pascal[i][j]);
				}
				
				if(pascal[i][j]>1000000||pascal[i][j]<0)
					count++;
				
			}
			System.out.println();
		}
		System.out.println(""+count);
	}


}
