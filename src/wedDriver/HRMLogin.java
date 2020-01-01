package wedDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	  
		driver.get("http://testingmasters.com/hrm/");
		driver.manage().window().maximize();
	    //WebElement user = driver.findElement(By.id("txtUsername"));
		//user.sendKeys("user02");
		driver.findElement(By.id("txtUsername")).sendKeys("user02");
         driver.findElement(By.name("txtPassword")).sendKeys("TM1234");
         driver.findElement(By.id("btnLogin")).click();
	}

}
