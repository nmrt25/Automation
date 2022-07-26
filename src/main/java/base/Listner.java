package base;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("I am in the Success");
	
	}

	
	public void onTestFailure(ITestResult result) {
		System.out.println("I am in the Failure");
		
	}

	
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("I am in the SuccessPercentage");
	
	}

	
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("I am in the ");
	}

	
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("I am in the ");
		
	}

	
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("I am in the Finish Method");
	}

	

}
