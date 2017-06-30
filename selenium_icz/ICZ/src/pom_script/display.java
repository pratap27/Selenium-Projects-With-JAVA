package pom_script;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom_design.logo_display;
import constant.const_url;

public class display {
	
	WebDriver d;
	@Test
	public void d() throws IOException{
		
		d = new FirefoxDriver();
		d.get(const_url.url);
		logo_display e = new logo_display(d);
		e.display();
		
	}

}
