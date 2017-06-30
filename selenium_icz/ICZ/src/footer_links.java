

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import constant.const_url;

public class footer_links {
	
	@Test
	public void footerlinks() {
		
		WebDriver d = new FirefoxDriver();
		d.get(const_url.url);
		WebElement link = d.findElement(By.xpath(".//*[@id='footer-bar']/div"));
		List<WebElement> links = link.findElements(By.tagName("li"));
		
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		for(int i=0; i<links.size(); i++){
			links.get(i).click();
			System.out.println(d.getCurrentUrl());
			d.navigate().back();
			link = d.findElement(By.xpath(".//*[@id='footer-bar']/div"));
			links = link.findElements(By.tagName("a"));
			System.out.println(links.get(i).getText());
		}
	}

}
