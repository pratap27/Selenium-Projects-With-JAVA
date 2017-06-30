package selenium_ng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radio_button {

	public static void main(String[] args) {
		FirefoxDriver d = new FirefoxDriver();
		//d.get("https://www.w3schools.com/html/html_form_input_types.asp");
		d.get("http://www.echoecho.com/htmlforms10.htm");
		WebElement b = d.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> box = b.findElements(By.name("group1"));
		for(int i =0; i<box.size();i++){
			box.get(i).click();
			for(int j=0; j<box.size();j++){
			System.out.println(box.get(i).getAttribute("value")+"\t"+box.get(j).getAttribute("checked"));
				
			}
			//System.out.println(box.get(i).getAttribute("checked"));
			System.out.println("--------------");
		}
	
	}

}
