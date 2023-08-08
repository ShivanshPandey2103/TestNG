package Commons;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class commondata {     // HERE WE HAVE CREATED TWO METHODS WHICH WE WANT TO RUN BEFORE ALL THE CLASSES IN THE TEST SUITE (TESTNG1.XLM)
	
	@BeforeSuite
	public void datasetup() {
		
		System.out.println("Common data setup");
	}
	
	
	@AfterSuite
	public void Teardown() {
		
		
		System.out.println("Commom data teardown");
		
		
	}

}
