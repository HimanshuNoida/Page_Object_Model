package Trending;

import org.openqa.selenium.By;

import baseTest.Common_functionalities;
import baseTest.Page;

public class New_Releases extends Page {

	public void new_Releases() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//div[@id='zg_left_col1']/div[1]/div/div/div/div/div[2]/div/div[2]/div/ol/li[1]/div[2]/div/a[2]")).click();
		driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']")).click();
	    Common_functionalities.string=driver.findElement(By.xpath("//span[@id='productTitle']")).getText();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
	    Common_functionalities.scrollToTop();
	}
	
	
}
