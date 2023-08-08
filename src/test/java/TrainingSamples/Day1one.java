package TrainingSamples;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		//WebDriverManager.edgedriver().setup();
		//EdgeDriver  driver=new EdgeDriver();
		
		//WebDriverManager.firefoxdriver().setup();
		//FirefoxDriver driver=new FirefoxDriver();
		
		
		
		driver.get("https://www.google.com");
		
		driver.close();

	}

}
