package learningMaven.myMavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HelloWorldTest {
	private WebDriver d;
	
	@BeforeTest
	public void before_test(){
		d = new FirefoxDriver();
	}
	
	@Test
	public void hello(){
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//System.setProperty("webdriver.gecko.driver", "C:\\Utility\\BrowserDrivers\\geckodriver.exe");
		//DesiredCapabilities dc = DesiredCapabilities.firefox();
		//dc.setCapability("marionette", true);
		//WebDriver driver =  new FirefoxDriver(dc);
		//driver.get("http://google.com/");
		System.out.println("Open Google");
		d.get("https://www.google.co.in/");
		
	}
	
	@AfterTest
	public void after_test(){
		d.quit();
	}
}
