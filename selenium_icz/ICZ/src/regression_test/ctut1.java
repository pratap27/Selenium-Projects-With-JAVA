package regression_test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import constant.const_url;

public class ctut1 {

	WebDriver d;
	@Test
	public void c1() throws InterruptedException{
		d = new FirefoxDriver();
		d.get(const_url.url);
		d.findElement(By.xpath(".//*[@id='wrapper']/section[1]/div/nav/ul/li[3]/a")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='wrapper']/div/ul/li[1]/a")).click();
		//d.findElement(By.xpath(".//*[@id='wrapper']/div/ul/li[1]/a")).click();
		WebElement list = d.findElement(By.xpath(".//*[@id='myTopnav']"));
		List<WebElement> links = list.findElements(By.tagName("a"));
		System.out.println("links: "+links.size());
		for(int i=0; i<links.size(); i++){
			links.get(i).click();
			//d.navigate().back();
			list = d.findElement(By.xpath(".//*[@id='myTopnav']"));
			links = list.findElements(By.tagName("a"));
			System.out.println(links.get(i).getText());
		}
	
	}
}
