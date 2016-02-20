package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GetAttribute_Program {
	public WebDriver driver;
  @Test
  public void tesAssertEqual_Gettext_Program() throws InterruptedException {
	  
	  driver.get("http://www.rightstart.com/");
	  driver.findElement(By.linkText("Email Signup")).click();
	  driver.findElement(By.name("signup[eMail]")).sendKeys("naga@rs.com");
	  String txtvalue=driver.findElement(By.name("signup[eMail]")).getAttribute("value");
	  System.out.println("Value inside text box is : "+txtvalue);
	  driver.findElement(By.name("signup[firstName]")).sendKeys(txtvalue);
	  String txtsize=driver.findElement(By.name("signup[firstName]")).getAttribute("size");
	  System.out.println("FirstName size is : "+txtsize);
	  Thread.sleep(3000);
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
