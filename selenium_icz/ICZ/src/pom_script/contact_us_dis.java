package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom_design.contact_us;
import constant.const_url;

public class contact_us_dis {
	WebDriver d = new FirefoxDriver();
	@Test
	public void get(){
		d.get(const_url.url);
		contact_us a = new contact_us(d);
		a.contact();
	}
}
