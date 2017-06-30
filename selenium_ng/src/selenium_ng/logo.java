package selenium_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class logo {

	public static void main(String[] args) {
		FirefoxDriver d = new FirefoxDriver();
		d.get("https://www.google.in/");
		WebElement s= d.findElement(By.id("hplogo"));
		if(s.isDisplayed()){
			System.out.println("logo is displayed");
		}else{
			System.out.println("logo not displayed");
		}
	}

}
