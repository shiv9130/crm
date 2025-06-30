package objectRepoNinzaCRm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class createCampaign extends basePage {

	public createCampaign(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//span[text()=\"Create Campaign\"]")
	private WebElement btn1createcampainMain;
	
	@FindBy(name = "campaignName")
	private WebElement txtname;
	
	@FindBy(name = "targetSize")
	private WebElement txttargetSize;
	
	@FindBy(xpath = "//button[text()=\"Create Campaign\"]")
	private WebElement btn2createcampain;

	public WebElement getBtn1createcampainMain() {
		return btn1createcampainMain;
	}

	public WebElement getTxtname() {
		return txtname;
	}

	public WebElement getTxttargetSize() {
		return txttargetSize;
	}

	public WebElement getBtn2createcampain() {
		return btn2createcampain;
	}
	
	//action methods
	public void name(String cname) {
		txtname.sendKeys(cname);
	}
	
	public void target(String size) {
		txttargetSize.sendKeys(size);
	}
	
	public void btn1create() {
		btn1createcampainMain.click();
	}
	public void btn2create() {
		btn2createcampain.click();
	}
	

}
