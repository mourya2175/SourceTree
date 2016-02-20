package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Read_Excel_Program {
	public WebDriver driver;
  @Test
  public void testRead_Excel_Program() throws InterruptedException {
	  
	  driver.get("http://www.rightstart.com/");
	  driver.findElement(By.linkText("Email Signup")).click();
//	  Xls_Reader reader = new Xls_Reader("TestData\\data.xlsx");
	  Xls_Reader reader = new Xls_Reader("F:\\Selenium_Scripts_Latest\\Learn_Webdriver\\TestData\\data.xlsx");
	  
	  driver.findElement(By.name("signup[eMail]")).sendKeys(reader.getCellData("Sheet1", "EmailID", 2));
	  
	  driver.findElement(By.name("signup[firstName]")).sendKeys(reader.getCellData("Sheet1", "FirstName", 2));
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
