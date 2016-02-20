package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Read_Excel_Program_Multi {
	public WebDriver driver;
	@Test
	public void testRead_Excel_Program() throws InterruptedException {

		driver.get("http://www.rightstart.com/");
		driver.findElement(By.linkText("Email Signup")).click();
		//	  Xls_Reader reader = new Xls_Reader("TestData\\data.xlsx");
		Xls_Reader reader = new Xls_Reader("F:\\Selenium_Scripts_Latest\\Learn_Webdriver\\TestData\\data.xlsx");
		for (int i = 2; i < reader.getRowCount("Sheet2"); i++) {
			
			driver.findElement(By.name("signup[eMail]")).sendKeys(reader.getCellData("Sheet2", "EmailID", i));
			driver.findElement(By.name("signup[firstName]")).sendKeys(reader.getCellData("Sheet2", "FirstName", i));
			Thread.sleep(2000);
			driver.findElement(By.name("signup[eMail]")).clear();
			driver.findElement(By.name("signup[firstName]")).clear();
			Thread.sleep(2000);
		}

		Thread.sleep(5000);

	}
	@BeforeClass
	public void beforeClass() {

		//instantiate browser
		driver = new FirefoxDriver();
		//maximize window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	public void afterClass() {
		//close browser
		driver.quit();
	}

}
