package selenium_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testclass {

	public static void main(String[] args) {
		FirefoxDriver d = new FirefoxDriver();
		d.get("https://www.w3schools.com/html/html_forms.asp");
		WebElement text = d.findElement(By.name("firstname"));
		String f = text.getAttribute("value");
		System.out.println(f);
		
	}

}
