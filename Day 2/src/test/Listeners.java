package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Listeners implements ITestListener {
	
	ExtentTest test;
	
	ExtentReports extent = Extentreports.oneDemo();
	
	
	
	 @Override		
	    public void onFinish(ITestContext arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onStart(ITestContext arg0) {					
	        // TODO Auto-generated method stub
	    	
	        		
	    }		

	    @Override		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestFailure(ITestResult arg0) {			
	    	test.fail(arg0.getThrowable());
	        System.out.println("I FAILED IAM SORRY" + " " +  " [Method name is : " + arg0.getName()+ "]");	
	       
	        		
	    }		

	    @Override		
	    public void onTestSkipped(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestStart(ITestResult arg0) {					
	        // TODO Auto-generated method stub	
	    	test = extent.createTest(arg0.getMethod().getMethodName());
	        		
	    }		

	    @Override		
	    public void onTestSuccess(ITestResult arg0) {					
	        System.out.println("The code run Successfully");
	        
	        		
	    }		

}
