package week2.day1.assignment;
import java.util.*;

public class CheckIfAnagram {
	
	public static void main(String[] args) {
		
		//get the 2 strings
		System.out.println("Enter the first string");
		Scanner sc=new Scanner(System.in);
		String text1=sc.next();
		System.out.println("Enter the second string");
		String text2=sc.next();
		
		//find the length and compare the length. If equal proceed, else, not anagram
		int length1=text1.length(), length2=text2.length();
		if(length1==length2) {
			//convert into char array, sort both the arrays
			char[] arr1=text1.toCharArray(), arr2=text2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			//compare the arrays. If equal anagram, elae, not anagram
			if(Arrays.equals(arr1, arr2))
				System.out.println("The given strings are Anagram");
			else
				System.out.println("The given strings are not Anagram");
		}
		else
			System.out.println("The given strings are not Anagram");
		sc.close();
		
	}

}
