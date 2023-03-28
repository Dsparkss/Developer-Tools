package javal;
import java.util.Scanner;

public class ControlStatement {
	public static void main(String[] args) {
		
		// IF STATEMENT 
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER YOUR AGE");
		int age = sc.nextInt();
		
		
		if(age <18) {
			System.out.println("YOUR NOT ELIGIBEL TO REGISTER");
		}else {
			System.out.println("welcome to the TAX PAY ROLL");
		}
		
		int salary =5000;
		System.out.println("Enter Your salary");
		int salaryA = sc.nextInt();
		if(salary > salaryA) {
			System.out.println("Need Not Pay Tax");
			if(salaryA == 2000) {
				System.out.println("You need 3000 More to pay tax");
			}else if (salaryA == 3000 ) {
				System.out.println("You need 2000 More to pay tax");
				
			}else if (salaryA == 1000 ) {
				System.out.println("You need 4000 More to pay tax");
				
			}else {
				System.out.println("You need 1000");
			}
			
		}else if (salary < salaryA) {
			
			System.out.println("Need to Pay Tax");
			
		}else {
			System.out.println("YOU ESCAPED ");
		}
		
		
		
		
		
	}

}
