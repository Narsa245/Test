package wedDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HrmActions {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("http://testingmasters.com/hrm/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("user02");
		driver.findElement(By.xpath("//input[@id=\"txtPassword\"]")).sendKeys("TM1234");
		driver.findElement(By.xpath("//input[@name=\"Submit\"]")).click();
		
		Actions act = new Actions(driver);
		WebElement leave = driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
		act.moveToElement(leave).pause(3000).build().perform();
		
		driver.findElement(By.xpath("//a[@id='menu_leave_viewMyLeaveList']")).click();
		
		
		
		//a[@id="menu_leave_viewMyLeaveList"]
		List<WebElement> rows1=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		int rows=rows1.size();
		//String data=rows1.get(1).findElement(arg0)
		int cols=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td")).size();
		//int colcount=cols/rows;
		
		//row : 5, Col=4
		String textcell= driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[5]/td[4]")).getText();
		System.out.println("");
		
		String text;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=cols;j++) {
				text=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+ i +"]/td["+ j +"]")).getText();
				System.out.println("Table data is row: "+ i +" Column is: "+ j +" Text is: "+ text );
			}
		}
  }
}