package package1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class DatePicker_Program {
	public WebDriver driver;
	@Test
	public void testDatePicker_Program() throws InterruptedException {

		driver.get("http://oaa-accessibility.org/example/15/");
//		driver.findElement(By.id("date")).sendKeys("02/20/2016");
		driver.findElement(By.id("bn_date")).click();
		driver.findElement(By.xpath("//td[text()='25']")).click();
		String entereddate=driver.findElement(By.id("date")).getAttribute("value");
		System.out.println("Entered date is : "+entereddate);
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
