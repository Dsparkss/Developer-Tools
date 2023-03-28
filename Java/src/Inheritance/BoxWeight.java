package Inheritance;

public class BoxWeight extends Box {
	
	double weight ;
	
	public BoxWeight(){
		
		this.weight = 9;
		
	}
	
	public BoxWeight(double side, double weight) {
		super(side);
		this.weight = weight;
	}
	
	public BoxWeight(double l, double h, double w ,double weight) {
		super(l,h,w); // calling the parent constructor
		this.weight = weight;
		
	}

}


//Types of inheritance

//single inheritance
//Multilevel inheritance
//Multiple Inheritance When one class inheritance more than one class
//Hierarchial inheritance -one class inherited by many classes ex - Box class is inherited by all other classes
//Hybrid Inheritance - combination of single and multiple inheritance
