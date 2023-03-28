package StaticInstanceMethdVariable;

public class StaticOverride extends StaticNdInstanceMethod {
// can be inherited but cannot be overidde
public static void calculator(int a , int b) {
		
		int c = a+b;
		System.out.println("Static calcualtor in overide class" + " " + c);
		
	}

public static void main (String[] args) {
	
	calculator(90,100);
	
}

}
