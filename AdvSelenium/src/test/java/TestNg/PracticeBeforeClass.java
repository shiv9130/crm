package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


//test Case =login,search, advsearch, logout
public class PracticeBeforeClass {
	
	
	@BeforeClass
	public void Login() {
		System.out.println("login executed");
	}
	@Test (priority=1)
	public void search() {
		System.out.println("search executed");
	}
	@Test (priority=2)
	public void advsearch() {
		System.out.println("advsearch executed");
	}
	@AfterClass
	public void Logout() {
		System.out.println("logout executed");
	}

}
