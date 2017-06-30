package excel_TS;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import excel_script.excel_data;

public class Excel_TS {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		WebDriver d;
		excel_data g=new excel_data();
		String fn=g.getdata("sheet1", 2, 0);
		String ln=g.getdata("sheet1", 0, 3);
g.setdata("sheet1", 1, 4, "pass");
		d=new FirefoxDriver();
	WebDriverWait w=new WebDriverWait(d, 90);
		d.get("https://www.facebook.com/");
		d.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys(fn);
		d.findElement(By.xpath(".//*[@id='u_0_3']")).sendKeys(ln);
		

	}

}
