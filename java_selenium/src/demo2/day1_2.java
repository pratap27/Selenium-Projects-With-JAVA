package demo2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class day1_2 {
	
	static WebDriver d;

	public static void main(String[] args) {
		
		d = new FirefoxDriver();
		d.get("http://live.guru99.com/index.php/mobile.html");
		WebElement a = d.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select"));
		Select s = new Select(a);
		s.selectByVisibleText("Name");
		
	}

}
