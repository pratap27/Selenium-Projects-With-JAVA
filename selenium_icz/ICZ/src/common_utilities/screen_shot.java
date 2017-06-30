package common_utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screen_shot {
	
		@Test
		public void g(WebDriver d, String name) throws IOException{
			TakesScreenshot ts=(TakesScreenshot)d;
			File srcfile=ts.getScreenshotAs(OutputType.FILE);
		
			FileUtils.copyFile(srcfile,new File ("./screenshot/"+name+".png"));
		}
		

}
