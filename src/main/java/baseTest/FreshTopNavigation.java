package baseTest;

import org.openqa.selenium.By;

import PageClass.PastPurchasesPage;
import PageClass.sell_Page;

public class FreshTopNavigation extends Page {

	public PastPurchasesPage goToPast_pruchases() {

		driver.findElement(By.xpath("//span[normalize-space()='Past Purchases']")).click();
		return new PastPurchasesPage();
	}

	public void goToFruits_Vegatables() {
		driver.findElement(By.xpath("//a[@aria-label='Fruits & Vegetables']"));

	}

	public void goToRiceAtta_Dall() {
		driver.findElement(By.xpath("//span[@class='nav-a-content'][normalize-space()='Rice, Atta & Dal']"));

	}

	public void goToOilMasala_Sauces() {

		driver.findElement(By.xpath("//div[@id='nav-progressive-subnav']//a[1]"));
	}

	public void goToSnacks_Buiscuits() {

		driver.findElement(By.xpath("//span[@class='nav-a-content'][normalize-space()='Snacks & Biscuits']"));
	}

	public void goToEgg_Meat_Fish() {

		driver.findElement(By.xpath("//span[normalize-space()='Eggs, Meat & Fish']"));

	}

	public void goToHealth_Nutirition() {
		driver.findElement(By.xpath("//span[normalize-space()='Health & Nutrition']"));

	}

	public void goToCleaning_Household() {
		driver.findElement(By.xpath("//span[@class='nav-a-content'][normalize-space()='Cleaning & Household']"));

	}

}
