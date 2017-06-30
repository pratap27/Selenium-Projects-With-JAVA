package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class copy_paste {

	public static void main(String[] args) {
		FirefoxDriver d = new FirefoxDriver();
		d.get("https://www.w3schools.com/html/html_forms.asp");
		d.manage().window().maximize();
		WebElement f = d.findElement(By.name("firstname"));
		f.sendKeys(Keys.CONTROL+"a");
		f.sendKeys(Keys.CONTROL+"c");
		WebElement g = d.findElement(By.name("lastname"));
		g.clear();
		g.sendKeys(Keys.CONTROL+"v");
	}

}
