package groups;

import org.testng.annotations.Test;

public class loginTests {
	
	@Test(priority=1, groups="sanity")
	public void facebookLogin() {
		System.out.println("fb login executed");
	}
	
	@Test(priority=2, groups="sanity")
	public void emailLogin() {
		System.out.println("email login executed");
	}
	
	@Test(priority=3, groups="sanity")
	public void googleLogin() {
		System.out.println("google login executed");
	}

}
