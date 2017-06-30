package selenium_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practise_ex1 {

	public static void main(String[] args) {
		FirefoxDriver d = new FirefoxDriver();
        d.get("https://www.w3schools.com/html/html_forms.asp");
        d.manage().window().maximize();
		WebElement f = d.findElement(By.xpath(".//*[@id='main']/input[1]"));
		f.sendKeys("pratap");
		//WebElement t = f.findElement(By.xpath(".//*[@id='main']/input[1]"));
		f.sendKeys(Keys.CONTROL+"a");
		f.sendKeys(Keys.CONTROL+"c");
		d.findElement(By.xpath(".//*[@id='main']/input[2]")).sendKeys(Keys.CONTROL+"v");
		

	}

}
