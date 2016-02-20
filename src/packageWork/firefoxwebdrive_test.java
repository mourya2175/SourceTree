package packageWork;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterClass;

public class firefoxwebdrive_test {
	public WebDriver driver;
	@Test
	public void testFirefoxdriver_Test() {
		driver.get("https://www.google.com/");
	}
	@BeforeClass
	public void beforeClass() {
		
		File pathToBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();       
		driver = new FirefoxDriver(ffBinary,firefoxProfile);
		
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}