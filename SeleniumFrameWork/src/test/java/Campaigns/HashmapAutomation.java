package Campaigns;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HashmapAutomation 
{
  static HashMap<String,String> logindata()
   {
	  HashMap<String,String> hm=new HashMap<String,String>();
	  hm.put("x", "mercury@mercury");
	  hm.put("y", "mercury1@mercury1");
	  hm.put("z", "mercury2@mercury2");
	  return hm;
   }
	

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		String credentials = logindata().get("x");
		String arr[]=credentials.split("@");
		String usr = arr[0];
		String pwd = arr[1];
		driver.findElement(By.name("userName")).sendKeys(usr);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();

	}

}
