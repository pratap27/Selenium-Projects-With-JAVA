package test_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import constant.const_url;

public class login {
	@Test
	public void log(){
		
		WebDriver d = new FirefoxDriver();
		d.get(const_url.url);
		
		WebElement l1 = d.findElement(By.id("emailid1"));
		WebElement l2 = d.findElement(By.id("password"));
		WebElement l3 = d.findElement(By.xpath(".//*[@id='wrapper']/section[3]/div/div[1]/form/fieldset/div[3]/input"));

		l1.sendKeys("gpratapreddy@snycon.com");
		l2.sendKeys("pass12");
		l3.click();

	}

}
