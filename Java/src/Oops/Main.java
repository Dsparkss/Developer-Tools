package Oops;

public class Main {
	
	public static void main(String[] args) {
	
	ClassObjects sc = new ClassObjects();
	sc.setcolor("Black");
	sc.setmake("Classic");
	sc.setmodel("BS6");
	sc.setwheels(4);
	System.out.println(sc.getmake());
	System.out.println(sc.getmodel());
	sc.describeCar();
	
		
	
	}
}
