package TrainingSamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Testngd1seventeen {                                   /*here we have created the browser invoking script and then converted to testng
                                                                   (testng2.xml)
                                                                    and then there we have created the classes tag and given class name in it
                                                                    and also the parameter tag and given parameter name and it's value*/
	//public static String browser ="chrome";
	public static WebDriver driver;
	@Parameters({"browser"})
	@Test()
	public void launchapplication(String browser) {
		// TODO Auto-generated method stub
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		driver.get("https://www.google.com");
		driver.close();
		
	}

}
