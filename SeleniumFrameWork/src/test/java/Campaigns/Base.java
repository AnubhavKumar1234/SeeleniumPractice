package Campaigns;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base 
{
	public static WebDriver driver;
	
	public static void initialization()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.goole.com");
	}
	
	public void failed()
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		File dest=new File("./google.png");
		FileUtils.copyFile(src, dest);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}


}
