package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Chromedriver_Test {
	public WebDriver driver;
  @Test
  public void testFirefoxdriver_Test() {
	  
	  driver.get("http://www.rightstart.com/");
  }
  @BeforeClass
  public void beforeClass() {
	  //instantiate browser
	  System.setProperty("webdriver.chrome.driver", "F:\\Jar\\chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
	  //close browser
	  driver.quit();
  }

}
