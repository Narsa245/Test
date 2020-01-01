package wedDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        driver.findElement(By.name("email")).sendKeys("9642801891");
	        driver.findElement(By.name("pass")).sendKeys("8897827478");
	        

	        driver.findElement(By.id("u_0_b")).click();
	        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        Thread.sleep(5000);
	        driver.switchTo().alert().accept();
            driver.findElement(By.id("userNavigationLabel")).click();
            driver.findElement(By.id("u_c_5")).click();


	}
	
}
