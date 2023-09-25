package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageClass.AmazonHomeLandingPage;
import PageClass.LoginPage;
import PageClass.PastPurchasesPage;
import PageClass.sell_Page;
import baseTest.Common_functionalities;
import baseTest.Page;

public class LoginPPage {

	@Test
	public void loginLandingPage() throws InterruptedException {

		LoginPage loginn = new LoginPage();
		AmazonHomeLandingPage AmazonHomeLandingPage = loginn.login("naudiyalhimanshu@gmail.com","Naulchite@601");
		
	}

}
