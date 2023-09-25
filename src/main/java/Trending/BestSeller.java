package Trending;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseTest.Common_functionalities;
import baseTest.Page;

public class BestSeller extends Page {

	public void Sell_Purchases() {
		driver.findElement(By.xpath(
				"//img[@alt='SOFTSPUN Microfiber Cloth - 4 pcs - 40x40 cms - 340 GSM Grey- Thick Lint & Streak-Free Multipurpose Cloths - Automotive Micro']"))
				.click();
		WebElement l = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		Common_functionalities.scrolltoanElement(l);
		l.click();
	

	}

}
