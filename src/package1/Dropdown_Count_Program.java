package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dropdown_Count_Program {
	public WebDriver driver;
  @Test
  public void tesBasics_Program() throws InterruptedException {
	  
	  driver.get("http://www.bing.com/");
	  //type in search box
	  driver.findElement(By.id("sb_form_q")).sendKeys("Automation");
	  //click search button
	  driver.findElement(By.className("b_searchboxSubmit")).click();
	  //click on preferences button
	  driver.findElement(By.xpath("//a[@title='Preferences']")).click();
	  //click on settings
	  driver.findElement(By.xpath("//ul[@id='b_idSettings']/li[2]/a")).click();
	  WebElement dd=driver.findElement(By.id("setlang"));
	 List<WebElement> opt=dd.findElements(By.tagName("option"));
	 System.out.println("Number of options in DD : "+opt.size());
	 //print values in dropdown
	 for (WebElement webElement : opt) {
		System.out.println("values in DD are : "+webElement.getText());
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
