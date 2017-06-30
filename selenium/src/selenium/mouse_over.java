package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouse_over {
	WebDriver d;
	@Test
	public void get(){
		d = new FirefoxDriver();
		d.get("http://www.guru99.com/");
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions a = new Actions(d);
		WebElement b = d.findElement(By.xpath(".//*[@id='g-navigation']/div/div/div[2]/div/nav/ul/li[2]/a/span[1]/span"));
		//WebElement c = d.findElement(By.xpath(".//*[@id='g-navigation']/div/div/div[2]/div/nav/ul/li[2]/a/span[1]/span"));
		a.moveToElement(b).build().perform();
		WebElement h = d.findElement(By.xpath(".//*[@id='g-navigation']/div/div/div[2]/div/nav/ul/li[2]/ul/li/div/div[1]/ul/li[3]/a/span/span"));
		h.click();
	}

}
