package TrainingSamples;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestingD1nine {    // SKIPPING OF TEST CASES(Used when a test case is unimplemented)
	
	
	boolean datasetup=true;
	
	@Test(enabled=false)       // FIRST METHOD TO SKIP. 
	public void skiptest1() {
		
		System.out.println("skipping this test as it is not implemented");
	}
	@Test
	public void skiptest2() {     // 2ND METHOD TO SKIP.
		
		System.out.println("skipping this test");
		throw new SkipException("skipping this test");
	}
	@Test
	public void skiptest3() {      // 3RD METHOD TO SKIP.
		
		System.out.print("Skipping this test based on a condition");
		if(datasetup==true) {
			System.out.println("execute the test");
		}
		else {
			System.out.print("skip the test");
			throw new SkipException("datasetup not created");
		}
	}

}
