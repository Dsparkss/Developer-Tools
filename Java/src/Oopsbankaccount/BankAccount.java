package Oopsbankaccount;

public class BankAccount {

	private int accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	int totalBalance;
	
	//this keyword is used to branch constructor

	public BankAccount() {
		this(123345,5001.00,"Bobb Brown", "mmyemail@bob.com", "(7087) 123-4567");
		System.out.println("Hi I am the constructor for the class Bank account");
	}

	public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		System.out.println("am i printing");

	}
	
	public BankAccount(String customerName,String phoneNumber,String email) {
		this(999999,100.0,customerName,phoneNumber,email);
	}

	public void depositFunds(double depositAmount) {

		balance += depositAmount;
		System.out.println("Depost of $" + depositAmount + "made. New balnce is $" + balance);

	}

	public void withdrawFund(double withdrawAmount) {

		if (balance - withdrawAmount < 0) {
			System.out.println("Insufficient Funds! You only have $" + balance + " in your account.");
		} else {
			balance -= withdrawAmount;
			System.out.println("Withdrawal of $" + withdrawAmount + " processed, Remaining balance = $" + balance);
		}

	}

	public int getaccountNumber() {
		return accountNumber;
	}

	public double getaccountBalance() {
		return balance;
	}

	public String getcustomerName() {
		return customerName;
	}

	public String getemail() {
		return email;
	}

	public String phoneNumber() {
		return phoneNumber;
	}

	public void setaccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setaccountBalance(double balance) {
		this.balance = balance;
	}

	public void setcustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static void main(String[] args) {

	}

}

/*
 * public void deposting() {
 * 
 * System.out.println("Enter the amount to be deposited .More than 100");
 * Scanner sc = new Scanner(System.in); int dpamnt = sc.nextInt(); if(dpamnt
 * >100) { System.out.println("Amount Deposited Succesfully"); totalBalance =
 * accountBalance + dpamnt ;
 * 
 * System.out.println("Totall Balance in your Account is" + " " + totalBalance);
 * }else { System.out.println("Maximum amount must be 100"); }
 * 
 * 
 * 
 * }
 * 
 * public void withdrawing() { if(accountBalance < 0) {
 * System.out.println("You're balnace is 0");
 * System.out.println(accountBalance); }else if(accountBalance > 0) {
 * System.out.println("Your Balance is" + " " + totalBalance);
 * System.out.println("enter the amount to withdraw"); Scanner sc = new
 * Scanner(System.in); int wtamnt = sc.nextInt(); if(wtamnt < totalBalance ) {
 * System.out.println("Amount withdrawn"); int availableBalance = totalBalance -
 * wtamnt ; System.out.println("Your available balance is" + availableBalance +
 * "Rs" ); }else { System.out.println("Balance is to0 low"); }
 * 
 * 
 * } }
 */
