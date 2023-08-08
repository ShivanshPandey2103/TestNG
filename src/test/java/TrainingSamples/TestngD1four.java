package TrainingSamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngD1four {      // INCLUDED THE BEFORE TEST AND AFTER TEST ANNOTATIONS
	
	
	@BeforeTest
	public void logintoapplication() {
		
		System.out.println("login Successful");
	}
	
	@AfterTest
	public void logoutfromapplication() {
		
		System.out.println("logout successful");
	}
	
	@Test(priority=1,description="This is a login Test")
	public void blogintest() {                                       
		
		System.out.println("login test passed");
		
	}
	
	@Test(priority=2,description="This is a logout test")
	public void alogouttest() {
		
		System.out.println("logout test passed");
	}

}
