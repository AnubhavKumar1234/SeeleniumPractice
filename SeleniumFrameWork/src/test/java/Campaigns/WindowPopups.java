package Campaigns;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopups {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		String parentwindowId = driver.getWindowHandle();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allwindows = driver.getWindowHandles();
		for(String windowId:allwindows)
		{
			driver.switchTo().window(windowId);
			Thread.sleep(2000);
			if(!windowId.equals(parentwindowId))
			{
				driver.findElement(By.linkText("Try Free")).click();
				break;
			}
		}
		driver.switchTo().window(parentwindowId);

	}

}
