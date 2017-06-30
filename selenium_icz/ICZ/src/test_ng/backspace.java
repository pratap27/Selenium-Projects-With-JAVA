package test_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import constant.const_url;

public class backspace {
	
	@Test
	public void back_s() {
		WebDriver d = new FirefoxDriver();
		d.get(const_url.url);
		d.manage().window().maximize();
		
		d.findElement(By.xpath(".//*[@id='top-bar']/div/div[2]/div/nav/ul/li[2]/a")).click();
		WebElement g = d.findElement(By.id("fname"));
		g.sendKeys("pratap");
		String t=g.getAttribute("value");
		int c=t.length();
		for(int i=c;i>0;i--){
			g.sendKeys(Keys.BACK_SPACE);
		}
	}
}
