package TrainingSamples;

import org.testng.annotations.Test;
@Test(groups="user registration")
public class TestngD1eight {      // GROUPS ANNOTATION IN TESTNG, We can group tests into various categories.
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
