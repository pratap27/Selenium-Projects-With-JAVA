package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pass_keys {

	public static void main(String[] args) {
		FirefoxDriver d = new FirefoxDriver();
		d.get("https://www.bing.com/");
		d.findElement(By.xpath(".//*[@id='sb_form_q']")).sendKeys("redbus");

		d.findElement(By.xpath(".//*[@id='sb_form_go']")).click();

	}

}
