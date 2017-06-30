package test_ng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import constant.const_url;

public class tutorial_links {
	@Test
	public void tut_lnks() {
		WebDriver d = new FirefoxDriver();
		d.get(const_url.url);
		d.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
		WebElement c = d.findElement(By.xpath(".//*[@id='wrapper']/section[1]/div/nav/ul/li[3]/a"));
		
		WebElement c1 = d.findElement(By.xpath(".//*[@id='menu']/ul/li[3]/ul/li[1]/a"));
		
		Actions a = new Actions(d);
		a.moveToElement(c).moveToElement(c1).build().perform();
		c1.click();
		
		WebElement block = d.findElement(By.xpath(".//*[@id='wrapper']/center/section/div[2]/ul"));
	
		//List<WebElement> link = block.findElements(By.tagName("li"));
		
		List<WebElement> l = block.findElements(By.tagName("a"));
		
		System.out.println("No.of.Links: "+ l.size());
		int k = 0;
		while(k<l.size()){	
			l.get(k).click();	
			//System.out.println(d.getCurrentUrl());
			System.out.println(l.get(k).getText());
			/*for(int j = 0; j<l.size(); j++){
				l.get(j).click();			
			}*/
			//d.navigate().back();
			k++;
		}
	}
}
