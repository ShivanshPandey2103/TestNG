package TrainingSamples;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngD1fourteen {     // open sauce demo.com and enter all the user names and the given password using data provider and login
	
	
	@Test(dataProvider="datas22")
	public void test(String username , String Password) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Password);
	
		
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		driver.close();
		
	}
	
	
	
	
	
	
	@DataProvider(name = "datas22")
	public Object[][] dataset1(){
		
		return new Object[][] {
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"}
			
			
		};
		
	}

	}
