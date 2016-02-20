package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebdriverWait_Program {
	public WebDriver driver;
  @Test
  public void tesWebdriverWait_Program() throws InterruptedException {
	  
	  driver.get("https://the-internet.herokuapp.com/");
	  driver.findElement(By.linkText("Dynamic Loading")).click();
	  driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
	  //click on Start button
	  driver.findElement(By.xpath("//div[@id='start']/button")).click();
	  //get text
	  String expText=driver.findElement(By.xpath("//div[@id='finish']/h4")).getText();
	  System.out.println("Text before using Explicit wait : "+expText);
	  
	  //use Explicit wait
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']/h4")));
	  
	  String expTextAfterWait=driver.findElement(By.xpath("//div[@id='finish']/h4")).getText();
	  System.out.println("Text After using Explicit wait : "+expTextAfterWait);
	
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
