package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class all_links {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PRATAP27\\Desktop\\my_Scripts\\java_ex\\libs\\geckodriver.exe");
		WebDriver s = new FirefoxDriver();
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		s.get("https://www.redbus.in/");
		//s.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

		List<WebElement> links = s.findElements(By.tagName("a"));
		System.out.println("Total Links: "+ links.size());
		
		for(int i=0; i<links.size(); i++){
			System.out.println(links.get(i).getText());
		}

	}

}
