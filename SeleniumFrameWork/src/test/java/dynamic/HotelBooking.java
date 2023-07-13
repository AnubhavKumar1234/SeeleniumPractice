package dynamic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HotelBooking {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.agoda.com/?cid=-310");
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Shubhi Home Stay in Goa");
		driver.findElement(By.xpath("//span[.='Shubhi Home Stay in Goa']")).click();
		driver.findElement(By.xpath("//span[text()='25'][1]")).click();

	}

}
