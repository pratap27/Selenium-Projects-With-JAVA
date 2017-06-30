package constant;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class data_driven {
	
	String path = "C:\\pratap_reddy\\Test_data_ICZ.xlsx";
	public String getdata(String sname, int rnum, int cnum) throws EncryptedDocumentException, InvalidFormatException, IOException{
		FileInputStream f = new FileInputStream(path);
		Workbook w = WorkbookFactory.create(f);
		String d = w.getSheet(sname).getRow(rnum).getCell(cnum).getStringCellValue();
		return d;
	}
	public void setdata(String sname, int rnum, int cnum, String d) throws EncryptedDocumentException, InvalidFormatException, IOException{
		FileInputStream f = new FileInputStream(path);
		Workbook w = WorkbookFactory.create(f);
		Cell c = w.getSheet(sname).getRow(rnum).createCell(cnum);
		c.setCellValue(d);
		c.setCellType(c.CELL_TYPE_STRING);
		FileOutputStream f1= new FileOutputStream(path);
		w.write(f1);
		
		f1.close();
		f.close();
	}

}
