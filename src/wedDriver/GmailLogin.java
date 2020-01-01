package wedDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
	    //WebElement user = driver.findElement(By.id("txtUsername"));
		//user.sendKeys("user02");
		driver.findElement(By.id("identifierId")).sendKeys("narasareddy245@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(2000);
        // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         driver.findElement(By.name("password")).sendKeys("8897827478");
 		 driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

         }

}
