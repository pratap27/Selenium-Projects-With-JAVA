package regression_design;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C_tut {
	
	@FindBy(xpath=".//*[@id='wrapper']/section[1]/div/nav/ul/li[3]/a")
	WebElement tuto;
	 
	@FindBy(xpath=".//*[@id='wrapper']/div/ul/li[1]/a")
	WebElement C;
	
	@FindBy(xpath=".//*[@id='wrapper']/div[2]/ul/b/li[1]/a")
	WebElement ct1;
	
	@FindBy(xpath=".//*[@id='wrapper']/section[2]/a[2]")
	WebElement np;
	
	@FindBy(xpath=".//*[@id='wrapper']/section[2]/a[1]")
	WebElement pp;
	
	@FindBy(linkText="NEXT PAGE")
	List<WebElement> links;
	
	@FindBy(linkText="PREVIOUS PAGE")
	List<WebElement> links0;
	
	@FindBy(xpath=".//*[@id='wrapper']/section[2]/a")
	List<WebElement> links1;
	
	@FindBy(xpath=".//*[@id='wrapper']/section[2]/div[1]/div[2]/a")
	List<WebElement> links2;
	
	@FindBy(xpath=".//*[@id='wrapper']/div[2]/ul")
	List<WebElement> li;
	
	@FindBy(xpath=".//*[@id='wrapper']/section[2]/div[1]/div[2]/a[2]")
	WebElement np1;
	
	@FindBy(xpath=".//*[@id='wrapper']/section[2]/div[1]/div[2]/a[1]")
	WebElement pp1;
	
	public C_tut(WebDriver d){
		PageFactory.initElements(d, this);
	}
	
	public void c_tut(WebDriver d) throws InterruptedException{
		tuto.click();
		C.click();
		ct1.click();
		//System.out.println("Total Links: "+li.size());
		/*np.click();
		Thread.sleep(1000);
		np1.click();
		Thread.sleep(1000);
		np.click();
		Thread.sleep(1000);
		np.click();
		Thread.sleep(1000);
		np.click();
		Thread.sleep(1000);
		np.click();
		Thread.sleep(1000);
		np.click();
		Thread.sleep(1000);
		np.click();
		Thread.sleep(1000);
		pp.click();
		Thread.sleep(1000);
		pp.click();
		Thread.sleep(1000);
		pp.click();
		Thread.sleep(1000);
		pp.click();
		Thread.sleep(1000);
		pp.click();
		Thread.sleep(2000);
		pp.click();
		Thread.sleep(2000);
		pp.click();
		Thread.sleep(2000);
		pp1.click();*/
		for(int i=0; i<5; i++){
			//links.get(i).click();
			np.click();
			np1.click();
			/*for(int j=0; j<8; j++){
				links.get(i).click();
				links.get(j).click();
			}*/
		}
		Thread.sleep(2000);
		for(int k=0; k<9; k++){

			//links0.get(k).click();
			pp.click();
			pp1.click();

		}
	}

}
