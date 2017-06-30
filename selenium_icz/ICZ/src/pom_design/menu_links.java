package pom_design;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class menu_links {
	//WebDriver d = new FirefoxDriver();
	
	@FindBy(xpath=".//*[@id='menu']/ul/li[1]/a")
	WebElement m1;
	
	@FindBy(xpath=".//*[@id='wrapper']/section[1]/div")
	List<WebElement> m2;
	
	@FindBy(tagName="a")
	List<WebElement> m3;
	
	@FindBy(xpath=".//*[@id='wrapper']/section[1]/div/nav/ul/li[1]/a")
	WebElement m4;
	
	public menu_links(WebDriver d){
		PageFactory.initElements(d, this);
	}
	
	public void g(){
		//m1.click();
		System.out.println("Total links: "+ m3.size());
		
		int count = 0;
		for(int j = 0; j<m3.size(); j++){
			if (m3.get(j).isDisplayed()){
				count++;
			}
			System.out.println(m3.get(j).getText());
		}
		
		System.out.println("Total visible links: "+count);
		int hidden = m3.size() - count;
		
		System.out.println("Hidden links: "+ hidden);
		
		for(int i = 0; i<m2.size();i++){
			System.out.println(m2.get(i).getText());
		}
		
		m4.click();
	}
	

}
