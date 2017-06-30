package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import constant.const_url;
import pom_design.mouse_over;

public class mouse_over_display {
	
	WebDriver d;
	@Test
	public void g1(){
		d= new FirefoxDriver();
		d.get(const_url.url);
		mouse_over m = new mouse_over(d);
		m.g(d);
	
	
	}
}
