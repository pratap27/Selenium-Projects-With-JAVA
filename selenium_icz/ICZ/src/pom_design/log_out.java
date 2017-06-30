package pom_design;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common_utilities.excel_read;

public class log_out extends excel_read{

	@FindBy(id = "emailid1")
	WebElement l11;
	
	@FindBy(id="password")
	WebElement l22;
	
	@FindBy(xpath= ".//*[@id='wrapper']/section[3]/div/div[1]/form/fieldset/div[3]/input")
	WebElement l3;
	
	@FindBy(xpath=".//*[@id='top-bar']/div/div[2]/div/nav/ul/li[3]/a")
	WebElement l1;
	
	@FindBy(xpath=".//*[@id='menu']/ul/li[3]/span/a")
	WebElement l2;
	

	public log_out(WebDriver d){
		PageFactory.initElements(d, this);
	}
	
	public void log(WebDriver d) throws InterruptedException, IOException{
		l11.sendKeys(ReadExcel("Sheet1", 16, 0));
		l22.sendKeys(ReadExcel("Sheet1", 16, 1));
		l3.click();
		Thread.sleep(2000);
		Actions a = new Actions(d);
		a.moveToElement(l1).moveToElement(l2).build().perform();
		l2.click();
		
	}

}
