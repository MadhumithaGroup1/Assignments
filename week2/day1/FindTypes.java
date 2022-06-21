package week2.day1.assignment;
import java.util.*;

public class FindTypes {
	
	public static void main(String[] args) {
		
		//get the input string
		System.out.println("Enter a string with different types of characters");
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		
		//convert the input string into char array
		char[] arr=text.toCharArray();
		
		//find length of array and initiate the count variables for the diff. types of characters
		int length=text.length(), letter=0, number=0, space=0, specialchar=0;
		
		//traverse through the array using loop
		for(int i=0;i<length;i++) {
			if(Character.isLetter(arr[i])==true)
				letter++;
			else if(Character.isDigit(arr[i])==true)
				number++;
			else if(Character.isWhitespace(arr[i])==true)
				space++;
			else
				specialchar++;
		}
		//print the count of the diff. type of characters
		System.out.println("Letters="+letter);
		System.out.println("Numbers="+number);
		System.out.println("Spaces="+space);
		System.out.println("SpecialCharacters="+specialchar);
		
		sc.close();
	}

}
