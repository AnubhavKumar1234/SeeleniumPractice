package Campaigns;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScrenshotTest extends Base {

	
		@BeforeTest
		public void setUp()
		{
			initialization();
		}
		
		@AfterTest
		public void tearDown()
		{
			driver.quit();
		}
		
		@Test
		public void takeScreenshotTest()
		{
			Assert.assertEquals(false, true);
		}

	}


