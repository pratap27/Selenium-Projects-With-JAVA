package pom_script;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom_design.log_out;
import constant.const_url;

public class log_out_dis {
	WebDriver d;
	@Test
	public void log1() throws InterruptedException, IOException{
		d=new FirefoxDriver();
		d.get(const_url.url);
		log_out l = new log_out(d);
		l.log(d);
		
	}

}
