package wedDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href=\"/register?returnUrl=%2F\"]")).click();
		
		String expTxt ="Register";
		String  actTxt  = driver.findElement(By.xpath("//h1[text()='Register']")).getText();
		if(expTxt.equals(actTxt)) {
			System.out.println("To Get the title: "+actTxt);
		}
		else
			System.out.println("The Title Register not get");
		
		driver.findElement(By.xpath("//span[@class=\"male\"]/input")).click();
		driver.findElement(By.xpath("//input[@name=\"FirstName\" and @id=\"FirstName\" ]")).sendKeys("Avinash");
		driver.findElement(By.xpath("//input[@id=\"LastName\" and @data-val=\"true\" ]")).sendKeys("Ganta");
		   Select s_day = new  Select(driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\" or class=\"valid\"]")));
		   s_day.selectByValue("6");
		   Select s_month = new  Select(driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")));
		   s_month.selectByValue("5");
		   Select s_year = new  Select(driver.findElement(By.xpath("//div[@class=\"date-picker-wrapper\"]/select[3]")));
		   s_year.selectByIndex(100);
		   
		WebElement str = driver.findElement(By.xpath("//input[@type=\"email\" and  @name=\"Email\"]"));
		String email = "avinash2122@gmail.com";
		str.sendKeys(email);
		
		driver.findElement(By.xpath("//input[@id=\"Company\"]")).sendKeys("krish Software Solutions");
		driver.findElement(By.xpath("//input[@id=\"Company\"]")).sendKeys("krish Software Solutions");

		//input[@id="Company"]
       Thread.sleep(3000);
       
       
     //input[@data-val="true" and @name="Password"]

     driver.close();
     
     
	}

}
