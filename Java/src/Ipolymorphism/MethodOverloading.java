package Ipolymorphism;

public class MethodOverloading {
	
	String name (String name) {
		return name;
	}
	
	int name (int a , int b) {
		return a+b;
	}
	
	 double  name (double a , double b) {
		 return a+b;
	 }
	 
	public static void main(String[] args) {
		MethodOverloading method = new MethodOverloading();
		System.out.println(method.name("Dinesh"));
		System.out.println(method.name(90,10));
		System.out.println(method.name(90, 89));
		
	}
}