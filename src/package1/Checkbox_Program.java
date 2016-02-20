package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Checkbox_Program {
	public WebDriver driver;
  @Test
  public void tesCheckbox_Program() throws InterruptedException {
	  
	  driver.get("http://www.rightstart.com/");
	  driver.findElement(By.partialLinkText("Email")).click();
	  driver.findElement(By.name("signup[postalCode]")).sendKeys("74125");
	  //verify the status of check box, isSelected is used for status of radiobutton, check box and dropdown
	  boolean status=driver.findElement(By.id("signup:PrefOnlinePromo")).isSelected();
	  if(status)
	  {
		  System.out.println("Check box is already checked");
	  }
	  else
	  {
		  System.out.println("Check box is not checked");
		  driver.findElement(By.id("signup:PrefOnlinePromo")).click();
	  }
	 
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
