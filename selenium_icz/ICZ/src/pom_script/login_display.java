package pom_script;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import constant.const_url;
import pom_design.login_1;


public class login_display {
	
	WebDriver d = new FirefoxDriver();
	@Test
	public void get() throws IOException{
		d.get(const_url.url);
		login_1 a = new login_1(d);
		a.g();
	}

}
