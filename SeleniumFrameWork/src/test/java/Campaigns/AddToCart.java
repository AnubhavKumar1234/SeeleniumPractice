package Campaigns;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCart {

	public static void main(String[] args) 
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
       WebElement Mob = driver.findElement(By.xpath("//img[@alt='Mobiles']"));
       Actions act=new Actions(driver);
       act.moveToElement(Mob).click().perform();
       //Mob.click();
       driver.findElement(By.xpath("(//div[@class='_HYyiu']/child::img)[1]")).click();
       WebElement pict = driver.findElement(By.xpath("//div[@data-id='MOBGNBYJPF2DEADS']/descendant::div/descendant::img"));
       String atr = pict.getAttribute("loading");
       if(atr.contains("eager"))
       {
    	   pict.click();
       }
      Set<String> handles = driver.getWindowHandles();
      Iterator<String> itr = handles.iterator();
      String parent = itr.next();
      System.out.println(parent);
      String child = itr.next();
      System.out.println(child);
      driver.switchTo().window(child);
//      if(driver.getTitle().contains("realme c55"))
//       driver.findElement(By.xpath("//ul[@class='row']/descendant::button")).click();
       driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
       
	}

}
