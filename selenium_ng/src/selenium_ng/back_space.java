package selenium_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class back_space {

	public static void main(String[] args) {
		FirefoxDriver d = new FirefoxDriver();
		d.get("https://www.w3schools.com/html/html_forms.asp");
		d.manage().window().maximize();
		WebElement g = d.findElement(By.name("firstname"));
		String t=g.getAttribute("value");
		int c=t.length();
		for(int i=c;i>0;i--){
			g.sendKeys(Keys.BACK_SPACE);
		}
		

	}

}
