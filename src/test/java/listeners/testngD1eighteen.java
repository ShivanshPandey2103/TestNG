package listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testngD1eighteen {

	
	@Test(groups="regression")                      // Tip : can fail a test case also and show "on test failure" listener also.
	public void atest1() {
		
		System.out.println("test1");
		Assert.assertTrue(false);
		
		
		
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
