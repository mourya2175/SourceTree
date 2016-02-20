package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IEdriver_Test {
	public WebDriver driver;
  @Test
  public void testFirefoxdriver_Test() {
	  
	  driver.get("http://www.rightstart.com/");
  }
  @BeforeClass
  public void beforeClass() {
	  //instantiate browser
	  System.setProperty("webdriver.ie.driver", "F:\\Jar\\IEDriverServer.exe");
	  driver = new InternetExplorerDriver();
  }

  @AfterClass
  public void afterClass() {
	  //close browser
	  driver.quit();
  }

}
