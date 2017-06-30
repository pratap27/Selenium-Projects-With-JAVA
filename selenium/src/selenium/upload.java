package selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class upload {
	
	@Test
	public void get() throws InterruptedException, IOException{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.zamzar.com/convert/txt-to-pdf/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	driver.findElement(By.xpath(".//*[@id='inputFile']")).click();
	Thread.sleep(5000);
	
	Runtime.getRuntime().exec("C:\\Users\\PRATAP27\\Desktop\\AutoItScript.exe\\");
	
	}
}
