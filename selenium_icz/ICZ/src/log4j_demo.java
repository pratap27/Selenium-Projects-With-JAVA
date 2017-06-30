

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class log4j_demo {
	
	WebDriver driver;
	@Test
	public void log(){

	BasicConfigurator.configure(); //locates configuration file automatically 

	Logger log=Logger.getLogger("footer_links");  // class name of the program

	PropertyConfigurator.configure("log4j.properties"); //pass the log file

	driver= new FirefoxDriver();

	log.info("open firefox");// example of log info
	
	}
}
