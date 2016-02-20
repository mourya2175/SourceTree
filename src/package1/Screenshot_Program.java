package package1;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Screenshot_Program {
	public WebDriver driver;
	@Test
	public void tesScreenshot_Program() throws InterruptedException, Exception {

		driver.get("http://www.bing.com/");
		//type in search box
		driver.findElement(By.id("sb_form_q")).sendKeys("Automation");
		//click search button
		driver.findElement(By.className("b_searchboxSubmit")).click();
		//click on preferences button
		driver.findElement(By.xpath("//a[@title='Preferences']")).click();
		//click on settings
		driver.findElement(By.xpath("//ul[@id='b_idSettings']/li[2]/a")).click();

		//capture screenshot
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("F:\\Jar\\screenshot.jpeg"));
		
		//select Radio button
		driver.findElement(By.id("adlt_set_strict")).click();
		//uncheck the check box
		driver.findElement(By.name("enAS123")).click();
		//click on link
		driver.findElement(By.linkText("personalization settings page")).click();
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
