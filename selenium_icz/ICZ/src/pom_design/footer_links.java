package pom_design;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common_utilities.navigate_back;

public class footer_links {
	
	//WebDriver d1 = new FirefoxDriver();
	
	//@FindBy(xpath=".//*[@id='top-bar']/div/div[2]")
	//WebElement head;
	
	@FindBy(xpath=".//*[@id='footer-bar']/div")
	List<WebElement> links;
	
	public footer_links(WebDriver d1){
		PageFactory.initElements(d1, this);
	}
	
	public void g(WebDriver d){
		for(int i=0; i<links.size(); i++){
			links.get(i).click();
			//System.out.println(d1.getCurrentUrl());
			
			//d1.navigate().back();
			
			System.out.println(links.get(i).getText());
			System.out.println(d.getCurrentUrl());
			d.navigate().back();
			
		}
	}
	

}
