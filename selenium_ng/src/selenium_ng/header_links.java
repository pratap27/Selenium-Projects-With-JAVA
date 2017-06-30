package selenium_ng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class header_links {
	WebDriver d;
	@BeforeTest
	public void get(){
		d = new FirefoxDriver();
		d.get("https://www.w3schools.com/default.asp");
	}
	@Test
	public void g(){
		WebElement g = d.findElement(By.xpath("html/body/div[5]"));
		List<WebElement> s = g.findElements(By.tagName("a"));
		for(int i = 0; i<s.size(); i++){
			System.out.println(s.get(i).getText());
		}
		
	}
	

}
