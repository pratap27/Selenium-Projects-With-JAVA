package selenium_ng;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class firefox_profile {

	public static void main(String[] args) {
		ProfilesIni f = new ProfilesIni();
		FirefoxProfile s = new FirefoxProfile();
		s =f.getProfile("pratap");
		FirefoxDriver  d = new FirefoxDriver(s);
		d.get("https://www.google.co.in/");
		

	}

}
