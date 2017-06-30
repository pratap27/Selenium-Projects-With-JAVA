package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import constant.const_url;
import pom_design.total_links;

public class total_links_dis {
	WebDriver d = new FirefoxDriver();
	@Test
	public void get(){
		d.get(const_url.url);
		total_links a = new total_links(d);
		a.tl(d);
	}
}
