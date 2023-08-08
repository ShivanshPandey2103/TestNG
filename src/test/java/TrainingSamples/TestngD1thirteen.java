package TrainingSamples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngD1thirteen {      //DATA PROVIDER 2ND METHOD.
	
	@Test(dataProvider="datas")
	public void Test(String Username, String Password, String test) {
		
		
		System.out.println(Username+" "+Password+" "+test);
		
		
	}
	
	
	
	
	@DataProvider(name = "datas")
	public Object[][] dataset1(){
		
		return new Object[][] {
			{"U1","P1","T1"},
			{"U2","P2","T2"},
			{"U3","P3","T3"},
			{"U4","P4","T4"}
			
			
		};
		
		
		
		
		
	}
	
	
	
	
}
