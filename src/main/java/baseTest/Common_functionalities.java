package baseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.reactivex.rxjava3.functions.Action;

public class Common_functionalities extends Page {

	public static String string;
	
	public static void mouseHovere(WebElement item) {

		Actions mouseHover = new Actions(driver);
		mouseHover.moveToElement(item).build().perform();
	}

	public static void KeysDown(String searchItem) throws InterruptedException {
		Actions keysDown=new Actions(driver);
		try {
		while(driver.findElement(By.xpath("//div[@class='two-pane-results-container']/div/div/div/div")).getText().equalsIgnoreCase(searchItem)) {
			String item=driver.findElement(By.xpath("//div[@class='two-pane-results-container']/div/div/div/div")).getText();
			System.out.println("The fetched String is ="+item);
			keysDown.sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		}
		}catch (Exception e) {
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		}
		
		
	}

	public void keysDown() {
		Actions keysDown = new Actions(driver);
		keysDown.sendKeys(Keys.DOWN);
	}
	
	
	public static void scrolltoanElement(WebElement item) {		
	     js.executeScript("arguments[0].scrollIntoView(true);", item);
	}
	
	
	public static void scrollToTop() {
		js.executeScript("scroll(0, -10000);");
	}
	
	
	
	

}
