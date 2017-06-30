package pom_design;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common_utilities.excel_read;
import common_utilities.navigate_back;

public class edu_prog extends excel_read{
	
	@FindBy(id = "emailid1")
	WebElement l1;
	
	@FindBy(id="password")
	WebElement l2;
	
	@FindBy(xpath= ".//*[@id='wrapper']/section[3]/div/div[1]/form/fieldset/div[3]/input")
	WebElement l3;
	
	@FindBy(xpath=".//*[@id='wrapper']/section[1]/div/nav/ul/li[1]/a")
	WebElement edu;
	
	@FindBy(xpath=".//*[@id='myCarousel-2']/div/div/ul/li[2]/div/p/a/button")
	WebElement cl_st;
	
	@FindBy(xpath=".//*[@id='myCarousel']/div/div/ul/li[2]/div/p/a[1]/button")
	WebElement eng;
	
	@FindBy(xpath=".//*[@id='myCarousel']/div/div/ul/li[2]/div/a/button")
	WebElement st;
	
	@FindBy(xpath=".//*[@id='myCarousel']/div/div/ul/li[2]/div/ul/li[2]/a")
	WebElement phy;
	
	@FindBy(xpath=".//*[@id='myCarousel']/div/div/ul/li[2]/div/ul/li[1]/a")
	WebElement math;
	
	@FindBy(xpath=".//*[@id='myCarousel']/div/div/ul/li[2]/div/ul/li[3]/a")
	WebElement che;
	
	@FindBy(xpath=".//*[@id='myCarousel']/div/div/ul/li[2]/div/a/center/button")
	WebElement submit;
	
	@FindBy(xpath=".//*[@id='myCarousel']/div/div/ul/li[2]/div/a/button")
	WebElement retest;
	
	@FindBy(xpath=".//*[@id='quiz']/a/center/button")
	WebElement math_che_bio_zoo_submit;
	
	@FindBy(xpath=".//*[@id='question_1']")
	List<WebElement> all_check_box1;
	
	@FindBy(xpath=".//*[@id='question_2']")
	List<WebElement> all_check_box2;
	
	@FindBy(xpath=".//*[@id='quiz']/div[1]/ul/li")
	List<WebElement> all_chbox;
	
	@FindBy(xpath=".//*[@id='lessonThree']/a[1]")
	WebElement math_che_bio_zoo_prev;
	
	@FindBy(xpath=".//*[@id='lessonThree']/a[2]")
	WebElement math_che_bio_zoo_next;
	
	@FindBy(xpath=".//*[@id='lessonThree']/b/b/a[1]")
	WebElement phy_prev;
	
	@FindBy(xpath=".//*[@id='lessonThree']/b/b/a[2]")
	WebElement phy_next;
	
	@FindBy(xpath=".//*[@id='myCarousel']/div/div/ul/li[2]/div/p/a[2]/button")
	WebElement medi;
	
	@FindBy(xpath=".//*[@id='myCarousel']/div/div/ul/li[2]/div/a/button")
	WebElement medi_st;
	
	@FindBy(xpath=".//*[@id='myCarousel']/div/div/ul/li[2]/div/ul/li[1]/a")
	WebElement bio;
	
	@FindBy(xpath=".//*[@id='myCarousel']/div/div/ul/li[2]/div/ul/li[2]/a")
	WebElement Zoo;
	
	@FindBy(xpath=".//*[@id='myCarousel']/div/div/ul/li[2]/div/ul/li[4]/a")
	WebElement medi_che;
	
	@FindBy(xpath=".//*[@id='myCarousel']/div/div/ul/li[2]/div/ul/li[3]/a")
	WebElement medi_phy;
	
	@FindBy(xpath=".//*[@id='quiz']/b/a/center/button")
	WebElement medi_phy_submit;
	
	
	public edu_prog(WebDriver d){
		PageFactory.initElements(d, this);
	}
	
	public void g(WebDriver d) throws IOException{
		l1.sendKeys(ReadExcel("Sheet1", 16, 0));
		l2.sendKeys(ReadExcel("Sheet1", 16, 1));
		l3.click();
		
		edu.click();
		
		cl_st.click();
		
		eng.click();
		
		st.click();
		
		math.click();
		
		boolean bValue = false;
		bValue = all_check_box1.get(0).isSelected();
		
		if(bValue=true){
			 all_check_box1.get(0).click();
		}
		
		math_che_bio_zoo_next.click();
		
		
		
		if(bValue=true){
			 all_check_box2.get(0).click();
		}
		
		math_che_bio_zoo_submit.click();
		
		phy.click();
		math_che_bio_zoo_submit.click();
		
		che.click();
		
		math_che_bio_zoo_submit.click();
		
		submit.click();
		
		//d.get("http://192.168.100.37:8080/ICZone/eamcetSelectTest");
		//navigate_back.nav_back();
		
		medi.click();
		
		st.click();
		
		Zoo.click();
	
		math_che_bio_zoo_submit.click();
		
		bio.click();
		
		math_che_bio_zoo_submit.click();
		
		medi_che.click();
		
		math_che_bio_zoo_submit.click();
		
		medi_phy.click();
		
		medi_phy_submit.click();
		
		submit.click();
		
		st.click();
		
		d.get("http://192.168.100.37:8080/ICZone/home");
		//navigate_back.nav_back();
	}

}
