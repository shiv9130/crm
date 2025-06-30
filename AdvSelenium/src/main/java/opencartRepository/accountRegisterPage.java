package opencartRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class accountRegisterPage extends BasePage{

	public accountRegisterPage(WebDriver driver) {
		super(driver);
			}
	@FindBy(name="firstname")
	private WebElement txtfirstName;
	
	@FindBy(name="lastname")
	private WebElement txtlastName;
	
	@FindBy(name="email")
	private WebElement txtemail;
	
	@FindBy(name="password")
	private WebElement txtpassword;
	
	@FindBy(name="agree")
	private WebElement radbCheckbox;
	
	@FindBy(xpath="//button[text()='Continue']")
	private WebElement btnContinue;
	
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
	private WebElement textCnfmMsg;

	/*public WebElement getTxtfirstName() {
		return txtfirstName;
	}

	public WebElement getTxtlastName() {
		return txtlastName;
	}

	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getRadbCheckbox() {
		return radbCheckbox;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getTextCnfmMsg() {
		return textCnfmMsg;
	}*/
	//methods for input and actions
	public void fName(String fname) {
		txtfirstName.sendKeys(fname);
	}
	
	public void lName(String lname) {
		txtlastName.sendKeys(lname);
	}

	public void email(String email) {
		txtemail.sendKeys(email);
	}
	public void password(String pw) {
		txtpassword.sendKeys(pw);
	}
	public void privacy() {
		radbCheckbox.click();
	}
	public void continueB() {
		btnContinue.click();//use submit, actions, jsexecutor, keywoard,explicitwait
	}
	public String confirmMessage() {//validation is part of test case
		try {
		return (textCnfmMsg.getText());//try message is true 
		}catch(Exception e) {
			return(e.getMessage());//if false then give exception
		}
	}


}
