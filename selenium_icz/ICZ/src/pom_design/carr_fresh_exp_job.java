package pom_design;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common_utilities.excel_read;
import constant.const_url;

public class carr_fresh_exp_job extends excel_read{


	@FindBy(id = "emailid1")
	WebElement l11;
	
	@FindBy(id="password")
	WebElement l22;
	
	@FindBy(xpath= ".//*[@id='wrapper']/section[3]/div/div[1]/form/fieldset/div[3]/input")
	WebElement l3;
	
	@FindBy(xpath=".//*[@id='wrapper']/section[1]/div/nav/ul/li[2]/a")
	WebElement c1;
	
	@FindBy(xpath=".//*[@id='menu']/ul/li[2]/ul/li[3]/a")
	WebElement c2;
	
	@FindBy(xpath=".//*[@id='wrapper']/table/tbody/tr/td/table/tbody/tr/td[6]/a")
	WebElement c3_apply;
	
	@FindBy(xpath=".//*[@id='menu']/ul/li[2]/ul/li[4]/a")
	WebElement c4;
	
	@FindBy(xpath=".//*[@id='wrapper']/table/tbody/tr/td/table/tbody/tr/td[6]/a")
	WebElement c5_apply;
	
	
	public carr_fresh_exp_job(WebDriver d){
		PageFactory.initElements(d, this);
	}
	
	public void get(WebDriver d) throws IOException{
		
		l11.sendKeys(ReadExcel("Sheet1", 16, 0));
		l22.sendKeys(ReadExcel("Sheet1", 16, 1));
		l3.click();
		
		Actions a1 = new Actions(d);
		a1.moveToElement(c1).moveToElement(c2).build().perform();
		c2.click();
		
		c3_apply.click();
		
		d.get(const_url.url);
		
		Actions a2 = new Actions(d);
		a2.moveToElement(c1).moveToElement(c4).build().perform();
		
		c4.click();
		
		c5_apply.click();
	}
	
	

}
