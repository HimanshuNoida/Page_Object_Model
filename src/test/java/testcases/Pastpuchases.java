package testcases;

import org.testng.annotations.Test;

import PageClass.PastPurchasesPage;
import PageClass.sell_Page;
import baseTest.Common_functionalities;
import baseTest.Page;

public class Pastpuchases {
	
	@Test
	public void pastpurchases() throws InterruptedException {
		Page.top.goToFresh();
		PastPurchasesPage sellpage = Common_functionalities.commonFreshTopNavigation.goToPast_pruchases();
		sell_Page AddToCart = sellpage.FreshOnionBuy();
		AddToCart.AddToCart();
	}

}
