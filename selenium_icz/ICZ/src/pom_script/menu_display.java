package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import common_utilities.navigate_back;
import constant.const_url;
import pom_design.menu_links;

public class menu_display {
	WebDriver d = new FirefoxDriver();
	@Test
	public void get(){
		d.get(const_url.url);
		menu_links a = new menu_links(d);
		a.g();
		
	}

}
