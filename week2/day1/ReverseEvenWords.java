package week2.day1.assignment;
import java.util.*;

public class ReverseEvenWords {
	
	public static void main(String[] args) {
		
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

		/* Pseudo Code:
		 
		 * Declare the input as Follow
	      		String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		
		d)split the words and have it in an array
		
		e)print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		 
		 */
		
		//Get the input sentence
		System.out.println("Enter a sentence");
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		
		//creating StringBuffer object to append the string array elements into single string
		StringBuffer sb=new StringBuffer();
		
		//split the string and store it as string array and find it's length
		String[] split=text.split(" ");
		int length=split.length;
		
		//Traverse through the array using loop and get the words at even position(which is an odd index number)
		for(int i=0;i<length;i++) {
			//if the index is odd number, do the string reversal
			if(i==1 || (i%2)!=0) {
				int l= split[i].length();
				char[] arr=split[i].toCharArray();
				char temp;
				for(int j=0;j<l/2;j++) {
					temp=arr[j];
					arr[j]=arr[l-1-j];
					arr[l-1-j]=temp;
				}
				String revarr=String.valueOf(arr);
				split[i]=revarr;
			}
			//concatenate the word with space except for the last word
			if(i<length-1)
				split[i]=split[i].concat(" ");
			//covert the string array into a single string
			sb.append(split[i]);
		}
		String output=sb.toString();
		System.out.println("Output: "+output);
		
		sc.close();
	}

}
