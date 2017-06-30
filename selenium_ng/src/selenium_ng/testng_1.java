package selenium_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng_1 {
	WebDriver d;
	@BeforeTest
	public void get()
	{
		d = new FirefoxDriver();
		d.get("http://newtours.demoaut.com/");
		
	}
	@Test
	public void g(){
		WebElement g = d.findElement(By.linkText("REGISTER"));
		g.click();
	}
	
	/* @AfterTest
	public void c(){
		
		d.close();
	} */

}
