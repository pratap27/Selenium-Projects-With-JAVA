package constant;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class data_excel_login {
	
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		WebDriver d =new FirefoxDriver();
		data_driven a = new data_driven();
		String email = a.getdata("sheet1",16,0);
		String pass = a.getdata("sheet1", 16, 1);
		
		
		a.setdata("sheet1",15,2,"pass");
		WebDriverWait w = new WebDriverWait(d, 90);
		
		d.get(const_url.url);
		
		d.findElement(By.id("emailid1")).sendKeys(email);
		d.findElement(By.id("password")).sendKeys(pass);
		
		d.findElement(By.xpath(".//*[@id='wrapper']/section[3]/div/div[1]/form/fieldset/div[3]/input")).click();

	}

}
