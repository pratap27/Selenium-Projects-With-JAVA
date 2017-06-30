package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import constant.const_url;
import pom_design.all_img;

public class all_img_dis {
	WebDriver d = new FirefoxDriver();
	@Test
	public void get(){
		d.get(const_url.url);
		all_img i = new all_img(d);
		i.all_i(d);
	}
}
