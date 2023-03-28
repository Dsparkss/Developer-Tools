package Oopsbankaccount;



public class Main {
	public static void main (String[] args) {
		
		
		BankAccount bank = new BankAccount();
		//BankAccount bank = new BankAccount(12345,500.00,"Bob Brown", "myemail@bob.com", "(087) 123-4567");
		
		/* bank.setaccountNumber(12345);
		 bank.setaccountBalance(1000.00);
		 bank.setcustomerName("Bob Brown");
		 bank.setemail("myemail@bob.com");
        bank.setphoneNumber("(087) 123-4567");*/
		
		System.out.println(bank.getaccountBalance());
		System.out.println(bank.getaccountNumber());
        
        bank.withdrawFund(100.0);
        bank.depositFunds(250);
        bank.withdrawFund(50);

        bank.withdrawFund(200);

        bank.depositFunds(100);
        bank.withdrawFund(45.55);
        bank.withdrawFund(54.46);

        bank.withdrawFund(54.45);
        
        BankAccount bank1 = new BankAccount("DInesh", "98987787" , "kskhdskjdkd");
        System.out.println("Account number =" + bank1.getaccountNumber() + " " + "Balance aMOUNT =" +bank1.getaccountBalance());
	}

}
