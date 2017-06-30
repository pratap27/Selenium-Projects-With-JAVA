package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class header_links {

	public static void main(String[] args) {
		FirefoxDriver d = new FirefoxDriver();
		d.get("https://www.redbus.in/");
		WebElement block = d.findElement(By.id("page_main_header"));
		List<WebElement> link = block.findElements(By.tagName("a"));
		for(int i =0; i<link.size();i++){
			System.out.println(link.get(i).getText());
		}
		
	}
}
