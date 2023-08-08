package TrainingSamples;

import org.testng.Assert;
import org.testng.annotations.Test;

import Commons.Basetest;

public class testngD1nineteen extends Basetest {
    
	
	@Test
	public void launchapp() {
		
		driver.get("https://www.ebay.com");
		Assert.assertTrue(false);
		
	}
	
	
	
}
