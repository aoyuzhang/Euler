/*
 * Question 14
 * The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 
10 terms. Although it has not been proved yet (Collatz Problem), it is thought 
that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
 */
public class LongestCollatz 
{

	public static void main(String[] args) 
	{
		long number=1000000;// the bound in which the sequence starts
		long[] table= new long[1000001];// an array used to store the depth of each number in the sequence.
		table[1]=0;
		long maxDepth=1; // use to store the maximum depth of any number
		long maxNumber=0; // use to store the number that achieve the max depth
		for(long i=2;i<=1000000;i++)
		{
			long temp=i; // use to store the number i
			long depth=0;
			while(temp!=1&&temp>=i)
			{
				if(temp%2==0)
				{
					temp=temp/2;
					depth++;
				}
				else
				{
					temp= 3*temp+1;
					depth++;
				}
			}
			//System.out.println(temp+"");
			table[(int)i]=table[(int)temp]+depth;
			if(table[(int)i]>maxDepth)
			{
				maxDepth=table[(int)i];
				maxNumber=i;
			}
		}
			System.out.println(maxNumber+"");
				
		// TODO Auto-generated method stub

	}

}
