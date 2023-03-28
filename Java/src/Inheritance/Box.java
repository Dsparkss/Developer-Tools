package Inheritance;

public class Box {
	
	double l ;
	double h;
	double w;
	double side;
	
	
	public Box() {
		this.l = -1;
		this.h = -2;
		this.w = 3;
		
	}
	
	public Box(double side) {
		this.l = side;
		this.h=side;
		this.w = side;
	}
	
	public Box(double l, double h, double w ) {
		
		this.l = l;
		this.h = h;
		this.w = w;
	}

}
