package TrainingSamples;

import org.testng.annotations.Test;

public class TestngD1three {
	
	@Test(priority=1,description="This is a login Test")   // PRIORITY AND DESCRIPTION ATTRIBUTES FOR  @TEST ANNOTATION
	public void blogintest() {                                       
		
		System.out.println("login test passed");
		
	}
	
	@Test(priority=2,description="This is a logout test")
	public void alogouttest() {
		
		System.out.println("logout test passed");
	}

}
