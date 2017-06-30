package common_utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constant.const_url;

public class cross_browser {
	
	WebDriver d;
	@Test
	@Parameters("Browsers")  
	public void g(String Browsers){
		if(Browsers.equalsIgnoreCase("firefox")){
			d = new FirefoxDriver();
		}
		else if(Browsers.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\pratap_reddy\\chromedriver.exe");
			d = new ChromeDriver();
		}
		else if(Browsers.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "C:\\pratap_reddy\\IEDriverServer.exe");
			d = new InternetExplorerDriver();
		}
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		d.get(const_url.url);
	
	}

}
