package pom_script;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import common_utilities.screen_shot;

import constant.const_url;

public class screen_shot_dis {
	
	WebDriver d;
	@Test
	public void d() throws IOException{
		
		d = new FirefoxDriver();
		d.get(const_url.url);
		
		screen_shot i=new  screen_shot();
		i.g(d, "pratap");
	}
}
