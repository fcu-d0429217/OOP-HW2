package fcu.iecs.oop;
import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1,str2;
		
		System.out.print("Enter a string 1: ");
		str1 = sc.next();
		System.out.print("Enter a string 2: ");
		str2 = sc.next();
		
		if(str1.equalsIgnoreCase(str2))
			System.out.print("The two strings are the same.");
		else
			System.out.print("The two strings are not the same.");
		
		sc.close();
	}

}
