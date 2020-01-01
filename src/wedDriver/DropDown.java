package wedDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
         //drop down demo using select class
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        
       /* Select sel_day = new Select(driver.findElement(By.id("day")));
        sel_day.selectByVisibleText("12");
        
        Select sel_month = new Select(driver.findElement(By.id("month")));
        sel_month.selectByVisibleText("Jun");

        Select sel_year = new Select(driver.findElement(By.id("year")));
        sel_year.selectByVisibleText("2000");*/
        
        Select sel_day = new Select(driver.findElement(By.id("day")));
        sel_day.selectByIndex(1);
        
        Select sel_month = new Select(driver.findElement(By.id("month")));
        sel_month.selectByIndex(2);
        
        Select sel_year = new Select(driver.findElement(By.id("year")));
        sel_year.selectByValue("2019");
        
        
        
	}

}
