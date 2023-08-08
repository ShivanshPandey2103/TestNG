package TrainingSamples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGD1five {    // INCLUDED THE BEFORE METHOD AND AFTER METHOD ANNOTATIONS.
	
	
	@BeforeMethod   
	public void connectToDB() {
		System.out.println("connected to db");
	}
	
	@AfterMethod
	public void disconnectfromdB() {
		
		System.out.println("disconnected from db");
		
	}
	
	@BeforeTest
	public void logintoapplication() {
		
		System.out.println("login Successful");
	}
	
	@AfterTest
	public void logoutfromapplication() {
		
		System.out.println("logout successful");
	}
	
	@Test(priority=1,description="This is a login Test")
	public void aTest1() {                                       
		
		System.out.println("test1");
		
	}
	
	@Test(priority=2,description="This is a logout test")
	public void bTest2() {
		
		System.out.println("test2");
	}

}
