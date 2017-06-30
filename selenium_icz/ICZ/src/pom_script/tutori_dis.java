package pom_script;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom_design.tutori_C;
import constant.const_url;

public class tutori_dis {

	WebDriver d;
	@Test
	public void t1() throws InterruptedException, IOException{
		d = new FirefoxDriver();
		d.get(const_url.url);
		tutori_C a = new tutori_C(d);
		a.get(d);
		a.g(d);
		
	}
}
