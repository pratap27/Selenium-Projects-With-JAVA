package selenium_ng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hidden_links {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("https://www.w3schools.com/html/html_form_input_types.asp");
		List<WebElement> links = d.findElements(By.tagName("a")); 
		System.out.println("Total Links: "+ links.size());
		
		int count = 0;
		for(int i=0; i<links.size(); i++ ){
			if(links.get(i).isDisplayed()){
				count++;
			}
		}
		System.out.println("Total visible links: "+ count);
		int hidden;
		hidden = links.size()-count;
		System.out.println("Total hidden links: "+ hidden);

	}

}
