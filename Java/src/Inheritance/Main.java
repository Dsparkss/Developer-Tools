package Inheritance;

public class Main {
	
	public static void main (String[] args) {
		
		
		//Box box1 = new Box();
		//System.out.println("Height Box " + box1.h + " " + "Length Box " + box1.l + " " + "Width of the Box" + box1.w );
		
		Box box3 =  new Box(3);
		System.out.println("h" + box3.l + " " + box3.h + " " + box3.w);
		
		BoxWeight box2 = new BoxWeight(20 , 30,40,50);
		System.out.println(box2.weight + " height" + box2.h + "length " +box2.l + "Width" + box2.w);
		
		BoxPrice box4 = new BoxPrice(20,40,30);
		System.out.println(box4.cost + " " + box4.side + " " +box4.weight);
		
		BoxWeight box5 = new BoxWeight(20,40);
		System.out.println("" + box5.side + " " + box5.weight);
		
	}

}
