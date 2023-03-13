package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class da3 {

	
		
		
	@BeforeTest
	public void toy(){
		System.out.println("hi iam the first");
	}
	
	@Test(groups= {"Print"})
	public void toy1(){
		System.out.println("HI I TRIED BUT FAILED ");
		Assert.assertTrue(false);
	}
	
	@AfterTest
	public void toy2(){
		System.out.println("hi iam the last");
	}
	
	

	

}
