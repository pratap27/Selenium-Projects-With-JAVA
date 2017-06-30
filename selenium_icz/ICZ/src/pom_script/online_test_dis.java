package pom_script;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom_design.online_test;
import constant.const_url;

public class online_test_dis {
	
	WebDriver d;
	@Test
	public void o1() throws InterruptedException, IOException{
		d = new FirefoxDriver();
		d.get(const_url.url);
		
		online_test a = new online_test(d);
		
		a.get(d);
	}
}
