package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//declaration
	@FindBy(linkText="Products")
	private WebElement productLinkText;
	
	@FindBy(linkText="Organizations")
	private WebElement organizationLinkText;
	
	@FindBy(linkText="Campaigns")
	private WebElement campaignLinkText;
	
	@FindBy(xpath="(//a[@href='javascript:;'])[1]")
	private WebElement moreLinkText;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement signoutImg;
	
	@FindBy(linkText="Sign Out")
	private WebElement signoutLinkText;

	public WebElement getProductLinkText() {
		return productLinkText;
	}

	public WebElement getOrganizationLinkText() {
		return organizationLinkText;
	}

	public WebElement getCampaignLinkText() {
		return campaignLinkText;
	}

	public WebElement getMoreLinkText() {
		return moreLinkText;
	}

	public WebElement getSignoutImg() {
		return signoutImg;
	}

	public WebElement getSignoutLinkText() {
		return signoutLinkText;
	}
	
	//Business logics
	public void clickProductLink()
	{
		productLinkText.click();
	}
	
	public void clickOrganizationLinkText()
	{
		organizationLinkText.click();
	}
	
	public void clickMoreLinkText()
	{
		moreLinkText.click();
	}
	
	public void clickCampaignLinkText()
	{
		campaignLinkText.click();
	}
	
	public void clickSignOutLinkText()
	{
		signoutLinkText.click();
	}
	
	

}
