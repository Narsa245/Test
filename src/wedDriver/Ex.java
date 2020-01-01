package wedDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Ashok");
		driver.findElement(By.id("LastName")).sendKeys("Bonala");
		
		Select sel_day = new Select(driver.findElement(By.name("DateOfBirthDay")));
		
		sel_day.selectByIndex(3);
		Select sel_month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
		sel_month.selectByVisibleText("July");
		Select sel_year = new Select(driver.findElement(By.name("DateOfBirthYear")));
		sel_year.selectByValue("1997");
		
		WebElement str = driver.findElement(By.id("Email"));
	     String email = "mail2narsa5@gmail.com";
	     str.sendKeys(email); 
		 
	     driver.findElement(By.id("Company")).sendKeys("Krish Software Solutions");
	     driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	     WebElement str1 = driver.findElement(By.id("Password"));
	       String pass = "9948889237";
	       str1.sendKeys(pass);
	       System.out.println(pass);
	       driver.findElement(By.name("ConfirmPassword")).sendKeys("9948889237");
	       driver.findElement(By.xpath("//input[@name=\"register-button\"]")).click();
	       
	       driver.findElement(By.name("register-continue")).click();
	       
	       driver.findElement(By.linkText("Log out")).click();
	       driver.findElement(By.linkText("Log in")).click();
	       Thread.sleep(5000);
			driver.findElement(By.id("Email")).sendKeys(email);
			driver.findElement(By.id("Password")).sendKeys(pass);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();

	}

}
