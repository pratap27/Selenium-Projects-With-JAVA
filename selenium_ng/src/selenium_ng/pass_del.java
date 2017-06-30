package selenium_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pass_del {

	public static void main(String[] args) {
		FirefoxDriver d = new FirefoxDriver();
		d.get("https://www.w3schools.com/html/html_form_input_types.asp");
		WebElement block = d.findElement(By.xpath(".//*[@id='main']/input[3]"));
		block.sendKeys("pratap");
		block.sendKeys(Keys.CONTROL+"a");
		block.sendKeys(Keys.DELETE);
		
	}

}
