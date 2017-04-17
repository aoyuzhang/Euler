/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which, 
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
import java.lang.Math;
public class SpecialPythagorialTriplet 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<500;i++) // i range from 1 to 500
		{
			for(int j=1;j<500;j++)
			{
				for(int k=1;k<500;k++)
				{
					if(i==j||j==k||i==k)
						continue;
					if(i+j+k==1000) // check if sum of i j and k is 1000
					{
						if(Math.pow(i, 2)+Math.pow(j, 2)==Math.pow(k, 2)) // check if they form pythagorian triple
						{
							System.out.println(""+i+" "+j+" "+k);
							int product =i*j*k;
							System.out.println(""+product); // print the product of i j and k
						}
					}
				}
			}
		}
		// TODO Auto-generated method stub

	}

}
