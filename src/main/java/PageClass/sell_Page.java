package PageClass;

import org.openqa.selenium.By;

import baseTest.Page;

public class sell_Page extends Page {

	public void goTostartSelling() {
		driver.findElement(By.xpath(
				"//div[@id='anonCarousel1']/ol/li[1]")).click();
	}
	public void AddToCart() {
		
		driver.findElement(By.xpath("//input[@aria-labelledby='freshAddToCartButton-announce']")).click();
	}
	

}
