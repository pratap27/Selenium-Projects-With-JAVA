package selenium_ng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class drop_down_all {
	WebDriver d;
	@BeforeTest
	public void get(){
		d = new FirefoxDriver();
		d.get("http://newtours.demoaut.com/");
		
	}
	@Test
	public void g(){
		WebElement b = d.findElement(By.linkText("REGISTER"));
		b.click();
		WebElement drop = d.findElement(By.name("country"));
		//Select a = new Select(drop);
		//a.selectByVisibleText("INDIA");

		List<WebElement> s = drop.findElements(By.tagName("option"));
		for(int i=0; i<s.size(); i++){
			s.get(i).click();
			if(s.get(i).isSelected()){
				System.out.println(s.get(i).getText()+"\t"+" Active");
			}else{
				System.out.println(s.get(i).getText()+"\t"+" Inactive");
			}
		}
	}
}
