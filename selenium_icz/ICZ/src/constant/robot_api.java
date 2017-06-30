package constant;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class robot_api {
	
	public static void main (String [] args) throws AWTException{
		StringSelection  img = new StringSelection("C:\\pratap_reddy\\CRS.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(img, null);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
	}

}
