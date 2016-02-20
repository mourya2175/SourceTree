package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Enabled_Program {
	public WebDriver driver;
  @Test
  public void tesEnabled_Program() throws InterruptedException {
	  
	  driver.get("http://www.plus2net.com/javascript_tutorial/listbox-disabled-demo.php");
	  driver.findElement(By.xpath("//input[@value='yes']")).click();
	  //get status of dropdown
	  boolean statusAfterSelectingYes=driver.findElement(By.name("Category")).isEnabled();
	  System.out.println("After selecting YES Dropdown is enabled : "+statusAfterSelectingYes);
	  Thread.sleep(5000);
	  //select radio button "NO"
	  driver.findElement(By.xpath("//input[@value='no']")).click();
	  //get the status of dropdown
	  boolean statusAfterSelectingNo=driver.findElement(By.name("Category")).isEnabled();
	  System.out.println("After selecting NO Dropdown is enabled : "+statusAfterSelectingNo);
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
