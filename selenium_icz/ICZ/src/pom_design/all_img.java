package pom_design;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class all_img {
	@FindBy(tagName="img")
	List<WebElement> im;
	
	public all_img(WebDriver d){
		PageFactory.initElements(d, this);
	}
	
	public void all_i(WebDriver d){
		System.out.println("Total Images: "+im.size());
		
		boolean isValid =  false;
		for(int i=0; i<im.size();i++){
			String url = im.get(i).getAttribute("src");
			
			if(url != null){
				 isValid = getResponseCode(url);
				 if (isValid) {
				       System.out.println("Valid image:" + url);
				       System.out.println("----------XXXX-----------XXXX----------XXXX-----------XXXX----------");
				       System.out.println();
				      } else {
				       System.out.println("Broken image ------> " + url);
				       System.out.println("----------XXXX-----------XXXX----------XXXX-----------XXXX----------");
				       System.out.println();
				      }
			}else {    
				      //If <a> tag do not contain href attribute and value then print this message
				      System.out.println("String null");
				      System.out.println("----------XXXX-----------XXXX----------XXXX-----------XXXX----------");
				      System.out.println();
				      continue;
				 }
				
			}
		}

	private boolean getResponseCode(String url) {
		// TODO Auto-generated method stub
		return true;
	}

}
