import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgAssertions {
	@Test
	void testtitle() {
		String act ="opencart";
		String exp ="opencart";
		
		/*if(act.equals(exp)) {
			Reporter.log("its match",true);
		}else {
			Reporter.log("not match",false);
		}*/
		
		Assert.assertEquals(act, exp);
		Assert.assertEquals("xyz", "xyz1");
		Assert.assertEquals("abc", 123);
		Assert.assertEquals(123, 345);
		Assert.assertEquals("123", 123);
		Assert.assertNotEquals(act, exp);
		Assert.assertNotEquals(123, 123);
		Assert.assertNotEquals(345, "bca");
		
		
	}

}
