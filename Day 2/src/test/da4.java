package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class da4 {
	
	@Test(dataProvider = "getdata")
	public void hai(String first,String second, String third){
		System.out.println("hi");
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
	}
	
	@Test(groups= {"Print"})
	public void haii(){
		System.out.println("hi this ");
	}
	
	@Test(groups= {"Print"})
	public void haiii(){
		System.out.println("hi this is my toy");
	}
	
	@DataProvider
	public Object[][] getdata(){
		Object num[][] = new Object[2][3];
		num[0][0] = "Username1";
		num[0][1] = "Password1";
		num[0][2] = "Id1";
		num[1][0] = "Username2";
		num[1][1] = "Password2";
		num[1][2] = "Id2";
		return num;
	}

}
