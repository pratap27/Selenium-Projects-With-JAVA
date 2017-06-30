package pom_design;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logo_display {

	@FindBy(xpath=".//*[@id='top-bar']/div/div[1]/a/img")
	WebElement logo;
	public logo_display(WebDriver d){
		PageFactory.initElements(d, this);
	}
	public void display(){
		if(logo.isDisplayed()){
			System.out.println("logo displayed");
		}
		else{
			System.out.println("not displayed");
		}
	}

}
