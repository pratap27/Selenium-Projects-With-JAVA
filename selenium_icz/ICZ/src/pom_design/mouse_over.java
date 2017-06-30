package pom_design;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common_utilities.navigate_back;

public class mouse_over {
	
	//WebDriver d = new FirefoxDriver();
	@FindBy(xpath=".//*[@id='wrapper']/section[1]/div/nav/ul/li[3]/a")
	WebElement m1;
	
	@FindBy(xpath=".//*[@id='wrapper']/section[1]/div/nav/ul/li[3]/ul/li[4]/a")
	WebElement m2;
	
	public mouse_over(WebDriver d){
		PageFactory.initElements(d, this);
	}
	
	public void g(WebDriver d){
		Actions a = new Actions(d);
		navigate_back.imp_wait();
		a.moveToElement(m1).moveToElement(m2).build().perform();
		m2.click();
		//a.click();
		
	}
	

}
