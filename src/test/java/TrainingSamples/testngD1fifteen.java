package TrainingSamples;

import org.testng.annotations.Test;

public class testngD1fifteen {
	
	
	@Test(dataProvider="datas",dataProviderClass=DataproviderDemo.class)
	public void Test(String Username, String Password, String test) {
		
		
		System.out.println(Username+" "+Password+" "+test);
		
		
	}

}
