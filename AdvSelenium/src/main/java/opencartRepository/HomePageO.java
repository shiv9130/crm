package opencartRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageO extends BasePage{
	
	public HomePageO(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//span[text()='My Account']")
	WebElement linkMyaccount;
	
	@FindBy(linkText = "Register")
	WebElement linkRegister;
	
	public void clickAccount() {
		linkMyaccount.click();
	}
	
	public void clickRegister() {
		linkRegister.click();
		
	}

}
