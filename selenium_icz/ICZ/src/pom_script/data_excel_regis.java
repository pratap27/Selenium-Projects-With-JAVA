package pom_script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import constant.const_url;
import constant.data_driven;

public class data_excel_regis {
	
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		WebDriver d =new FirefoxDriver();
		data_driven a = new data_driven();
		String fn = a.getdata("sheet1",9,0);
		String ln = a.getdata("sheet1", 9, 1);
		String dob = a.getdata("sheet1", 9, 2);
		String mn = a.getdata("sheet1", 9, 3);
		String  email = a.getdata("sheet1", 9, 4);
		
		String  pass = a.getdata("sheet1", 9, 5);
		String  city = a.getdata("sheet1", 9, 6);
		String  state = a.getdata("sheet1", 9, 7);
		String zip = a.getdata("sheet1", 9, 8);
		
		
		a.setdata("sheet1",8,9,"pass");
		WebDriverWait w = new WebDriverWait(d, 90);
		
		d.get(const_url.url);
		d.findElement(By.id("fname")).sendKeys(fn);
		d.findElement(By.id("lname")).sendKeys(ln);
		d.findElement(By.name("dob")).sendKeys(dob);
		d.findElement(By.id("mobilenumber")).sendKeys(mn);
		d.findElement(By.id("emaili")).sendKeys(email);
		d.findElement(By.id("Password")).sendKeys(pass);
		d.findElement(By.id("retypepassword")).sendKeys(pass);
		d.findElement(By.id("cityname")).sendKeys(city);
		d.findElement(By.id("statename")).sendKeys(state);
		d.findElement(By.id("zip")).sendKeys(zip);
		
		
		d.findElement(By.xpath(".//*[@id='wrapper']/section[3]/div/div[2]/form/fieldset/div[4]/div/input[1]")).click();
		
		
		d.findElement(By.xpath(".//*[@id='wrapper']/section[3]/div/div[2]/form/fieldset/div[12]/input")).click();

	}

}
