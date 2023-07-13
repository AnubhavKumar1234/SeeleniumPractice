package Campaigns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsEnabledButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-lbl='lightbox-open-jdk-8u371-linux-aarch64.rpm']")).click();
       
		Thread.sleep(2400);
		
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]")).click();
//		boolean button = driver.findElement(By.xpath("//a[.='Download jdk-8u371-linux-aarch64.rpm']"));
		
//		System.out.println(button);
		driver.findElement(By.xpath("//a[.='Download jdk-8u371-linux-aarch64.rpm']")).click();
		
		
				

	}

}
