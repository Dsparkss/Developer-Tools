package javal;

public class HelloWorld {

	public static void main(String[] args) {
		
			
			String s = "madam";
			String t = "";
			for(int i =s.length()-1; i>=0; i--){
				t= t + s.charAt(i);
			}
			System.out.println(t);
			if(s==t) {
				
				System.out.print("Not");
				
			}else{
				System.out.print("pal");
			}
			
		}

}
