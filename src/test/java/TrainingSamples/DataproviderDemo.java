package TrainingSamples;

import org.testng.annotations.DataProvider;

public class DataproviderDemo {
	
	
	
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
