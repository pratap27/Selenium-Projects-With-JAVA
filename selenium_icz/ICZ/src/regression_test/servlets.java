package regression_test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import constant.const_url;

public class servlets {
	WebDriver d;
	@Test
	public void c(){
		d = new FirefoxDriver();
		d.get(const_url.url);
		WebElement t = d.findElement(By.xpath(".//*[@id='wrapper']/section[1]/div/nav/ul/li[3]/a"));
		t.click();
		//WebElement t1 = d.findElement(By.xpath(".//*[@id='menu']/ul/li[3]/ul/li[5]/a"));
		WebElement t1 = d.findElement(By.xpath(".//*[@id='wrapper']/div/ul/li[5]/a"));
		t1.click();
		
		/*Actions a1 = new Actions(d);
		a1.moveToElement(t).moveToElement(t1).build().perform();
		t1.click();*/
		WebElement c1 = d.findElement(By.xpath(".//*[@id='wrapper']/div[2]/ul/b"));
		List<WebElement> links = c1.findElements(By.tagName("li"));
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Links: "+links.size());
		for(int i=0; i<links.size(); i++){
			links.get(i).click();
			System.out.println(d.getCurrentUrl());
			d.navigate().back();
			c1 =  d.findElement(By.xpath(".//*[@id='wrapper']/div[2]/ul/b"));
			links = c1.findElements(By.tagName("li"));
			System.out.println(links.get(i).getText());
			
		}
	}

	

}
