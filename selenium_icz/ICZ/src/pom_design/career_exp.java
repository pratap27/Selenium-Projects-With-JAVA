package pom_design;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom_script.login_display;
import common_utilities.excel_read;

public class career_exp extends excel_read {

	@FindBy(id = "emailid1")
	WebElement l11;
	
	@FindBy(id="password")
	WebElement l22;
	
	@FindBy(xpath= ".//*[@id='wrapper']/section[3]/div/div[1]/form/fieldset/div[3]/input")
	WebElement l3;
	
	@FindBy(xpath=".//*[@id='wrapper']/section[1]/div/nav/ul/li[2]/a")
	WebElement c1;
	
	@FindBy(xpath=".//*[@id='wrapper']/section[1]/div/nav/ul/li[2]/ul/li[2]/a")
	WebElement c2;
	
	@FindBy(id="RE_yearsid")
	WebElement f1;
	
	@FindBy(id="RE_monthsid")
	WebElement f2;
	
	@FindBy(id="companyid")
	WebElement f3;
	
	@FindBy(id="ctc_cid")
	WebElement f4;
	
	@FindBy(id="ctc_eid")
	WebElement f5;
	
	@FindBy(id="TE_yearsid")
	WebElement f6;
	
	@FindBy(id="TE_monthsid")
	WebElement f7;
	
	@FindBy(id="notice_pid")
	WebElement f8;
	
	@FindBy(id="resumeid")
	WebElement b;
	
	@FindBy(xpath=".//*[@id='wrapper']/section[4]/form/div[2]/div[2]/input")
	WebElement b1;

	public career_exp(WebDriver d){
		PageFactory.initElements(d, this);
	}
	
	public void log(WebDriver d) throws InterruptedException, AWTException, IOException{
		l11.sendKeys(ReadExcel("Sheet1", 16, 0));
		l22.sendKeys(ReadExcel("Sheet1", 16, 1));
		l3.click();
		//Thread.sleep(2000);
		//login_display login = new login_display();
		//login.get();
		Actions a1 = new Actions(d);
		a1.moveToElement(c1).moveToElement(c2).build().perform();
		c2.click();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	
		
		f1.sendKeys(ReadExcel("Sheet1", 22, 0));
		f2.sendKeys(ReadExcel("Sheet1", 22, 1));
		f3.sendKeys(ReadExcel("Sheet1", 22, 2));
		f4.sendKeys(ReadExcel("Sheet1", 22, 3));
		f5.sendKeys(ReadExcel("Sheet1", 22, 4));
		f6.sendKeys(ReadExcel("Sheet1", 22, 5));
		f7.sendKeys(ReadExcel("Sheet1", 22, 6));
		f8.sendKeys(ReadExcel("Sheet1", 22, 7));
		
		b.click();
		
		Thread.sleep(10);
		//WebDriverWait w = new WebDriverWait(d, 15);
		//Thread.sleep(2000);
		b1.click();
	}
	
	public void log1(WebDriver d) throws InterruptedException, AWTException{
		//d.get("http://192.168.100.28:8080/ICZone/experiencecareer");
		//b1.click();
		StringSelection  img = new StringSelection("C:\\pratap_reddy\\CRS.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(img, null);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		
	}
}
