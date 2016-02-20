package package1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Dropdown_Program {
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
	  Select s = new Select(dd);
	  //select value by Visible Text
	  s.selectByVisibleText("Deutsch");
//	  Thread.sleep(2000);
	  //select by value
	  s.selectByValue("fi-FI");
//	  Thread.sleep(2000);
	  //select by Index
	  s.selectByIndex(3);
//	  Thread.sleep(5000);
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
