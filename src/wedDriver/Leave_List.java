package wedDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Leave_List {

	public static void main(String[] args) {
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
	      
	      //Click on Leave List 
	      driver.findElement(By.xpath("//a[text()='My Leave']")).click();
	      
	      //size of the Row
	      String Src_Data = "2019-11-12";
	      boolean tag = false;
	      int row_count=driver.findElements(By.xpath("//table[@class=\"table hover\"]/tbody/tr")).size();
	        for(int i=1;i<row_count;i++) {
	        	String date = driver.findElement(By.xpath("//table[@class=\"table hover\"]/tbody/tr["+i+"]/td[1]")).getText();
	        	String  status= driver.findElement(By.xpath("//table[@class=\"table hover\"]/tbody/tr["+i+"]/td[6]")).getText();
	       
                 if(date.equals(Src_Data) && (status.contains("Pending Approval")))
                 {
                	 driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr["+i+"]/td[8]/select/option[text()='Cancel']")).click();
                	 driver.findElement(By.xpath("//input[@id=\"btnSave\"]")).click();
                	 tag=true;
                	 break;
                 }
                 if(tag)
                	 System.out.println("Leave with pending status identified and selected cancel");
                 else
                	 System.out.println("Leave with pending status not  identified and not selected cancel");	
	        	
	        }

	}

}
