package common_utilities;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pom_design.footer_links;

public class navigate_back {
	
	static WebDriver d = new FirefoxDriver();
	@Test
	
	public static void nav_back(){
		d.navigate().back();
	}
	
	public static void nav_forw(){
		d.navigate().forward();
	}
	
	public static void imp_wait(){
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	
	public static void get_url(){
		d.getCurrentUrl();
	}
	
	public static void screen_shot(String name) throws IOException{
		TakesScreenshot ts=(TakesScreenshot)d;
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile,new File ("./screenshot/"+name+".png"));
	}
	
	

}
