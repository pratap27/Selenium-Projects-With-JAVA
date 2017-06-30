package pom_design;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.const_url;
import test_ng.login;

public class tutori_C{
	
	/*@FindBy(id = "emailid1")
	WebElement l11;
	
	@FindBy(id="password")
	WebElement l22;
	
	@FindBy(xpath= ".//*[@id='wrapper']/section[3]/div/div[1]/form/fieldset/div[3]/input")
	WebElement l3;*/
	
	@FindBy(xpath=".//*[@id='wrapper']/section[1]/div/nav/ul/li[3]/a")
	WebElement t;
	
	@FindBy(xpath=".//*[@id='menu']/ul/li[3]/ul/li[1]/a")
	WebElement t1;
	
	@FindBy(xpath=".//*[@id='wrapper']/center/section/div[2]/ul/li[1]")
	WebElement t1a;
	
	@FindBy(xpath=".//*[@id='wrapper']/center/section/div[2]/ul/li[1]/span/a[1]")
	WebElement t1b;
	@FindBy(xpath=".//*[@id='wrapper']/center/section/div[2]/ul/li[1]/span/a[2]")
	WebElement t1c;
	
	@FindBy(xpath=".//*[@id='wrapper']/center/section/div[2]/ul/li[2]")
	WebElement t2a;
	
	@FindBy(xpath=".//*[@id='wrapper']/center/section/div[2]/ul/li[2]/span/a[1]")
	WebElement t2b;
	
	@FindBy(xpath=".//*[@id='wrapper']/center/section/div[2]/ul/li[2]/span/a[2]")
	WebElement t2c;
	
	/*@FindBy(xpath=".//*[@id='menu']/ul/li[3]/ul/li[2]/a")
	WebElement t2;
	
	@FindBy(xpath=".//*[@id='menu']/ul/li[3]/ul/li[3]/a")
	WebElement t3;
	
	@FindBy(xpath=".//*[@id='menu']/ul/li[3]/ul/li[4]/a")
	WebElement t4;
	
	@FindBy(xpath=".//*[@id='menu']/ul/li[3]/ul/li[5]/a")
	WebElement t5;
	
	@FindBy(xpath=".//*[@id='menu']/ul/li[3]/ul/li[6]/a")
	WebElement t6;*/
	
	public tutori_C(WebDriver d){
		PageFactory.initElements(d, this);
	}
	
	public void get(WebDriver d) throws InterruptedException{
		
		/*l11.sendKeys(ReadExcel("Sheet1", 16, 0));
		l22.sendKeys(ReadExcel("Sheet1", 16, 1));
		l3.click();*/
		Actions a1 = new Actions(d);
		a1.moveToElement(t).moveToElement(t1).build().perform();
		t1.click();
		
		a1.moveToElement(t1a).moveToElement(t1b).build().perform();
		t1b.click();
		
	
		//d.get("http://192.168.100.9:8080/ICZone/clanguage");
		
		a1.moveToElement(t1a).moveToElement(t1c).build().perform();
		t1c.click();
	
	}	
	public void g(WebDriver d) throws InterruptedException{
		Actions a2 = new Actions(d);
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//d.get("http://192.168.100.9:8080/ICZone/clanguage");
		
		a2.moveToElement(t2a).moveToElement(t2b).build().perform();
		t2b.click();
		
		a2.moveToElement(t2a).moveToElement(t2c).build().perform();
		t2c.click();
		
	}
		/*d.get(const_url.url);
		
		a1.moveToElement(t).moveToElement(t2).build().perform();
		t2.click();
		
		//Thread.sleep(20);
		
		d.navigate().back();
		a1.moveToElement(t).moveToElement(t3).build().perform();
		t3.click();
		
		
		d.navigate().back();
		//Thread.sleep(20);
		a1.moveToElement(t).moveToElement(t4).build().perform();
		t4.click();
		
		d.navigate().back();
		//Thread.sleep(20);
		a1.moveToElement(t).moveToElement(t5).build().perform();
		t5.click();
		
		d.navigate().back();
		//Thread.sleep(20);
		a1.moveToElement(t).moveToElement(t6).build().perform();
		t6.click();*/
		


}
