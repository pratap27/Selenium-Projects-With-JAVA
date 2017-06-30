package regression_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import constant.const_url;

public class manual_selenium {
	WebDriver d;
	@Test
	public void c() throws InterruptedException{
		d = new FirefoxDriver();
		d.get(const_url.url);
		d.findElement(By.xpath(".//*[@id='wrapper']/section[1]/div/nav/ul/li[3]/a")).click();
		d.findElement(By.xpath(".//*[@id='wrapper']/div/ul/li[8]/a")).click();
		//d.findElement(By.xpath(".//*[@id='wrapper']/div/ul/li[9]/a")).click();
		WebElement np = d.findElement(By.xpath(".//*[@id='wrapper']/section[2]/a[2]"));
		
		np.click();
		Thread.sleep(2000);
		d.findElement(By.xpath(".//*[@id='wrapper']/section[2]/a[1]")).click();
	}
}
