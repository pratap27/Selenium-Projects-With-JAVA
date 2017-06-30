package test_ng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import common_utilities.navigate_back;
import constant.const_url;

public class header_links {
	
	@Test
	public void headerlinks(){
		WebDriver d = new FirefoxDriver();
		d.get(const_url.url);
		d.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
		WebElement block = d.findElement(By.xpath(".//*[@id='top-bar']/div/div[2]"));
	
		List<WebElement> link = block.findElements(By.tagName("a"));
		
		System.out.println("No.of.Links: "+ link.size());
		
		for(int i =0; i<link.size();i++){
			link.get(i).click();
			System.out.println(d.getCurrentUrl());
			d.navigate().back();
			//navigate_back.nav_back();
			block = d.findElement(By.xpath(".//*[@id='top-bar']/div/div[2]"));
			link = block.findElements(By.tagName("a"));
			System.out.println(link.get(i).getText());
			
		}

	}

}
