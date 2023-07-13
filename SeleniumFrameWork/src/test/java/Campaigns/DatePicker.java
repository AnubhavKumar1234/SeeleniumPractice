package Campaigns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) 
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		String month="AUGUST";
		String year="2023";
		String date="10";
		driver.findElement(By.xpath("//span[text()='Departure']")).click();//opens the date picker
		while(true)
		{
		String monthyear=driver.findElement(By.xpath("//div[text()='June 2023']")).getText();
		String arr[]=monthyear.split(" ");
		String mon=arr[0];
		String yr=arr[1];
		 if(mon.equalsIgnoreCase(month) && yr.equalsIgnoreCase(year))
		 {
			break;
		 }
		 else
		 {
			driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();
		 }
		}
		

	}

}
