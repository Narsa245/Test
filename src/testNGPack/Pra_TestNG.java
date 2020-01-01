package testNGPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Pra_TestNG {

	@BeforeMethod
	public void Lancuhapp() {
		System.out.println("Lancuh The Application");
	}
	@BeforeClass
	public void Click() {
		System.out.println("Click  The Application");
	}

	@BeforeSuite
	public void EnterUrl() {
		System.out.println("Enter The Application URL");
	}

	@Test (priority=3)
	public void Test_case01() {
		System.out.println("Test Case01 is executed");
	}
	@Test (priority=1,enabled=false)
	public void Test_case02() {
		System.out.println("Test Case02 is executed");
	}
	@Test (priority=2)
	public void Test_case03() {
		System.out.println("Test Case03 is executed");
	}
	
	@AfterMethod
	public void execute() {
		System.out.println("Execute the Test Cases");
	}
	@AfterSuite
	public void res_report() {
		System.out.println("Report on results");
	}
	@AfterClass
	public void results() {
		System.out.println("results");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
