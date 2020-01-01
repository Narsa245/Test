package testNGPack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;  
 
public class Tc_Leave {
	 
	@BeforeMethod
	public void bm() {
		System.out.println("Before method executed");
	}
	@AfterMethod
	public void am() {
		System.out.println("after method executed");
	}
	@Test(priority=1, enabled=false)
	public void TCo01() {
		System.out.println("TC01 executed");
	}
	@Test(priority=2)
	public void TCo02() {
		System.out.println("TC02 executed");
	}
	@Test(priority=3)
	public void TCo03() {
		System.out.println("TC03 executed");
	}

}
