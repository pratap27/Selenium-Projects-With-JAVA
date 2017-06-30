package pom_design;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contact_us {
	
	@FindBy(xpath=".//*[@id='top-bar']/div/div[2]/div/nav/ul/li[2]/a")
	WebElement contact_us;
	
	@FindBy(id="fname")
	WebElement name;
	
	@FindBy(id="emaili")
	WebElement email;
	
	@FindBy(id="message")
	WebElement mes;
	
	@FindBy(xpath=".//*[@id='wrapper']/section[3]/div/div[2]/form/fieldset/div[4]/input")
	WebElement submit;
	
	public contact_us(WebDriver d){
		PageFactory.initElements(d, this);
	}
	
	public void contact(){
		contact_us.click();
		name.sendKeys("pratap");
		email.sendKeys("gpratapreddy@snycon.com");
		mes.sendKeys("message..................");
		
		submit.click();
	}
	

}
