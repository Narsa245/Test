package wedDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableDemo {

	public static void main(String[] args) {
	     System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://testingmasters.com/hrm/");
			driver.manage().window().maximize();
		   
			 driver.findElement(By.id("txtUsername")).sendKeys("user02");
	         driver.findElement(By.name("txtPassword")).sendKeys("TM1234");
	         driver.findElement(By.id("btnLogin")).click();
	         
	         //Mouse hours using Actions
	         Actions act = new Actions(driver);
	         WebElement leave =  driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
	         act.moveToElement(leave).build().perform();
	          
	       
	         //driver.findElement(By.)
	 
	         

	}

}
