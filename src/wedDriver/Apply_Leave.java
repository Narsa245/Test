package wedDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Apply_Leave {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://testingmasters.com/hrm");
		  
		  driver.findElement(By.id("txtUsername")).sendKeys("user02");
	      driver.findElement(By.name("txtPassword")).sendKeys("TM1234");
	      driver.findElement(By.id("btnLogin")).click();
	      //Actions class using Mouse over actons
	      Actions act = new Actions(driver);
	      WebElement leave =driver.findElement(By.xpath("//div[@class=\"menu\"]/ul/li[1]"));
	      act.moveToElement(leave).pause(2000).build().perform();
	      
	      driver.findElement(By.xpath("//a[text()=\"Apply\"]")).click();
	      
	      //select is used to select the dropdown
	      Select sel_leave =new Select(driver.findElement(By.xpath("//select[@id=\"applyleave_txtLeaveType\"]")));
	      sel_leave.selectByIndex(2);
	      
	      //select datepicker through the xpath
	       driver.findElement(By.xpath("//input[@id='applyleave_txtFromDate']")).click();
	       driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]/option[text()='Dec']")).click();
	       driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]/option[text()='2019']")).click();
	       driver.findElement(By.xpath("//table[@class=\"ui-datepicker-calendar\"]/tbody/tr[6]/td[1]")).click();
	      
	      
	      /* //string is used to store data
	      String date = "2019-12-25";
	      WebElement form_date=driver.findElement(By.xpath("//input[@id=\"applyleave_txtFromDate\"]"));
	      form_date.clear();
	      form_date.sendKeys("2019-12-25");
	      form_date.sendKeys(Keys.ESCAPE);

	      WebElement to_date=driver.findElement(By.xpath("//input[@id=\"applyleave_txtToDate\"]"));
	      to_date.clear();
	      to_date.sendKeys("2019-12-25");
	      to_date.sendKeys(Keys.ESCAPE);*/
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//textarea[@id=\"applyleave_txtComment\"]")).sendKeys("Test case");
	      
	      driver.findElement(By.xpath("//input[@value=\"Apply\"]")).click();
         
	}

}
