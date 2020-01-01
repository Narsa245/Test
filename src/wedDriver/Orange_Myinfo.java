package wedDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Orange_Myinfo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		
		//open the browser
        WebDriver driver = new ChromeDriver();
        driver.get("http://testingmasters.com/hrm");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        //Enter the login details
        driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("user02");
        driver.findElement(By.xpath("//input[@name=\"txtPassword\"]")).sendKeys("TM1234");
        driver.findElement(By.xpath("//input[@name=\"Submit\"]")).click();
        
        //Click on the MY Info Module
        driver.findElement(By.xpath("//b[text()=\"My Info\"]")).click();
        
        //click on the Dependents 
        driver.findElement(By.xpath("//a[text()=\"Dependents\"]")).click();
       
        //click on the Add button
        driver.findElement(By.xpath("//input[@id=\"btnAddDependent\"]")).click();
       
        //fill the Required fields      
        String strName="reddy1234";
        driver.findElement(By.xpath("//input[@class=\"formInputText\" and  @id=\"dependent_name\"]")).sendKeys(strName);
        Thread.sleep(2000);
        Select Re_ship =new Select(driver.findElement(By.xpath("//select[@name=\"dependent[relationshipType]\"]")));
        Re_ship.selectByIndex(1);
        Thread.sleep(2000);
        
        String Date = "2018-02-15";
        WebElement Date_Birth = driver.findElement(By.xpath("//input[@id=\"dependent_dateOfBirth\"]"));
        Date_Birth.clear();
        Date_Birth.sendKeys(Date);
        
        Thread.sleep(2000);
        //click on the save button
        driver.findElement(By.xpath("//input[@name=\"btnSaveDependent\"]")).click();
        
        Thread.sleep(2000);
       
        //Find out The row count
         int row_count =  driver.findElements(By.xpath("//table[@id=\"dependent_list\"]/tbody/tr")).size();
         System.out.println(row_count);
         
        for(int i=1;i<row_count; i++) {

        	
         String name = driver.findElement(By.xpath("//table[@id=\"dependent_list\"]/tbody/tr["+i+"]/td[2]")).getText();
         String date1 = driver.findElement(By.xpath("//table[@id=\"dependent_list\"]/tbody/tr["+i+"]/td[4]")).getText();

            if((strName.equals(name)) && (Date.equals(date1))) {
            	System.out.println("The String is Selected:" +name);
            	System.out.println("The String is Selected:" +date1);
            }
        	
        }   

	}
}
