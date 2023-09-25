package Trending;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseTest.Common_functionalities;
import baseTest.Page;

public class Movers_And_Shakers extends Page {

	public void moversandShakers() throws InterruptedException {

		Page.top.goToAll();
		Thread.sleep(3000);
		Page.top.gotToMovers_And_Shakers();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//div[@id='zg_left_col1']/div[1]/div/div/div/div/div[2]/div/div[2]/div/ol/li[1]/div[2]/div/a[1]/div/img"))
				.click();
		Thread.sleep(3000);
		WebElement l = driver.findElement(By.xpath("//input[@aria-labelledby='freshAddToCartButton-announce']"));
		Common_functionalities.scrolltoanElement(l);
		Common_functionalities.scrollToTop();
	}

}
