package groups;

import org.testng.annotations.Test;

public class payment {
	
	@Test(priority=1,groups={"sanity","regression"})
	public void upi() {
		System.out.println("upi payment executed");
	}
	
	@Test(priority=2,groups={"sanity","regression"})
	public void netbanking() {
		System.out.println("net banking payment executed");
	}

}
