package javal;
import java.util.Scanner;

public class GettingInput {
	
	public static void main(String[] args) {
	
		Scanner src = new Scanner(System.in );
		System.out.println("CALCULATING THE STUDENT GRADE");
		System.out.println("Enter Your Name");
		String name = src.nextLine();
		
		System.out.println("Enter the Assignment Grade");
		int ag = src.nextInt();
		System.out.println("Enter the Final Exam Grade");
		int fg = src.nextInt();
		int totalg = ag + fg ;
		System.out.println(" Your Final Grade is " + totalg );
		
		//Arithmetic Operation () , * / , + - , =
		
		
	}

}
