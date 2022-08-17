package friens.friends;

import java.util.Scanner;

public class ExceptionEx {
	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println(10/0);
//		scanner.close();
		
		int numberA = 10;
		int numberB = 0;
		
		try {
		int result = numberA / numberB;
		System.out.println(result);
		}catch (ArithmeticException e) {
			System.out.println("this excption happened because number B is zero");
		}finally {
			System.out.println("Finally Block is running");
		}
	}

}
//rOZBEH
