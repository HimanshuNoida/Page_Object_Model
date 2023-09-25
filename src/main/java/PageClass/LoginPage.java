package PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseTest.Common_functionalities;
import baseTest.Page;

public class LoginPage extends Page {

	
	public AmazonHomeLandingPage login(String username,String password) throws InterruptedException {
		// Thread.sleep(3000);
		WebElement TopLinkMouseHover = driver.findElement(By.id("nav-link-accountList"));
		Common_functionalities.mouseHovere(TopLinkMouseHover);
		// Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][normalize-space()='Sign in']"))
				.click();
		// Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(username);
		// Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		// Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(password);
		// Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		// Thread.sleep(3000);

		return new AmazonHomeLandingPage();

	}

}
