package pom_design;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common_utilities.excel_read;
import common_utilities.navigate_back;

public class carr_fresh extends excel_read{
	
	@FindBy(id = "emailid1")
	WebElement l11;
	
	@FindBy(id="password")
	WebElement l22;
	
	@FindBy(xpath= ".//*[@id='wrapper']/section[3]/div/div[1]/form/fieldset/div[3]/input")
	WebElement l3;
	
	@FindBy(xpath=".//*[@id='wrapper']/section[1]/div/nav/ul/li[2]/a")
	WebElement c1;
	
	@FindBy(xpath=".//*[@id='menu']/ul/li[2]/ul/li[1]/a")
	WebElement c2;
	
	
	@FindBy(id="ssc_percid")
	WebElement f1;
	
	@FindBy(id="ssc_yopid")
	WebElement f2;
	
	@FindBy(id="inter_percid")
	WebElement f3;
	
	@FindBy(id="inter_yopid")
	WebElement f4;
	
	@FindBy(id="ug_percid")
	WebElement f5;
	
	@FindBy(id="ug_yopid")
	WebElement f6;
	
	@FindBy(id="branch_ugid")
	WebElement f7;
	
	@FindBy(id="pg_percid")
	WebElement f8;
	
	@FindBy(id="pg_yopid")
	WebElement f9;
	
	@FindBy (id="branch_pgid")
	WebElement f10;
	
	@FindBy (id="resumeid")
	WebElement r;
	
	@FindBy(xpath=".//*[@id='wrapper']/section[4]/form/div[2]/div[2]/input")
	WebElement button;
	
	public carr_fresh(WebDriver d){
		PageFactory.initElements(d, this);
	}
	
	public void get(WebDriver d) throws IOException, InterruptedException {
		l11.sendKeys(ReadExcel("Sheet1", 16, 0));
		l22.sendKeys(ReadExcel("Sheet1", 16, 1));
		l3.click();
		
		//navigate_back.imp_wait();
		
		Actions a1 = new Actions(d);
		a1.moveToElement(c1).moveToElement(c2).build().perform();
		c2.click();
		
		f1.sendKeys(ReadExcel("Sheet1", 25, 0));
		f2.sendKeys(ReadExcel("Sheet1", 25, 1));
		f3.sendKeys(ReadExcel("Sheet1", 25, 2));
		f4.sendKeys(ReadExcel("Sheet1", 25, 3));
		f5.sendKeys(ReadExcel("Sheet1", 25, 4));
		f6.sendKeys(ReadExcel("Sheet1", 25, 5));
		f7.sendKeys(ReadExcel("Sheet1", 25, 6));
		f8.sendKeys(ReadExcel("Sheet1", 25, 7));
		f9.sendKeys(ReadExcel("Sheet1", 25, 8));
		f10.sendKeys(ReadExcel("Sheet1", 25, 9));
		
		r.click();
		Thread.sleep(10);
		
		button.click();
		
	}
	
	public void log() throws AWTException{
		
		StringSelection  img = new StringSelection("C:\\pratap_reddy\\CRS.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(img, null);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		
		
	}
	

}
