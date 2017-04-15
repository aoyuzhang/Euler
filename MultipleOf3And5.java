
/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *	Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class MultipleOf3And5 
{

	public static void main(String[] args) 
	{
		int sum=0; // sum is used as a variable to store the sum of the solutions
		// TODO Auto-generated method stub
		for(int i=1;i<=999;i++)
		{
			if(i%3==0||i%5==0)
				sum=sum+i;
		}
		System.out.println(""+sum);
	}

}
