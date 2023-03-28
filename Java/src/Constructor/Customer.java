package Constructor;

public class Customer {
	
	String name ;
	int creditLimit;
	String emailAddress;
	
	public Customer(String name,int creditLimit,String emailAddress) {
		
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
		
	}
	
	public Customer() {
		
		this("Dinesh",1000,"dinesh@gmail.com");		
	}
	
public Customer(String name,String emailAddress) {
		
		this(name,9000,emailAddress);		
	}


	
	public String getName() {
		return name;
	}
	public int getcreditLimit() {
		return creditLimit;
		
	}
	
	public String getemailAddress() {
		
		return emailAddress;
		
	}
	
	public static void main (String[] args) {
		
		Customer custom1 = new Customer();
		System.out.println("CUstomer Name =" + custom1.getName() + " " + "Customer credit Limit ="  + " " + custom1.getcreditLimit() + " " + " Customer Email =" + " " + custom1.getemailAddress());
		
		Customer custom2 = new Customer("Suresh","suresh@gmail.com");
		System.out.println("CUstomer Name =" + custom2.getName() + " " + "Customer credit Limit ="  + " " + custom2.getcreditLimit() + " " + " Customer Email =" + " " + custom2.getemailAddress());
		
	}
	
	

}
