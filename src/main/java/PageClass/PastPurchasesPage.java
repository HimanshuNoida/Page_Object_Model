package PageClass;

import org.openqa.selenium.By;

import baseTest.Page;

public class PastPurchasesPage extends Page{
	
	
	public sell_Page FreshOnionBuy() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='alm-cards-desktop-link-location-B07BG62MBV']//div[@class='_alm-carousel-desktop_imageStyle_asinBackgroundOverlay__3Pz90']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-labelledby='freshAddToCartButton-announce']")).click();
		return new sell_Page();
		
		
	}
	
	

}
