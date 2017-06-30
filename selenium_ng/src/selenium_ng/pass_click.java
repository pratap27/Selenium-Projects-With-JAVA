package selenium_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pass_click {

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
		
	}

}
