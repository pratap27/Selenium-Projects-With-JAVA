package pom_design;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class image_1 {
	
	@FindBy(xpath=".//*[@id='home-slider']/div/ul[1]/li[4]/img")
	WebElement im;
	
	public image_1(WebDriver d){
		PageFactory.initElements(d, this);
	}
	
	
	public void img1(WebDriver d){
		boolean img_p =  (boolean) ((JavascriptExecutor)d).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", im);
		if (img_p){
			System.out.println("Image Displayed.");
		}
		else{
			System.out.println("Image not Displayed.");
		}
	}
	
}
