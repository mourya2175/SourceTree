package package1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Firefoxdriver_Test {
	public WebDriver driver;
  @Test
  public void testFirefoxdriver_Test() {
	  
	  driver.get("http://www.rightstart.com/");
  }
  @BeforeClass
  public void beforeClass() {
	  
	  //instantiate browser
	  driver = new FirefoxDriver();
  }

  @AfterClass
  public void afterClass() {
	  //close browser
	  driver.quit();
  }

}
