package Campaigns;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Generic_Utitlity.Excel_Utility;
import Generic_Utitlity.Java_Utility;
import Generic_Utitlity.Property_Utility;
import Generic_Utitlity.Webdriver_Utility;
import POM.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCampaignWithProduct 
{
	@Test
	public void createCampaignWithProduct() throws Throwable
	{
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
		Property_Utility plib=new Property_Utility();
		String BROWSER = plib.getKeyValue("browser");
		WebDriver driver;
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
	driver.manage().window().maximize();
	Webdriver_Utility wlib=new Webdriver_Utility();
	wlib.implicitWait(driver);
//	FileInputStream fis=new FileInputStream("./src/test/resources/commondata.properties");
//	Properties pro=new Properties();
//	pro.load(fis);
//	String Url = pro.getProperty("url");
//	String Usr = pro.getProperty("usr");
//	String Pwd = pro.getProperty("pwd");
	String Url = plib.getKeyValue("url");
	String Usr = plib.getKeyValue("usr");
	String Pwd = plib.getKeyValue("pwd");
	
	driver.get(Url);
	LoginPage login=new LoginPage(driver);
	login.loginToApp(Usr, Pwd);
//	driver.findElement(By.name("user_name")).sendKeys(Usr);
//	driver.findElement(By.name("user_password")).sendKeys(Pwd);
//	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.linkText("Products")).click();
	driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
	Java_Utility jlib=new Java_Utility();
	int ranNum = jlib.getRandonNum();
//	Random ran=new Random();
//	int ranNum = ran.nextInt(1000);
	Excel_Utility elib=new Excel_Utility();
	String result = elib.getExcelData("sheet1",0,2)+ranNum;
//	FileInputStream excldata=new FileInputStream("./src/test/resources/Excelsheet.xlsx");
//	Workbook wb = WorkbookFactory.create(excldata);
//	Sheet sh = wb.getSheet("sheet1");
//	Row row = sh.getRow(0);
//	Cell cel = row.getCell(2);
//	String result = cel.getStringCellValue()+ranNum;
	driver.findElement(By.name("productname")).sendKeys(result);
	driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
	
	WebElement more = driver.findElement(By.xpath("(//a[@href='javascript:;'])[1]"));
	Actions action=new Actions(driver);
	action.moveToElement(more).perform();
	driver.findElement(By.name("Campaigns")).click();
	driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
	String result1 = elib.getExcelData("sheet1",0,0)+ranNum;
	
//	Row row1 = sh.getRow(0);
//	Cell cel1 = row1.getCell(0);
//	String result1 = cel1.getStringCellValue()+ranNum;
	
	
	driver.findElement(By.name("campaignname")).sendKeys(result1);
	driver.findElement(By.xpath("//img[@title='Select']")).click();
	wlib.switchToWindow(driver,"Products&action");
//	Set<String> windowhandles = driver.getWindowHandles();
//	Iterator<String> it = windowhandles.iterator();
//	while(it.hasNext())
//	{		String wid = it.next();
//		driver.switchTo().window(wid);
//		String title = driver.getTitle();
//		if(title.contains("Products&action"))
//		{
//			break;
//		}
//	}
	

		driver.findElement(By.name("search_text")).sendKeys(result);
		driver.findElement(By.name("search")).click();
		driver.findElement(By.xpath("//a[text()='"+result+"']")).click();
		wlib.switchToWindow(driver,"Campaigns&action");
//		Set<String> windowhandles1 = driver.getWindowHandles();
//		Iterator<String> it1 = windowhandles1.iterator();
//		while(it1.hasNext())
//		{		String wid1 = it1.next();
//			driver.switchTo().window(wid1);
//			String title = driver.getTitle();
//			if(title.contains("Campaigns&action"))
//			{
//				break;
//			}
//		}
		driver.findElement(By.xpath("//input[@class='crmButton small save']")).click();
		String campaigndata = driver.findElement(By.xpath("//span[text()='"+result1+"']")).getText();
		if(campaigndata.contains(result1))
		{
			System.out.println("pass");
		}
		else
			System.out.println("Fail");
		String Prodctdata = driver.findElement(By.xpath("(//a[text()='"+result+"'])[2]")).getText();
		if(Prodctdata.contains(result))
		{
			System.out.println("pass");
		}
		else
			System.out.println("Fail");
		
		WebElement mousehover = driver.findElement(By.xpath("(//img[@style='padding: 0px;padding-left:5px'])[1]"));
		wlib.mouseHoverOnElement(driver, mousehover);
		driver.findElement(By.linkText("Sign Out")).click();
	}

}
