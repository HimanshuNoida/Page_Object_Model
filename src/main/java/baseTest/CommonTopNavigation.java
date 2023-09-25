package baseTest;

import org.openqa.selenium.By;

import Trending.BestSeller;
import Trending.New_Releases;

public class CommonTopNavigation extends Page {

	public void goToAll() {

		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();

	}

	public void goToFresh() {
		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_fresh']")).click();
		
	}

	public void goToAmazonminiTV() {

		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_avod_desktop_topnav']")).click();
	}

	public static void goToSell() {

		driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_2']")).click();
	}

	public  static void goToGiftCards() {
		driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_3']")).click();
	}

	public  static void goToBuyAgain() {

		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_buy_again']")).click();
	}

	public static void goToBaby() {
		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_baby']")).click();
	}

	public static void goToBrowsingHistory() {
		driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav-recently-viewed']")).click();

	}
	
	
	public BestSeller goToBestSeller() {
		driver.findElement(By.xpath("//ul[@class='hmenu hmenu-visible']//a[@class='hmenu-item'][normalize-space()='Best Sellers']")).click();
		
		return new BestSeller();
		
	}
	
	
	public  New_Releases gotToNew_Releases() {
		goToAll();
		driver.findElement(By.xpath("//ul[@class='hmenu hmenu-visible']//a[@class='hmenu-item'][normalize-space()='New Releases']")).click();
		return new  New_Releases();
		
	}
	
	
	public Trending.Movers_And_Shakers gotToMovers_And_Shakers() {
		
		driver.findElement(By.xpath("//a[@class='hmenu-item'][normalize-space()='Movers and Shakers']")).click();
		
		return new Trending.Movers_And_Shakers();
	}

}
