package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class day1_login {

	public static void main(String[] args) {
		
		WebDriver d = new FirefoxDriver();
		d.get("http://www.demo.guru99.com/V4/");
		WebElement a = d.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input"));
		a.sendKeys("mngr79273");
		WebElement b = d.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input"));
		b.sendKeys("jemebad");
		
		d.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();

	}

}
