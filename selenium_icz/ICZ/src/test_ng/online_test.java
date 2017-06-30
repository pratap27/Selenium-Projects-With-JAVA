package test_ng;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import constant.const_url;

public class online_test{
	@Test
	public void on_tst() throws IOException{
		
		WebDriver d = new FirefoxDriver();
		d.get(const_url.url);
		
		WebElement l11 = d.findElement(By.id("emailid1"));
	
		WebElement l22 = d.findElement(By.id("password"));
		
		WebElement l3 = d.findElement(By.xpath(".//*[@id='wrapper']/section[3]/div/div[1]/form/fieldset/div[3]/input"));
		
		l11.sendKeys("gpratapreddy@snycon.com");
		l22.sendKeys("pass12");
		l3.click();
		
		WebElement o1 = d.findElement(By.xpath(".//*[@id='menu']/ul/li[5]/a"));
		
		WebElement o2 = d.findElement(By.xpath(".//*[@id='menu']/ul/li[5]/ul/li[1]/a"));
		Actions a1 = new Actions(d);
		a1.moveToElement(o1).moveToElement(o2).build().perform();
		o2.click();
		online_test.g(d, "p1");
		
		d.findElement(By.xpath(".//*[@id='myCarousel']/div/div/ul/li[2]/div/ul/strong/li[1]/a")).click();
		
		d.findElement(By.xpath(".//*[@id='myCarousel']/div/div/ul/li[2]/div/a/button")).click();
		
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		WebElement submit=  d.findElement(By.xpath(".//*[@id='quiz']/a/center/button"));
		WebElement b = d.findElement(By.id("lessonThree"));
		List<WebElement> q = b.findElements(By.tagName("li"));
		//WebElement b = d.findElement(By.xpath(".//*[@id='lessonThree']/ul"));
		WebElement next = d.findElement(By.xpath(".//*[@id='lessonThree']/a[2]"));
		System.out.println("Links "+q.size());
		
		online_test.g(d, "p2");
		
		for(int i = 0; i<q.size(); i++){
			
			/*for(int j=0; j<q.size(); j++){
				boolean bValue = q.get(0).isSelected();
				if(bValue=true){
					q.get(0).click();
					}
				}*/
			next.click();
			
		}
		submit.click();
	}
	
	public static void g(WebDriver d1, String name) throws IOException{
		File src=((TakesScreenshot)d1).getScreenshotAs(OutputType.FILE);	
		FileUtils.copyFile(src, new File("./screenshot/"+ name +".png"));
	}

}
