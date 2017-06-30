package pom_script;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom_design.edu_prog;
import constant.const_url;

public class edu_prog_dis {
	WebDriver d;
	@Test
	public void get() throws IOException{
		d= new FirefoxDriver();
		d.get(const_url.url);
		edu_prog a = new edu_prog(d);
		a.g(d);
	}
}
