package pom_design;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import common_utilities.navigate_back;

public class header_links {
	
	//WebDriver d1 = new FirefoxDriver();
	
	//@FindBy(xpath=".//*[@id='top-bar']/div/div[2]")
	//List<WebElement> head;
	
	@FindBy(how = How.XPATH, using=".//*[@id='menu']/ul/li[1]/a")
	WebElement home;
	
	@FindBy(xpath=".//*[@id='menu']/ul/li[2]/a")
	WebElement contact;
	
	@FindBy(xpath=".//*[@id='menu']/ul/li[3]/a")
	WebElement regis;
	
	
	
	public header_links(WebDriver d1){
		PageFactory.initElements(d1, this);
	}
	
	public void g(){
		//System.out.println("No of Links: "+links.size());
		/*for(int i=0; i<links.size(); i++){
			
			links.get(i).click();
			
			System.out.println(links.get(i).getText());
			navigate_back.nav_back();
		}*/
		
		home.click();
		contact.click();
		regis.click();
		
	}
	
	
}
