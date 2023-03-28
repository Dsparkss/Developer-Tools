package Oops;

public class ClassObjects {

	private String make = "BMW";
	private String model= "2359";
	private String color= "Black";
	private int wheels = 4;
	

	public  void describeCar() {

		System.out.println(  "Wheels" + " " + color + " " + make + " " + model + "" + wheels);
	}
	
	public String getmake() {
		return make;
	}
	public String getmodel() {
		return model;
	}
	public String getcolor() {
		return color;
	}
	public int getwheels() {
		return wheels;
	}
	
	public void setmake(String make) {
		this.make = make;
	}
	
	public void setmodel(String model) {
		this.model = model;
	}
	public void setcolor(String color) {
		this.color =color;
	}
	
	public void setwheels(int wheels) {
		this.wheels =wheels;
	}
	
	public static void main (String[] args) {
		//ClassObjects sc = new ClassObjects("bmw", "Vs", "black",98);
		//sc.describeCar();
		
		
		
	}

}
