package Campaigns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PermissionPopupNotification {

	public static void main(String[] args) 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(options);
//		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");

	}

}
