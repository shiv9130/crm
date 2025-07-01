package objectRepoNinzaCRm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends basePage {
	
	public loginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(name = "username")
	private WebElement username;
	
	@FindBy(name = "password")
	private WebElement password;

	
	@FindBy(xpath = "//button[text()='Sign In']")
	private WebElement signIn;


	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getSignIn() {
		return signIn;
	}
       
	//actionMethod business logic class
	public void username(String name) {
		username.sendKeys(name);
	}
	public void password(String pw) {
		password.sendKeys(pw);
	}
	public void signIN() {
		signIn.click();
	}

}
