package Campaigns;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class demoParallel
{
	WebDriver driver;
	@Test
	public void verifytitle() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		Assert.assertEquals(driver.getTitle(),"Swag Labs");
		Thread.sleep(2400);
		//driver.quit();
	}
	@Test
	public void verifylogo() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement logo = driver.findElement(By.xpath("//div[@class=\"login_logo\"]"));
		
		if(logo.isDisplayed())
		{
			System.out.println("passed");
		}
		Thread.sleep(2400);
		
		//driver.quit();
	}

}
