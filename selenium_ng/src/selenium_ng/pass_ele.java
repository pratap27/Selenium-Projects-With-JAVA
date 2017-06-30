package selenium_ng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pass_ele {

	public static void main(String[] args) {
		FirefoxDriver d = new FirefoxDriver();
		d.get("https://sg2plcpnl0120.prod.sin2.secureserver.net:2096/");
		d.manage().window().maximize();
		WebElement f = d.findElement(By.name("user"));
		f.sendKeys("gpratapreddy@snycon.com");
		WebElement g = d.findElement(By.name("pass"));
		g.sendKeys("pratap24@");
		
		WebElement s = d.findElement(By.xpath(".//*[@id='login_submit']"));
		s.click();
		FirefoxDriver t = new FirefoxDriver();
		t.get("https://sg2plcpnl0120.prod.sin2.secureserver.net:2096/cpsess9026588909/webmail/gl_paper_lantern/index.html?login=1&post_login=39864817034836");
		WebElement block = d.findElement(By.xpath(".//*[@id='topnav']"));
		
		List<WebElement> link = block.findElements(By.tagName("a"));
		System.out.println("No.of.Links: "+ link.size());
		/*for(int i =0; i<link.size();i++){
			link.get(i).click();
			//System.out.println(link.get(i).getText());
			System.out.println(d.getCurrentUrl());
			d.navigate().back();
			block = d.findElement(By.id("messagetoolbar"));
			link = block.findElements(By.tagName("a")); } */
		
	}

}
