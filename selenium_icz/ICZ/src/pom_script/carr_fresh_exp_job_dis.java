package pom_script;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom_design.carr_fresh_exp_job;
import constant.const_url;

public class carr_fresh_exp_job_dis{
	
	WebDriver d;
	@Test
	public void g1() throws InterruptedException, IOException{
		d = new FirefoxDriver();
		d.get(const_url.url);
		
		carr_fresh_exp_job a = new carr_fresh_exp_job(d);
		
		a.get(d);
	}
}
