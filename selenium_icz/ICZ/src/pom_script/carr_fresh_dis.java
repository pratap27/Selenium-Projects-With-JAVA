package pom_script;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom_design.carr_fresh;
import constant.const_url;

public class carr_fresh_dis {
	
	WebDriver d;
	@Test
	public void get1() throws InterruptedException, IOException, AWTException{
		d = new FirefoxDriver();
		d.get(const_url.url);
		carr_fresh a = new carr_fresh(d);
		a.get(d);
		a.log();
		
	}
}
