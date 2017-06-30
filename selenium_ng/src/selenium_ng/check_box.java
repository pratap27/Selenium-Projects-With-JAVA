package selenium_ng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class check_box {

	public static void main(String[] args) {
		FirefoxDriver d = new FirefoxDriver();
		d.get("http://www.echoecho.com/htmlforms09.htm");
		WebElement b = d.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> box = b.findElements(By.tagName("input"));
		for(int i =0; i<box.size();i++){
			System.out.println(box.get(i).getAttribute("value")+"\t"+box.get(i).getAttribute("checked"));
		}
		

	}

}
