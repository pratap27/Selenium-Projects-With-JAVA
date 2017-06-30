package selenium_ng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouse_over1 {
	
	WebDriver d;
	@Test
	public void get(){
		System.setProperty("webdriver.gecko.driver","C:\\Program Files (x86)\\Mozilla Firefox\\libs\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		
		d = new FirefoxDriver();
		d.get("http://www.amazon.in/");
		Actions a = new Actions(d);
		
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 		
		WebElement b = d.findElement(By.xpath(".//*[@id='nav-link-shopall']/span[2]"));
		WebElement c = d.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[8]/span"));
		a.moveToElement(b).moveToElement(c).build().perform();
		WebElement h = d.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[8]/div[1]/div/a[1]/span"));
		h.click();
		
		
	}
	
}
