package excel_script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_data {
	String path="C:Users/ganes/Desktop/ganesh.xlsx";
	public String getdata(String sname,int rnum,int cnum) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		FileInputStream fis=new FileInputStream(path);
		Workbook w=WorkbookFactory.create(fis);
		String d=w.getSheet(sname).getRow(rnum).getCell(cnum).getStringCellValue();
		return d;
	}
public void setdata(String sname,int rnum,int cnum,String d) throws EncryptedDocumentException, InvalidFormatException, IOException
{
	FileInputStream fis=new FileInputStream(path);
	Workbook w=WorkbookFactory.create(fis);
	Cell c=w.getSheet(sname).getRow(rnum).createCell(cnum);
	c.setCellValue(d);
	c.setCellType(c.CELL_TYPE_STRING);
	FileOutputStream fos=new FileOutputStream(path);
	w.write(fos);
fos.close();
fis.close();
	
}
}
