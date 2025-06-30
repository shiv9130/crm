package TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotation {
	
	@BeforeSuite
	public void bs() {
		System.out.println("before suite executed");
	}
	@AfterSuite
	public void as() {
		System.out.println("after suite executed");
	}
	@BeforeTest
	public void bt() {
		System.out.println("before test executed");
	}
	@AfterTest
	public void at() {
		System.out.println("after test executed");
	}
	@Test
	public void abc() {
		System.out.println("abc is executed");
	}
	@Test
	public void xyz() {
		System.out.println("xyz is executed");
	}
	@BeforeMethod
	public void bm() {
		System.out.println("before method executed");
	}
	@AfterMethod
	public void am() {
		System.out.println("after method executed");
	}
	
	

}
