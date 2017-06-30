package pom_design;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import common_utilities.excel_read;

public class login_1 extends excel_read{
	
	@FindBy(id = "emailid1")
	WebElement l1;
	
	@FindBy(id="password")
	WebElement l2;
	
	@FindBy(how = How.XPATH,using = ".//*[@id='wrapper']/section[3]/div/div[1]/form/fieldset/div[3]/input")
	WebElement l3;
	
	public login_1(WebDriver d){
		PageFactory.initElements(d, this);
	}
	
	public void g() throws IOException{
		l1.sendKeys(ReadExcel("Sheet1", 16, 0));
		l2.sendKeys(ReadExcel("Sheet1", 16, 1));
		l3.click();
	}
	
	

}
