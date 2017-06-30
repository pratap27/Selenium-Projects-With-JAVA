package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import constant.const_url;
import pom_design.header_links;

public class header {
	WebDriver d1 = new FirefoxDriver();
	@Test
	public void g1(){
		d1.get(const_url.url);
		header_links a = new header_links(d1);
		a.g();
		
	}

}
