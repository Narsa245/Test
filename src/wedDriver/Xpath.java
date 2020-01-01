package wedDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {

   System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testingmasters.com/hrm/");
		driver.manage().window().maximize();
		
		/*driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("user02");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("TM1234");
		driver.findElement(By.xpath("//input[@type='submit']")).click();*/
		
		String expText ="LOGIN panel";
		// String actText = driver.findElement(By.xpath("//div[text()='')"));
		 
	
	}

}
