/*

The Fibonacci sequence is defined by the recurrence relation:

    Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.

Hence the first 12 terms will be:

    F1 = 1
    F2 = 1
    F3 = 2
    F4 = 3
    F5 = 5
    F6 = 8
    F7 = 13
    F8 = 21
    F9 = 34
    F10 = 55
    F11 = 89
    F12 = 144

The 12th term, F12, is the first term to contain three digits.

What is the index of the first term in the Fibonacci sequence to contain 1000 digits?

The solution is off by one as we started the index from 0.
 */

import java.math.BigInteger;
public class Fibonacci1000digits 
{
	public static void main(String[] args) 
	{
		BigInteger[] table = new BigInteger[3]; // create a table to store the Fibonacci numbers
		table[0]= BigInteger.ONE; // the first number is 1
		table[1]= BigInteger.ONE; // the second number in the sequence is 1

		
	int count=1;
	while(table[count%3].compareTo(new BigInteger("10").pow(999))<0) // while the Fibonacchi number in the sequence is less than 1000 digits
	{
		count++;
		table[count%3]=table[(count-1)%3].add(table[(count-2)%3]);
	}
	System.out.println(count+"");
		// TODO Auto-generated method stub

	}

}
