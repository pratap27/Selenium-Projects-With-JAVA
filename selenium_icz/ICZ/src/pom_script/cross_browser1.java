package pom_script;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import common_utilities.cross_browser;

public class cross_browser1 {
	WebDriver d;
	@Test
	public void g1(){
		cross_browser h = new cross_browser();
		h.g("firefox");
		h.g("chrome");
		h.g("ie");
		
	}

}
