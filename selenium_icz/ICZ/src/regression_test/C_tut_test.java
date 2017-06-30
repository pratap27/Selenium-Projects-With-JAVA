package regression_test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import regression_design.C_tut;
import constant.const_url;

public class C_tut_test {

	WebDriver d;
	@Test
	public void t1() throws InterruptedException, IOException{
		d = new FirefoxDriver();
		d.get(const_url.url);
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		C_tut c = new C_tut(d);
		c.c_tut(d);
	}

}
