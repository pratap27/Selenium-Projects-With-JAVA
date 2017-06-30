package demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class day1 {
	
	static WebDriver d; 
	public static void main (String [] args){
		
		d = new FirefoxDriver();
		
		d.get("http://live.guru99.com/index.php/");
		
		
		
		String exp_title = "Home page";
		
		String act_title = d.getTitle();
		
		if(act_title.contains(exp_title)){
			System.out.println("Title is Working.");
		}
		else{
			System.out.println("Title is not Working.");
		}
		
		WebDriverWait w = new WebDriverWait(d, 50);
		
		WebElement a = d.findElement(By.xpath(".//*[@id='nav']/ol/li[1]/a"));
		a.click();
		
	}

}
