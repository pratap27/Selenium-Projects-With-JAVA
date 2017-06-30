package pom_design;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import common_utilities.excel_read;
import test_ng.login;

public class online_test extends excel_read{
	
	@FindBy(id = "emailid1")
	WebElement l11;
	
	@FindBy(id="password")
	WebElement l22;
	
	@FindBy(xpath= ".//*[@id='wrapper']/section[3]/div/div[1]/form/fieldset/div[3]/input")
	WebElement l3;
	
	@FindBy(xpath=".//*[@id='menu']/ul/li[5]/a")
	WebElement o1;
	
	@FindBy(xpath=".//*[@id='menu']/ul/li[5]/ul/li[1]/a")
	WebElement o2;
	
	@FindBy(xpath=".//*[@id='menu']/ul/li[5]/ul/li[2]/a")
	WebElement o3;
	
	@FindBy(xpath=".//*[@id='myCarousel-2']/div/div/ul/li[2]/div/a/button")
	WebElement login;
	
	@FindBy(xpath=".//*[@id='myCarousel']/div/div/ul/li[2]/div/ul/strong/li[1]/a")
	WebElement java;
	
	@FindBy(xpath=".//*[@id='myCarousel']/div/div/ul/li[2]/div/a/button")
	WebElement java_st;
	
	
	public online_test(WebDriver d){
		PageFactory.initElements(d, this);
	}
	
	public void get(WebDriver d) throws IOException, InterruptedException{

		l11.sendKeys(ReadExcel("Sheet1", 16, 0));
		l22.sendKeys(ReadExcel("Sheet1", 16, 1));
		l3.click();
		
		
		//d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(d, 20);
		Actions a1 = new Actions(d);
		a1.moveToElement(o1).moveToElement(o2).build().perform();
		o2.click();
		
		//d.get("http://192.168.100.9:8080/ICZone/test");
		a1.moveToElement(o1).moveToElement(o3).build().perform();
		
		o3.click();
		
		java.click();
		
		java_st.click();
		

	}
}
