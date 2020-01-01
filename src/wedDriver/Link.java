package wedDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
       // driver.findElement(By.linkText("Create a Page")).click();
       /* driver.findElement(By.partialLinkText("Create")).click();
        Thread.sleep(5000);
        driver.navigate().back();*/
        
        //Example to get links count and each link test
        List<WebElement> links = driver.findElements(By.tagName("a"));
        int n = links.size();
        System.out.println("The Link Count is:"+n);
        
        for(int i=0;i<n;i++) {
        	String txt = links.get(i).getText();
        	System.out.println(txt);
        }
        

}
}