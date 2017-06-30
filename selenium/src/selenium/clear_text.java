package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class clear_text {

	public static void main(String[] args) {
		FirefoxDriver d = new FirefoxDriver();
		d.get("https://www.w3schools.com/html/html_forms.asp");
		d.manage().window().maximize();
		WebElement f = d.findElement(By.xpath(".//*[@id='main']/div[3]/div/form/input[1]"));
		f.clear();
		

	}

}
