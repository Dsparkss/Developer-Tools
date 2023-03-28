package Ipolymorphism;

//poly - many morphism - many ways to represent
//Types of polymorphism

//1. Compile TIme / Static Polymorphism - method overloading early binding
//Method Overloading - same method name but different in types ,argumnet ,return type and ordering
//decide which method to be called during compile time

//2.Runtime Polymorphism / Dynamic Polymorphim /late binding
//Method Overriding - 

//overriding depends on the object new Shape(); --Upcasting
//Static method does not depend on object hence static method cannot be overrided

// methods mentioned in final cannot be overided

public class Shapes {
	
	void area() {
		System.out.println("I am the area of the shape");
	}
	
	//Early Binding 
	/*final void area() {
		
	}*/

}
