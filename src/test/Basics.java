package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Basics {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver(); 
	driver.get("https://demo.nopcommerce.com/register");
	
	WebElement radio=driver.findElement(By.id("gender-male"));
	radio.click();
	
	driver.findElement(By.id("FirstName")).click();
	driver.findElement(By.id("FirstName")).sendKeys("krishna");
	driver.findElement(By.id("LastName")).click();
	driver.findElement(By.id("LastName")).sendKeys("Reddy");
	
	WebElement day=driver.findElement(By.name("DateOfBirthDay"));
	Select set_day=new Select(day);
	set_day.selectByVisibleText("26");
	
	
	WebElement month=driver.findElement(By.name("DateOfBirthMonth"));
	Select set_month=new Select(month);
	set_month.selectByVisibleText("June");
	
	WebElement year=driver.findElement(By.name("DateOfBirthYear"));
	Select set_year=new Select(year);
	set_year.selectByVisibleText("1998");
	
	driver.findElement(By.id("Email")).click();
	driver.findElement(By.id("Email")).sendKeys("krishsofttech742@gmail.com");
	
	driver.findElement(By.id("Company")).click();
	driver.findElement(By.id("Company")).sendKeys("krishsoft Solutions");
	
	driver.findElement(By.id("Password")).click();
	driver.findElement(By.id("Password")).sendKeys("123456");
	
	driver.findElement(By.id("ConfirmPassword")).click();
	driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
	
	driver.findElement(By.id("register-button")).click();
	
	Thread.sleep(5000);

	driver.findElement(By.name("register-continue")).click();
	}
}
	
