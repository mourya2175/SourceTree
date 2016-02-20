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

public class Screenshot_Fail_Program {
	public WebDriver driver;
	@Test
	public void testScreenshot_Fail_Program() throws InterruptedException, Exception {
		try {
			driver.get("http://www.bing.com/");
			//type in search box
			driver.findElement(By.id("sb_form_q")).sendKeys("Automation");
			//click search button
			driver.findElement(By.className("b_searchboxSubmit")).click();
			//click on preferences button
			driver.findElement(By.xpath("//a[@title='Preferences']")).click();
			//click on settings
			driver.findElement(By.xpath("//ul[@id='b_idSettings']/li[2]/a")).click();
			//select Radio button
			driver.findElement(By.id("adlt_set_strict789")).click();

		} catch (Exception e) {
			//capture screenshot
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("F:\\Jar\\screenshotfail1.jpeg"));
			e.printStackTrace();
			throw new Exception("Element not found");
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
