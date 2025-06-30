package TestNg;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestMethod {
	@Test
	public void abc() {
		
		System.out.println("this is abc executed");
	}
	@BeforeTest
	public void bt() {
		System.out.println("this is before test");
	}

}
