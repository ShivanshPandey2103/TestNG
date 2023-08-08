package TrainingSamples;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGD1seven {
	
	@Test
	public void titletest() {                 //ASSERTION OF ACTUAL TITLE AND EXPECTED TITLE USING  SOFTASSERT CLASS
		// TODO Auto-generated method stub
		SoftAssert softassert=new SoftAssert();
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		String expectedtitle ="Electronics, Cars, Fashion, Collectibles & More | eBay";
		String actualtitle= driver.getTitle();
		softassert.assertEquals(actualtitle,expectedtitle );
		driver.quit();
		softassert.assertAll();
	}

}
