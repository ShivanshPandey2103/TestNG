package TrainingSamples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngD1twelve {        //DATAPROVIDER
	
	
	@Test(dataProvider="dataset")   // test that will use the data from the data provider.
	public void test(String Username, String Password) {
		
		System.out.println(Username+" "+Password);
		
	}
	
	
	@DataProvider
	public Object[][] dataset() {   //make return type void first, when you'll return "dataset()" it will automatically say make return type as object[][]
		
		
		Object[][] dataset=new Object[4][2];
		//first row
		dataset[0][0]="user1";
		dataset[0][1]="user2";
		
		//second row
		dataset[1][0]="user3";
		dataset[1][1]="user4";
		
		//third row
		dataset[2][0]="user5";
		dataset[2][1]="user6";
		
		
		//fourth row
		dataset[3][0]="user7";
		dataset[3][1]="user8";
		
		return dataset; 
		
		
				
	}

}
