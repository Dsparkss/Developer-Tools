package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day5 {
	
	
	
	@Parameters({"object"})
	@Test
	public void toy3(String un){
		System.out.println("hi iam the middle ");
		System.out.println(un);
	}
	
	@BeforeTest
	public void toy(){
		System.out.println("Should be printed first");
	}
	
	@BeforeSuite
	public void don() {
		System.out.println("I will be printed first");
	}
	
	
	@AfterSuite
	public void don1() {
		System.out.println("Thank You");
	}
	
	@BeforeMethod
	public void don2() {
		System.out.println("lets start the method");
	}
	
	@AfterMethod
	public void don3() {
		System.out.println("The method has ended");
	}
	
	
	
	@Parameters("parts")
	@Test(groups= {"Print"})

	public void toy1(String s){
		System.out.println("hi iam the middle ");
		System.out.println(s);
	}
	
	@AfterTest
	public void toy2(){
		System.out.println("hi this my last message");
	}
	
	

}
