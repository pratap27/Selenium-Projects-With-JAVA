package selenium_ng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radio_1 {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		//d.get("https://www.w3schools.com/html/html_form_input_types.asp");
		d.get("http://www.echoecho.com/htmlforms10.htm");
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
		WebElement c = d.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		d.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[1]")).click();
		/*List<WebElement> b = c.findElements(By.name("group1"));
		System.out.println(c.getAttribute("value")+"\t"+c.getAttribute("checked"));
		
		for(int i=0; i< b.size() ; i++) {
			//if(b.get(i).getAttribute("value").equals("gender")){
				//b.get(i).click();
			//}
			
			System.out.println(b.get(i).getAttribute("value")+"\t"+b.get(i).getAttribute("checked"));
		}*/
	}
}
