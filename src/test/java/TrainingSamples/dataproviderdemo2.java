package TrainingSamples;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class dataproviderdemo2 {   //HERE I HAVE CREATED SINGLE DATAPROVIDER FILE AND USED IF ELSE CONDITION FOR USE OF THEM IN VARIOUS TESTS
	                                 // TEST CASES ARE IN TESTNGD1SIXTEEN CLASS FILE
	@DataProvider(name = "datas")
	public Object[][] dataset1(Method m)
	{
		
		
		Object[][] testdata=null;
		
		
		if(m.getName().equals("test"))
		{
			
		testdata= new Object[][] 
	    {
			
			{"U1","P1"},
			{"U2","P2"},
			{"U3","P3"},
			{"U4","P4"}
			
			
		};
		
		}
		
		else if(m.getName().equals("Test1"))
		{
			
			testdata= new Object[][] 
			{
				
				{"U1","P1","T1"},
				{"U2","P2","T2"},
				{"U3","P3","T3"},
				{"U4","P4","T4"}
				
				
			};
			
		}
		return testdata;
		
		}
		
	
}
