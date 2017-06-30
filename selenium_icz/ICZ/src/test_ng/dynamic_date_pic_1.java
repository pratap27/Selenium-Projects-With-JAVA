package test_ng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class dynamic_date_pic_1 {
	
	@Test
	public void date_picker() throws InterruptedException{
		
		WebDriver driver=new FirefoxDriver();
		 
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("onward_cal")).click();
		Thread.sleep(2000);
		String expmnth = "November2017";
		// month select
		String curmnth = driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]")).getText();
		
		if(expmnth.equals(curmnth))
		{
			System.out.println("mnth is already selected");}
		
			else
				
			{
				for(int i=0;i<12;i++)
				{   // next button
					driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();
					Thread.sleep(1000);
					
					// header display
					curmnth=driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]")).getText();
					System.out.println(curmnth);
					if(expmnth.equals(curmnth))
					{
						System.out.println("month is selected");
						break;
					}
					
				}
		}
		Thread.sleep(2000);
		// total date panel
		WebElement mnth=driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']"));
		List<WebElement> allDates=mnth.findElements(By.tagName("td"));
		
		for(WebElement ele:allDates)
		{	
			if(ele.getText().equals("14"))
			{
				 ele.findElement(By.linkText("14")).click();
				break;
			}	
		}
		Thread.sleep(2000);
	}

}
