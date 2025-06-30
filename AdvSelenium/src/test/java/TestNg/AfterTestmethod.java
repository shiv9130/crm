package TestNg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AfterTestmethod {
	
	@Test
	public void xyz() {
				System.out.println("this is xyz executed");
	}
	@AfterTest
	public void at() {
		System.out.println("this is after test method");
	}
	
	

}
