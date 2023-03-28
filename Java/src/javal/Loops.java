package javal;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// FOR LOOP

		String name = "DInesh";
		
		System.out.println("Enter the number");

		for (int i = 0; i < name.length(); i++) {

			int numbers = sc.nextInt();

		}
		
		// While Loop
		System.out.println("Enter the number");
		
		int  number = sc.nextInt() ;
		while(number<=2) {
			System.out.println("Hi");
			number++;
		}
		
		// DO While Loop
		
		do {
			System.out.println("Executed once");
			number ++;
		}while(number <=5);
		
		

	}

}
