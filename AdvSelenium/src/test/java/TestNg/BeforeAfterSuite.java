package TestNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeAfterSuite {
	
	@Test
	public void pqr() {
		System.out.println("pqr executed");
	}
	
	@BeforeSuite
	public void bs() {
		System.out.println("this is before suite");
	}
	
	@AfterSuite
	public void as() {
		System.out.println("this is after suite");
	}

}
