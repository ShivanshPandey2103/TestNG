package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class listentoreport  implements ITestListener {

public void onTestStart(ITestResult result) {
	
	     
	    Reporter.log("Method name is -"+ result.getName());
		
		System.out.println("hello shivansh Pandey, your test has started");
		
	}
	
	public void onTestFailure(ITestResult result) {
		
		System.out.println("test failed-Screenshot captured"+"\n");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		Reporter.log("Ststus of execution is -"+result.getStatus());
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("hello Man, how was the test??");
	}

	
	
	
}
