package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FileUpload_Program {
	public WebDriver driver;
  @Test
  public void tesFileUpload_Program() throws InterruptedException {
	  
	  driver.get("https://www.sendspace.com/");
	  driver.findElement(By.id("upload_file")).sendKeys("C:\\Users\\Naga\\Desktop\\Xpath_Css.txt");
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
