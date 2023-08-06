package tests;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PdfReaderTest {
 WebDriver driver;
 String url="https://www.adobe.com/support/products/enterprise/knowledgecenter/media/c4611_sample_explain.pdf";
	@BeforeSuite
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void pdfReaderTest() throws IOException
	{
		URL pdfurl=new URL(url);
		InputStream inputst = pdfurl.openStream();
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.close();
	}

}
