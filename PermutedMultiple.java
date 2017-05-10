
/*
It can be seen that the number, 125874, and its double, 251748, contain exactly the same digits, but in a different order.
Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits.
*/
public class PermutedMultiple
{

	public static void main(String[] args) 
	{
		for(int i=1;i<1000000;i++)
		{
			int twiceI=i*2;
			int threeTimesI=3*i;
			int fourTimesI=4*i;
			int fiveTimesI=5*i;
			int sixTimesI=6*i;
			if(isDigitPermuted(twiceI,i))
			{
				if(isDigitPermuted(twiceI,threeTimesI)&&isDigitPermuted(threeTimesI,fourTimesI))
				{
					if(isDigitPermuted(fourTimesI,fiveTimesI)&&isDigitPermuted(fiveTimesI,sixTimesI))
					{
						System.out.println(i);
						break;
					}
				}
			}
		}

	}

	public static boolean isDigitPermuted(int n,int m)
	{
		int[] digits1 =new int[10];
		int[] digits2 =new int[10];
		for(int i=0;i<10;i++)
		{
			digits2[i]=0;
			digits1[i]=0;
		}
		int num1=n;
		while(num1!=0)
		{
			digits1[num1%10]++;
			num1=num1/10;
		}
		int num2=m;
		
		while(num2!=0)
		{
			digits2[num2%10]++;
			num2=num2/10;
		}
		for(int i=0;i<10;i++)
		{
			if(digits1[i]!=digits2[i])
				return false;
		}
		return true;
	}
}
