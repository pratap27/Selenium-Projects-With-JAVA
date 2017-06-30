package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pass_click {

	public static void main(String[] args) {
		FirefoxDriver d = new FirefoxDriver();
		d.get("https://www.udemy.com/join/login-popup/");
		d.manage().window().maximize();
		WebElement f = d.findElement(By.name("email"));
		f.sendKeys("pratap.reddy40@gmail.com");
		WebElement g = d.findElement(By.name("password"));
		g.sendKeys("pratap24@");
		WebElement s = d.findElement(By.xpath(".//*[@id='submit-id-submit']"));
		s.click();
		

	}

}
