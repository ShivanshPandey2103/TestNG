package TrainingSamples;

import org.testng.annotations.Test;

public class TestngD1sixteen {
	
	
	@Test(dataProvider="datas",dataProviderClass=dataproviderdemo2.class)   // test that will use the data from the data provider.
	public void test(String Username, String Password) {
		
		System.out.println(Username+" "+Password);
		
	}
		
	
	@Test(dataProvider="datas",dataProviderClass=dataproviderdemo2.class)
	public void Test1(String Username, String Password, String test1) {
		
		
		System.out.println(Username+" "+Password+" "+test1);
		
		
	}

}
