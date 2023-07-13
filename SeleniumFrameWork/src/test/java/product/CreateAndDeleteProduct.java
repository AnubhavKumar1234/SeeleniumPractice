package product;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;
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

public class CreateAndDeleteProduct 
{
	@Test
	public void createAndDeleteProduct() throws Throwable
	{
//	System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
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
	Java_Utility jlib=new Java_Utility();
	int ranNum = jlib.getRandonNum();
//	FileInputStream fis=new FileInputStream("./src/test/resources/commondata.properties");
//	Properties pro=new Properties();
//	pro.load(fis);
//	String Url = pro.getProperty("url");
//	String Usr = pro.getProperty("usr");
//	String Pwd = pro.getProperty("pwd");
	
	driver.get(Url);
	LoginPage login=new LoginPage(driver);
	login.loginToApp(Usr, Pwd);
//	driver.findElement(By.name("user_name")).sendKeys(Usr);
//	driver.findElement(By.name("user_password")).sendKeys(Pwd);
//	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.linkText("Products")).click();
	driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
//	Random ran=new Random();
//	int ranNum = ran.nextInt(1000);
//	FileInputStream excldata=new FileInputStream("./src/test/resources/Excelsheet.xlsx");
//	Workbook wb = WorkbookFactory.create(excldata);
//	Sheet sh = wb.getSheet("sheet1");
//	Row row = sh.getRow(0);
//	Cell cel = row.getCell(2);
//	String result = cel.getStringCellValue()+ranNum;
	Excel_Utility elib=new Excel_Utility();
	String result = elib.getExcelData("sheet1",0,2)+ranNum;
	driver.findElement(By.name("productname")).sendKeys(result);
	driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
	driver.findElement(By.xpath("(//input[@title='Delete [Alt+D]'])[1]")).click();
	wlib.switchToAlertAndAccept(driver);
	
	WebElement mousehover = driver.findElement(By.xpath("(//img[@style='padding: 0px;padding-left:5px'])[1]"));
	wlib.mouseHoverOnElement(driver, mousehover);
	driver.findElement(By.linkText("Sign Out")).click();
	}

}
