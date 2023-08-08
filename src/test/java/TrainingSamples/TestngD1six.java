package TrainingSamples;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngD1six {
    @Test
	public void titletest() {                               //ASSERTION OF ACTUAL TITLE AND EXPECTED TITLE USING HARD ASSERT CLASS
    	                                                    // here if the test case fails then execution stops then and there , hence there is
    	                                                    // a major problem with the hard assert class.
    
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		String expectedtitle ="Electronics, Cars, Fashion, Collectibles & More | eBay";
		String actualtitle= driver.getTitle();
		Assert.assertEquals(actualtitle,expectedtitle );
		driver.quit();
	}

}
