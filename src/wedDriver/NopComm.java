package wedDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NopComm {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[@href=\"/register?returnUrl=%2F\"]")).click();
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		WebElement Gen_male= driver.findElement(By.xpath("//input[@id=\"gender-male\"]"));
        Gen_male.click();
        boolean b = Gen_male.isSelected();
        if(b)
        	System.out.println("Gender male-radio button selected");
        else
        	System.out.println("Gender male-radio button not selected");
	}
	
	

}
