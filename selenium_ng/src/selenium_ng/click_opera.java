package selenium_ng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class click_opera {
	WebDriver d;
	@Test
	public void get(){
		d = new FirefoxDriver();
		d.get("https://www.google.co.in/");
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Actions a = new Actions(d);
		WebElement b = d.findElement(By.linkText("Gmail"));
		a.contextClick(b).sendKeys(Keys.ARROW_DOWN);
		a.contextClick(b).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
	

}
