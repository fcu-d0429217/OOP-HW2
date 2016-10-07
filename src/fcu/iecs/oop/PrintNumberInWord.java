package fcu.iecs.oop;
import java.util.Scanner;

public class PrintNumberInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] str = {"ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
		int num;
		
		System.out.print("Enter a integer: ");
		num = sc.nextInt();
		
		if(num<1 || num>9)
			System.out.print("The input integer is \"OTHER\"");
		else
			System.out.printf("The input integer is \"%s\"",str[num-1]);
	}

}
