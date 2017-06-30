package demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class day1_1 {
	
	static WebDriver d;
	
	public static void main(String[] args) throws InterruptedException {
		
		d = new FirefoxDriver();
		d.get("http://live.guru99.com/index.php/mobile.html");
		//d.get("http://live.guru99.com/index.php/");
		
		//WebElement a = d.findElement(By.xpath(".//*[@id='nav']/ol/li[1]/a"));
		//a.click();
		
		//Thread.sleep(2000);
		
		String exp_title = "Mobile";
		
		String act_title = d.getTitle();
		
		if(act_title.contains(exp_title)){
			
			System.out.println("Title is Working.");
		}
		
		else{
			
			System.out.println("Title is not Working.");
		}

	}

}
