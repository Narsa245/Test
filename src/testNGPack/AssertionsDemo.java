package testNGPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsDemo {

		
		@Test
		public void TC_001() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://testingmasters.com/hrm");
		  
		  String actTitle = driver.getTitle();
		  String expTitle ="OrangeHRM";
		  
		  //Hard Assert
		 /* Assert.assertTrue(actTitle.equals("OrangeHRM"));
		  Assert.assertFalse(actTitle.equals("OrangeHRM"));
		  Assert.assertEquals(actTitle,expTitle);*/
		  
		  SoftAssert S_assert= new SoftAssert();
		  S_assert.assertEquals(actTitle, expTitle);
		  
		  System.out.println("tc02 test case is executed");
		  S_assert.assertAll();
	      }
		@Test
		public void TC_002() {
			System.out.println("tc02 test case is executed");
		}

}
