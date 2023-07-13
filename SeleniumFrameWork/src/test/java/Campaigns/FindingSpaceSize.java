package Campaigns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindingSpaceSize {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Rectangle usr = driver.findElement(By.name("username")).getRect();
		
	
		Rectangle pswd = driver.findElement(By.name("pwd")).getRect();
		
		int user=usr.getY()+usr.getHeight();
		System.out.println("user="+user);
		int pwd=pswd.getY();
		System.out.println("Password="+pwd);
		
		int space=pwd-user;
		
		System.out.println("Space="+space);
		

	}

}
