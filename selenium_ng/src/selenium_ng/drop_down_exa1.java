package selenium_ng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class drop_down_exa1 {
	WebDriver d;
	@BeforeTest
	public void get(){
		d = new FirefoxDriver();
		d.get("http://www.amazon.in/");
		
	}
	@Test
	public void g(){
		//WebElement b = d.findElement(By.linkText("Try it Yourself »"));
		//b.click();
		WebElement drop = d.findElement(By.name("url"));
		List<WebElement> s = drop.findElements(By.tagName("option"));
		
		//d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		for(int i = 0; i<s.size(); i++){

			System.out.println(s.get(i).getText());
		
		}
	}

}

