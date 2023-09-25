package PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseTest.Common_functionalities;
import baseTest.Page;

public class AmazonHomeLandingPage extends Page {
	
	public void SearchBox() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']")).click();
//		Thread.sleep(5000);
		driver.findElement(By.xpath("//option[@value='search-alias=alexa-skills']")).click();
//	    Thread.sleep(3000);
	    WebElement	search=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	    search.click();
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Alexa");
	    Thread.sleep(4000);
	/*    Common_functionalities.KeysDown("alexa ring light");
	   Thread.sleep(3000);
	    search.click();
		*/
	    driver.findElement(By.xpath("//div[@aria-label='alexa open youtube']")).click();
	    
		
	}

	
	
}
