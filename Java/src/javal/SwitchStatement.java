package javal;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Choice :");
		System.out.println("-------------------");
		System.out.println("1- Add Two numbers");
		System.out.println("2- Get the Subtract of two numbers");
		System.out.println("3- Get the multiply of two numbers");
		int days = sc.nextInt();

		int firstNumber;
		int secondNumber;
		int sum;
		int sub;
		int multi;

		if (days < 3) {

			switch (days) {
			case 1:

				System.out.println("Enter the First Number");
				firstNumber = sc.nextInt();
				System.out.println("Enter the Second number");
				secondNumber = sc.nextInt();
				sum = firstNumber + secondNumber;
				System.out.println("SUM OF THE 2 NUMBER is" + " " + sum);
				break;
			case 2:

				System.out.println("Enter the First Number");
				firstNumber = sc.nextInt();
				System.out.println("Enter the Second number");
				secondNumber = sc.nextInt();
				sub = firstNumber - secondNumber;
				System.out.println("SUBTRACTION OF THE 2 NUMBER is" + " " + sub);

				break;
			case 3:

				System.out.println("Enter the First Number");
				firstNumber = sc.nextInt();
				System.out.println("Enter the Second number");
				secondNumber = sc.nextInt();
				multi = firstNumber * secondNumber;
				System.out.println("MULTIPLICATIO OF THE 2 NUMBER is" + " " + multi);

				break;

			}
		} else {
			System.out.println("Invalid Input");
		}

	}
}
