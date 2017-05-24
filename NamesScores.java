/*
Problem 22

Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, 
begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, 
multiply this value by its alphabetical position in the list to obtain a name score.
For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, 
is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
What is the total of all the name scores in the file?
*/

import java.io.BufferedReader;
import java.io.FileReader;

public class NamesScores 
{

	public static void main(String[] args) throws Exception
	{
		FileReader file = new FileReader("C:/Users/hzhang127/workspace/p022_names.txt");
		BufferedReader reader= new BufferedReader(file);
		String text ="";
		String line=reader.readLine();
		while(line != null)
		{
			text=text+line;
			line=reader.readLine();
		}
		System.out.println(text);
		String[] words = text.split("\\W+");
		String[] sortedWords= new String[words.length];
		TopDownMergeSort(words,sortedWords,words.length);

		long sum=0;
		for(int i=1;i<sortedWords.length;i++)
		{
			sum=sum+valueOfString(words[i])*(long)(i);
		}
		System.out.println(sum);
	}
	
	public static long valueOfString(String a)
	{
		long sum=0;
		for(int i=0;i<a.length();i++)
		{
//			System.out.println("sum is"+sum);
//			System.out.println("the firs char is "+(long)(a.charAt(i)-64));
//			
			sum=sum+(long)(a.charAt(i)-64);
		}
		return sum;
	}
	
	// Array A[] has the items to sort; array B[] is a work array.
	public static void TopDownMergeSort(String[] A, String[] B, int n)
	{
	    CopyArray(A, 0, n, B);           // duplicate array A[] into B[]
	    TopDownSplitMerge(B, 0, n, A);   // sort data from B[] into A[]
	}

	// Sort the given run of array A[] using array B[] as a source.
	// iBegin is inclusive; iEnd is exclusive (A[iEnd] is not in the set).
	public static void TopDownSplitMerge(String[] B, int iBegin, int iEnd, String[] A)
	{
	    if(iEnd - iBegin < 2)                       // if run size == 1
	        return;                                 //   consider it sorted
	    // split the run longer than 1 item into halves
	    int iMiddle = (iEnd + iBegin) / 2;              // iMiddle = mid point
	    // recursively sort both runs from array A[] into B[]
	    TopDownSplitMerge(A, iBegin,  iMiddle, B);  // sort the left  run
	    TopDownSplitMerge(A, iMiddle,    iEnd, B);  // sort the right run
	    // merge the resulting runs from array B[] into A[]
	    TopDownMerge(B, iBegin, iMiddle, iEnd, A);
	}

	//  Left source half is A[ iBegin:iMiddle-1].
	// Right source half is A[iMiddle:iEnd-1   ].
	// Result is            B[ iBegin:iEnd-1   ].
	public static void TopDownMerge(String[] A, int iBegin, int iMiddle, int iEnd, String[] B)
	{
	    int i = iBegin; int j = iMiddle;
	    
	    // While there are elements in the left or right runs...
	    for (int k = iBegin; k < iEnd; k++) {
	        // If left run head exists and is <= existing right run head.
	        if (i < iMiddle && (j >= iEnd || A[i].compareTo(A[j])<0)) {
	            B[k] = A[i].substring(0);
	            i = i + 1;
	        } else {
	            B[k] = A[j].substring(0);
	            j = j + 1;    
	        }
	    } 
	}

	public static void CopyArray(String[] A, int iBegin, int iEnd, String[] B)
	{
	    for(int k = iBegin; k < iEnd; k++)
	    {
	        B[k] = "";
	    	B[k]=B[k]+A[k].substring(0);
	    }
	}

}
