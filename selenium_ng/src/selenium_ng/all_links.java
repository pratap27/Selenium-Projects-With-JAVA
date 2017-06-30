package selenium_ng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class all_links {

	public static void main(String[] args) {
		FirefoxDriver s = new FirefoxDriver();
		s.get("https://www.redbus.in/");
		//d.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

		List<WebElement> links = s.findElements(By.tagName("a"));
		System.out.println("Total Links: "+ links);
		
		for(int i=0; i<links.size(); i++){
			System.out.println(links.get(i).getText());
		}

	}

}
