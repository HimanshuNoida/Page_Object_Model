package baseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Page {

	public static WebDriver driver;
	public static CommonTopNavigation top;
	public static FreshTopNavigation commonFreshTopNavigation;
	Properties config = new Properties();
	Properties OR = new Properties();
	public static JavascriptExecutor js;
	FileInputStream fis;

	public Page() {
		if (driver == null) {
	     	driver = new ChromeDriver ();
			top = new CommonTopNavigation();
			js=(JavascriptExecutor)driver;
			try {
				fis = new FileInputStream(System.getProperty("user.dir")
						+ "\\src\\test\\resources\\properties\\Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				config.load(fis);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\OR.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				OR.load(fis);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


			commonFreshTopNavigation = new FreshTopNavigation();

		
			driver.get(config.getProperty("testsiteurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),TimeUnit.SECONDS);
		
	}
	}
}
