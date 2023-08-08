package TrainingSamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestngD1ten {                      //BEFORE CLASS AFTER CLASS,BEFORE GROUP AFTER GROUP.
	
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("run this before class");
		
	}
	
	@AfterClass
    public void afterClass() {
		
		System.out.println("run this test after class");
		
	}
	
	@BeforeGroups(value="regression")
	public void beforegroup() {
		
		System.out.println("run this test before regression");
		
	}
	
	@AfterGroups(value="regression")
	public void aftergroup() {
		System.out.println("run this test after regression");
		
	}
	
	
	
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
