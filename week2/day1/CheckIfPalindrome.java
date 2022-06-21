package week2.day1.assignment;
import java.util.*;

public class CheckIfPalindrome {
	
	public static void main(String[] args) {
		
	    //Getting the input string 
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String text=sc.next();
		//Finding the length and converting into char array
		int length= text.length();
		char[] arr=text.toCharArray();
		char temp;
		//swapping elements to reverse the array
		for(int i=0;i<length/2;i++) {
			temp=arr[i];
			arr[i]=arr[length-1-i];
			arr[length-1-i]=temp;
		}
		//converting array back to string to compare it with the input string
		String revtext=String.valueOf(arr);
		if(text.equalsIgnoreCase(revtext))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
		
		sc.close();
		
	}

}
