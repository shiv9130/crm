package objectRepoNinzaCRm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends basePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
		
		@FindBy(linkText = "Campaigns") 
		private WebElement lnkcampaign;
		
		@FindBy(linkText = "Contacts") 
		private WebElement lnkcontact;
		
		@FindBy(linkText = "Leads") 
		private WebElement lnklead;
		
		@FindBy(linkText = "Opportunities") 
		private WebElement lnkopportunities;
		
		@FindBy(linkText = "Products") 
		private WebElement lnkproduct;
		
		@FindBy(xpath = "//div[text()='Logout ']")
		private WebElement logOutLink;

		public WebElement getLnkcampaign() {
			return lnkcampaign;
		}

		public WebElement getLnkcontact() {
			return lnkcontact;
		}

		public WebElement getLnklead() {
			return lnklead;
		}

		public WebElement getLnkopportunities() {
			return lnkopportunities;
		}

		public WebElement getLnkproduct() {
			return lnkproduct;
		}
		
		//action methods
		
		public void campaignlink() {
			lnkcampaign.click();
		}
		
		public WebElement getLogOutLink() {
			return logOutLink;
		}

		public void setLogOutLink(WebElement logOutLink) {
			this.logOutLink = logOutLink;
		}

		public void contactlink() {
			lnkcontact.click();
		}
		
		public void leadlink() {
			lnklead.click();
		}
		
		public void opportunitieslink() {
			lnkopportunities.click();
		}
		
		public void productlink() {
			lnkproduct.click();
		}
				
	}


