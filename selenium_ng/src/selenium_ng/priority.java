package selenium_ng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class priority {
	WebDriver d;
	@Test(priority=2)
	public void g(){
		d = new FirefoxDriver();
		d.get("http://www.amazon.in/");
		Actions a = new Actions(d);
		
		//d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement b = d.findElement(By.xpath(".//*[@id='nav-link-shopall']"));
		WebElement c = d.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[4]/span[1]"));
		a.moveToElement(b).moveToElement(c).build().perform();
		WebElement h = d.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[4]/div[2]/div/a[2]/span"));
		h.click();
	}
	@Test(priority=1)
	public void g1(){
		d = new FirefoxDriver();
		//d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("http://www.guru99.com/");
		
		
		Actions a = new Actions(d);
		WebElement b = d.findElement(By.xpath(".//*[@id='g-navigation']/div/div/div[2]/div/nav/ul/li[2]/a/span[1]/span"));
		//WebElement c = d.findElement(By.xpath(".//*[@id='g-navigation']/div/div/div[2]/div/nav/ul/li[2]/a/span[1]/span"));
		a.moveToElement(b).build().perform();
		WebElement h = d.findElement(By.xpath(".//*[@id='g-navigation']/div/div/div[2]/div/nav/ul/li[2]/ul/li/div/div[1]/ul/li[3]/a/span/span"));
		h.click();
	}
	@Test(priority=3)
	public void g2(){
		d = new FirefoxDriver();
		d.get("http://www.amazon.in/");
		Actions a = new Actions(d);
		
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement b = d.findElement(By.xpath(".//*[@id='nav-link-shopall']"));
		WebElement c = d.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[4]/span[1]"));
		a.moveToElement(b).moveToElement(c).build().perform();
		WebElement h = d.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[4]/div[2]/div/a[3]/span"));
		h.click();
		
	}

}
