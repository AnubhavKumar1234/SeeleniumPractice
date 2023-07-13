package Campaigns;

import java.io.FileInputStream;
import java.util.Properties;
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

import Generic_Utitlity.Excel_Utility;
import Generic_Utitlity.Java_Utility;
import Generic_Utitlity.Property_Utility;
import Generic_Utitlity.Webdriver_Utility;
import POM.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCampaign {

	public static void main(String[] args) throws Throwable 
	{
//		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
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
		String Url = plib.getKeyValue("url");
		String Usr = plib.getKeyValue("usr");
		String Pwd = plib.getKeyValue("pwd");
//		FileInputStream fis=new FileInputStream("./src/test/resources/commondata.properties");
//		Properties pro=new Properties();
//		pro.load(fis);
//		String Url = pro.getProperty("url");
//		String Usr = pro.getProperty("usr");
//		String Pwd = pro.getProperty("pwd");
		
		Java_Utility jlib=new Java_Utility();
		int ranNum = jlib.getRandonNum();
		
		driver.get(Url);
		LoginPage login=new LoginPage(driver);
		login.loginToApp(Usr, Pwd);
//		driver.findElement(By.name("user_name")).sendKeys(Usr);
//		driver.findElement(By.name("user_password")).sendKeys(Pwd);
//		driver.findElement(By.id("submitButton")).click();
		WebElement more = driver.findElement(By.xpath("(//a[@href='javascript:;'])[1]"));
		
		wlib.mouseHoverOnElement(driver, more);
		driver.findElement(By.name("Campaigns")).click();
		driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
		Excel_Utility elib=new Excel_Utility();
		String result = elib.getExcelData("sheet1",0,0)+ranNum;
//		FileInputStream excl=new FileInputStream("./src/test/resources/Excelsheet.xlsx");
//		Workbook wb = WorkbookFactory.create(excl);
//		Sheet sh = wb.getSheet("sheet1");
//		Row row = sh.getRow(0);
//		Cell cel = row.getCell(0);
//		String result = cel.getStringCellValue()+ranNum;
		
		
		driver.findElement(By.name("campaignname")).sendKeys(result);
		driver.findElement(By.name("button")).click();
		String actdata = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if(actdata.contains(result))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}	
		WebElement mousehover = driver.findElement(By.xpath("(//img[@style='padding: 0px;padding-left:5px'])[1]"));
		wlib.mouseHoverOnElement(driver, mousehover);
		driver.findElement(By.linkText("Sign Out")).click();
		
		

	}

}
