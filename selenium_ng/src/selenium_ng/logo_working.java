package selenium_ng;

import org.openqa.selenium.firefox.FirefoxDriver;

public class logo_working {

	public static void main(String[] args) {
		FirefoxDriver d = new FirefoxDriver();
		d.get("http://pythontutor.com");
		String act_title = "Python Tutor - Visualize Python, Java, JavaScript, TypeScript, Ruby, C, and C++ code execution";
		String exp_title = d.getTitle();
		if(act_title.equals(exp_title)){
			System.out.println("Title is working.");
		}else{
			System.out.println("Title not Working.");
		}
		
	}

}
