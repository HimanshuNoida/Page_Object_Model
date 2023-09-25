package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

import Trending.BestSeller;
import baseTest.CommonTopNavigation;
import baseTest.Page;

public class BestSellers {

	
	@Test
	public void BestSellersItems() {
		
		
	Page.top.goToAll();
	BestSeller bestSeleller=Page.top.goToBestSeller();
	bestSeleller.Sell_Purchases();
		
		
	}
	
	
}
