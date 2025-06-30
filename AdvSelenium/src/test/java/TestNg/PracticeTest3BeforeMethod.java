package TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//test Case =login,search,logout again login, advsearch, logout

public class PracticeTest3BeforeMethod {
	
	@BeforeMethod
	public void Login() {
		
		System.out.println("login Executed");		
	}
	
	@Test(priority =1)
	public void search() {
		
		System.out.println("search Executed");	
	}
	@Test(priority =2)
	public void Advsearch() {
		
		System.out.println("Advsearch Executed");
	}
	
	@AfterMethod
	public void LogOut() {
		
		System.out.println("logOut Executed");
	}
}
