package pom_script;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom_design.career_exp;

import constant.const_url;

public class career_exp_dis{
	
	WebDriver d = new FirefoxDriver();
	@Test
	public void get1() throws InterruptedException, IOException, AWTException{
		d.get(const_url.url);
		
		career_exp a = new career_exp(d);
		
		a.log(d);
		a.log1(d);
		
		//Runtime.getRuntime().exec("C:\\pratap_reddy\\aa.exe");
	}
}
