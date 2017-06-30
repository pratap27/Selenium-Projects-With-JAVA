package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class footer_links {

	public static void main(String[] args) {
		FirefoxDriver d = new FirefoxDriver();
		d.get("https://www.redbus.in/");
		//d.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		WebElement block = d.findElement(By.xpath(".//*[@id='rh_footer']/div[2]/div/div"));
		List<WebElement> link = block.findElements(By.tagName("a"));
		for(int i =0; i<link.size();i++){
			if(!(link.get(i).getText().isEmpty())){
			link.get(i).click();
			d.navigate().back();
			//block = d.findElement(By.xpath(".//*[@id='rh_footer']/div[2]/div/div"));
			link = d.findElements(By.tagName("a"));
			System.err.println(link.get(i).getText());
			System.out.println(d.getCurrentUrl());
		}
	}
}
}