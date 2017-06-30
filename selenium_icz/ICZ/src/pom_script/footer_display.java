package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import constant.const_url;
import pom_design.footer_links;

public class footer_display {
	WebDriver d = new FirefoxDriver();
	@Test
	public void get(){
		d.get(const_url.url);
		footer_links a = new footer_links(d);
		a.g(d);
		
	}

}
