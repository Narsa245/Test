package wedDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultiSelect extends ParentClass{
	
	@Test(enabled=false)
	public void multiselectoptions() throws InterruptedException {
		driver.get("https://mdbootstrap.com/docs/jquery/forms/multiselect/");
		Thread.sleep(3000);
		
		
		WebElement multiselect=driver.findElement(By.xpath("//select[@class='custom-select browser-default']"));
		Select s=new Select(multiselect);
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		
		Thread.sleep(10000);
	}
	
	@Test(enabled=false)
	public void MiltiSelect2() throws InterruptedException {
		
		driver.get("https://mdbootstrap.com/docs/jquery/forms/multiselect/");
		Thread.sleep(3000);
		
		WebElement sel = driver.findElement(By.xpath("//section[@class='section-preview']//div[@class='col-md-12']/div/input"));
		sel.click();
		
		Thread.sleep(3000);
	
		List<WebElement> ele=driver.findElements(By.xpath("//section[@class='section-preview']//div[@class='col-md-12']/div/ul/li"));

		System.out.println("Elements size is "+ ele.size());
		
		
		for(int i=3;i<ele.size();i++) {
			WebElement ele1 =driver.findElement(By.xpath("//section[@class='section-preview']//div[@class='col-md-12']/div/ul/li["+ i +"]"));
			
			Thread.sleep(1000);
			ele1.click();
		}			
	}
	@Test
	public void MultiSelect3() throws InterruptedException {
      driver.get("https://mdbootstrap.com/docs/jquery/forms/multiselect/");
	  Thread.sleep(3000);
	  WebElement web = driver.findElement(By.xpath("//section[@id='v-8']//div[@class='select-wrapper mdb-select md-form']"));
	  web.click();
	  Thread.sleep(3000);
	  
	  List<WebElement> count =driver.findElements(By.xpath("//section[@id='v-8']//ul/li")); 
	  System.out.println(count.size());
	 
	   for(int i=3; i<count.size()-1; i++) { 
		 WebElement w = driver.findElement(By.xpath("//section[@id='v-8']//ul/li["+ i +"]"));
		 System.out.println("Text is "+ i +" "+  w.getText());
		 if(i==4 || i==6)
		 {
			 w.click();
		 }
		 Thread.sleep(1000); 
	   }
		
	}
	
}
