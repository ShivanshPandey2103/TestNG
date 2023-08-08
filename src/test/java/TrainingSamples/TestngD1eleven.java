package TrainingSamples;

import org.testng.annotations.Test;

import Commons.commondata;

public class TestngD1eleven extends commondata {   // TO TEACH BEFORE SUITE AFTER SUITE , convert this class to test-ng and generate an xml file.
	
	@Test(groups="regression")
	public void atest1() {
		
		System.out.println("test1");
		
		
		}
	
	@Test(groups="regression")
	public void btest2() {
		
		System.out.println("test2");
	}
	
	
	@Test(groups={"regression","smoke"})
	public void btest3() {
		
		System.out.println("test3");
	}
	
	
	@Test(groups="bvt")
	public void btest4() {
		
		System.out.println("test4");
	}
	

}
