package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//declaration
	@FindBy(name="user_name")private WebElement usertextfield;
	
	@FindBy(name="user_password")private WebElement passwordfield;
	
	@FindBy(id="submitButton")private WebElement submtbtn;

	public WebElement getUsertextfield() {
		return usertextfield;
	}

	public WebElement getPasswordfield() {
		return passwordfield;
	}

	public WebElement getSubmtbtn() {
		return submtbtn;
	}
	//Business logic
	/**
	 * this method is used to perform login operation
	 * @author anubhav
	 * @param usr
	 * @param pwd
	 */
	public void loginToApp(String usr,String pwd)
	{
		usertextfield.sendKeys(usr);
		passwordfield.sendKeys(pwd);
		submtbtn.click();
		
	}

}
