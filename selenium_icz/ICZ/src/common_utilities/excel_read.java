package common_utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class excel_read {
	

	static WebDriver driver;
	
	public static void Back()
	{
		driver.navigate().back();
	}
	
	public String ReadExcel(String s, int r, int c) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\pratap_reddy\\Test_data_ICZ.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(file);
		XSSFSheet sheet = w.getSheet(s);
		return sheet.getRow(r).getCell(c).toString();
		
	}

}
