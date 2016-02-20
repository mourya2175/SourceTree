package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertEqual_Program {
	public WebDriver driver;
  @Test
  public void tesAssertEqual_Program() throws InterruptedException {
	  
	  driver.get("http://www.rightstart.com/");
	  driver.findElement(By.linkText("Order Status")).click();
	  //get title of the page
	  String titleofPage=driver.getTitle();
	  System.out.println("Title of the page is : "+titleofPage);
	  Assert.assertEquals(titleofPage, "Right Start Coupons and Newsletter Signup - Rightstart.com");
	  driver.findElement(By.id("order_number")).sendKeys("147852963");
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
