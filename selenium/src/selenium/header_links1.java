package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class header_links1 {

	public static void main(String[] args) {
		FirefoxDriver d = new FirefoxDriver();
		d.get("https://www.redbus.in/");
		d.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		WebElement block = d.findElement(By.id("page_main_header"));
	
		List<WebElement> link = block.findElements(By.tagName("a"));
		System.out.println("No.of.Links: "+ link.size());
		for(int i =0; i<link.size();i++){
			link.get(i).click();
			//System.out.println(link.get(i).getText());
			System.out.println(d.getCurrentUrl());
			d.navigate().back();
			block = d.findElement(By.id("page_main_header"));
			link = block.findElements(By.tagName("a"));
			/* if(!(link.get(i).getText().isEmpty()))
	            {
	            link.get(i).click();
	            d.navigate().back();
	            //block = d.findElement(By.id("page_main_header"));
	            link=d.findElements(By.tagName("a"));
	            System.out.println(link.get(i).getText());
	            System.out.println(d.getCurrentUrl());
	           } */  
		}

	}

}
