package fcu.iecs.oop;
import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		float ft;
		String str;
		
		System.out.print("Enter a integer: ");
		num = sc.nextInt();
		System.out.print("Enter a float point number:");
		ft = sc.nextFloat();
		System.out.print("Enter a you name:");
		str = sc.next();
		
		System.out.printf("Hi %s ,the multiplication of %d and %.5f is %.2e",str,num,ft,ft*num);
		sc.close();
	}

}
