/*
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit 
 * numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit 
 * numbers. The solution is 906609
 */
public class LargestPalindrom 
{

	public static void main(String[] args) 
	{
		/* Consider all possible multiplication of three digits numbers
		 * and Check if they are palindromes. 
		 */
		int largestPalindrome=0; // used as a variable to store the largest palindrome.
		for(int i=100;i<999;i++)
		{
			for(int j=100;j<999;j++)
			{
				int product=i*j;
				if(isPalindrome(product)==1)
				{
					if(product>largestPalindrome)
						largestPalindrome=product; // set the largest palindrome to be the product
				}
					
			}
		}
		System.out.println(largestPalindrome); // print the result
		
		// TODO Auto-generated method stub

	}
	/* This function return 1 if the input is a palindrome and 0 otherwise*/
	public static int isPalindrome( int a)
	{
		String intToStringC=""+a; // make the integer into a string.
		int lengthOfString=intToStringC.length(); // get the length of the string
		for(int i=0;i<lengthOfString/2;i++) // iterate through all characters
		{
			/*check if the current character is the same as the character in length -i*/
			if(intToStringC.charAt(i)!=intToStringC.charAt(lengthOfString-1-i))
				return 0;
		}
		return 1;
	}
}
