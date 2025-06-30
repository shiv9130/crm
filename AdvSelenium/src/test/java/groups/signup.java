package groups;

import org.testng.annotations.Test;

public class signup {
	
	@Test(priority=1, groups="regression")
	public void signupfacebook() {
		
		System.out.println("fb signup executed");
	}
	
	@Test(priority=2,groups="regression")
	public void signupEmail() {
		
		System.out.println("email signup executed");
	}

	@Test(priority=3, groups="regression")
	public void signupGoogle() {
		
		System.out.println("google signup executed");
	}


}
