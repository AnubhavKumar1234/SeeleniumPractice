package Campaigns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPractice {

	public static void main(String[] args) 
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("http://the-internet.herokuapp.com/");
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 String title = driver.getTitle();
		 if(title.equalsIgnoreCase("The Internet"))
		 {
			 System.out.println("Title matched Go ahead");
		 }
		 driver.findElement(By.linkText("Key Presses")).click();
		 WebElement textbox = driver.findElement(By.id("target"));
		 textbox.sendKeys("v");
		String result = driver.findElement(By.id("result")).getText();
		if(result.contains("v"))
		{
			System.out.println("It's matching");
		}
		
		 

	}

}
