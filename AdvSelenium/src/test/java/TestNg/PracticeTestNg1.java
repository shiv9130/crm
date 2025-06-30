package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeTestNg1 {
	
	@Test(priority = 0)
	public void m8() {
		Reporter.log("m8 executed 0",true);
	}
	@Test(priority = 2)
	public void m7() {
		Reporter.log("m7 executed  2 ",true);
	}
	@Test(priority = 1)
	public void m9() {
		Reporter.log("m9 executed  1",true);
	}

}
