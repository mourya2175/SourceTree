package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Alert_Program {
	public WebDriver driver;
  @Test
  public void testAlert_Program() throws InterruptedException {
	  
	  driver.get("http://www.kesinenitravels.com");
	  driver.findElement(By.id("ctl00_ibtnCheckFare")).click();
	  driver.findElement(By.id("ctl00_cpEndUserMain_ibtnSearch")).click();
	  Thread.sleep(5000);
	  //handle alert
	  String alertmsg=driver.switchTo().alert().getText();
	  System.out.println("Alert message is : "+alertmsg);
	  //click OK button on alert
	  driver.switchTo().alert().accept();
	  //click Cancel button
//	  driver.switchTo().alert().dismiss();
	  driver.findElement(By.id("ctl00_ibtnViewPNR"));
	 
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
  
  public boolean isElePresent(By naga)
  {
	  try {
		driver.findElement(naga);
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Element is not found");
		return false;
	}
  }
  
 
}
