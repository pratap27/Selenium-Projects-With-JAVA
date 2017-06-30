package demo2;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class day1_3 {
	
	static WebDriver d;	

	public static void main(String[] args) {
		
		d = new FirefoxDriver();
		d.get("http://live.guru99.com/index.php/mobile.html");
		
		String sortElement = d.findElement(By.xpath("//li[1]//a[@class=\"product-image\"]")).getAttribute("title");
		Assert.assertEquals(sortElement, "IPhone");
		sortElement = d.findElement(By.xpath("//li[2]//a[@class=\"product-image\"]")).getAttribute("title");
		Assert.assertEquals(sortElement, "Samsung Galaxy");
		sortElement = d.findElement(By.xpath("//li[3]//a[@class=\"product-image\"]")).getAttribute("title");
		Assert.assertEquals(sortElement, "Xperia");
		
		WebElement a = d.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select"));
		
		List<WebElement> b = a.findElements(By.xpath("//img[contains(@id, 'product-collection-image')]"));
		LinkedList<String> product_names =  new LinkedList<String>();
		
		for(int i=0;i<b.size();i++){

		    String s = b.get(i).getAttribute("alt");

		    product_names.add(s);

		}
		boolean result = chkalphabetical_order(product_names);


		//print the result    

		System.out.println(result);
		
	}
	
	public static boolean chkalphabetical_order(LinkedList<String> product_names){

	    String previous = ""; // empty string

	    for (final String current: product_names) {
	        if (current.compareTo(previous) < 0)
	            return false;
	        previous = current;
	    }

	    return true;

	    }

}
