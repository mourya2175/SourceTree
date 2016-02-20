package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertTrue_Program {
	public WebDriver driver;
  @Test
  public void tesAssertTrue_Program() throws InterruptedException {
	  
	  driver.get("http://www.rightstart.com/");
	  driver.findElement(By.linkText("Email Signup")).click();
	  Assert.assertTrue(isElePresent(By.name("signup[eMail]")));
	  driver.findElement(By.name("signup[eMail]")).sendKeys("test@rs.com");
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
