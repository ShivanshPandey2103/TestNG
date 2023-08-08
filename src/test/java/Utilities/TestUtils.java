package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.util.Date;
import Commons.Basetest;
//import sun.util.calendar.LocalGregorianCalendar.Date;

public class TestUtils extends Basetest{
	
	public void getScrenshot() throws IOException  {
		Date currentdate=new Date();
		//Calendar cal= Calendar.getInstance();
		//Date time=cal.getTime();
		String screenshotfilename= currentdate.toString().replace("","_").replace(":", "-");
		File screenshotfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotfile, new File(".//screenshot//" + screenshotfilename + ".png"));
	}

}
