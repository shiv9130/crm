package TestNg;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertionStatus {
	
	@org.testng.annotations.Test
	public void Test() {
		
	
	
	String exp = "opencart";
	String act = "open1cart";
	
	//hard assertion // directly use with assert class, they are static method
	Assert.assertEquals(exp, act);//passed
	Assert.assertEquals("abc","abc");//passed
	Assert.assertEquals("123",123 );//failed
	Assert.assertEquals("exp", "act");//failed
	Assert.assertTrue(true);//passed
	Assert.assertTrue(false);//failed
	Assert.assertTrue(1==2);//failed
	Assert.assertFalse(1==2);//passed,if any assertion failed test should be failed
	
	//soft assertion, use with object they are non static method
	
	SoftAssert sa = new SoftAssert(); //first create an object then access with the help of object from soft assertion
	sa.assertTrue(true);
	sa.assertAll();//last line of the code use this method menditory
	}
}
