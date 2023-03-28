package StaticInstanceMethdVariable;

// Static method cannot be overided they print the method in the parent class

public class StaticNdInstanceMethod {

	public static String name = "Dinesh";
	public String name1 = "Surya";  
	
	
	public static void calculator(int a , int b) {
		
		int c = a+b;
		System.out.println("Static calcualtor" + " " + c);
		
	}
	
	public void calculator(int a , int b, int c) {
		int d = a + b + c;
		System.out.println("Instance Calculator" + " " + d);
	}

	public static void main(String[] args) {
		
		System.out.println("Printing the Static variable" + " " +name);
		
		StaticNdInstanceMethod iv = new StaticNdInstanceMethod() ;
		System.out.println("Printing the Instance varaible "+ " "  + iv.name1);
		
		calculator(23,24);
		iv.calculator(98, 12, 13);
	}

}
