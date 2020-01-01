package testNGPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParametersDemo {
	
	@Test
	 @Parameters({"URL","UID","PWD"})
	public void TC_Login(String url,String uid,String pwd) {	
	System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get(url);
	  
	  driver.findElement(By.id("txtUsername")).sendKeys(uid);
      driver.findElement(By.name("txtPassword")).sendKeys(pwd);
      driver.findElement(By.id("btnLogin")).click();
      
      System.out.println("Login test case is executed");
	}
	@Test
	public void TC_ApplyLeave() {
		System.out.println("ApplyLeave test case is executed");
	}
	
	@Test
	public void TC_LeaveList() {
		System.out.println("Leave List  test case is executed");
	}

}
