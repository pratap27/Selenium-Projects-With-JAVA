package pom_design;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common_utilities.navigate_back;

public class total_links {
	

	@FindBy(tagName="a")
	List<WebElement> t1;
	
	public total_links(WebDriver d){
		PageFactory.initElements(d, this);
	}
	
	public void tl(WebDriver d){
		System.out.println("links: "+t1.size());
		
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		for(int i=0; i<t1.size();i++){
			t1.get(i).click();
			
			System.out.println(t1.get(i).getText());
			navigate_back.nav_back();
		}
	}

}
