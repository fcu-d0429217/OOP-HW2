package fcu.iecs.oop;
import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Enter a integer: ");
		num = sc.nextInt();
		
		if(num%2==0)
			System.out.print("The input integer is Even Number.");
		else
			System.out.print("The input integer is Odd Number.");
		
		sc.close();
	}

}
