package wedDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ParentClass {
	WebDriver driver=null;
	@BeforeMethod
	public void Launch() {
	     System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
			 driver = new ChromeDriver();
		     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeapp() {
		//driver.quit();
	}
}
