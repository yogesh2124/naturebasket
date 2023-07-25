package pageobjectclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseclass {
	public static WebDriver driver;
	
	@BeforeMethod
	public void setup () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();   //upcasting 
		driver.get("https://www.naturesbasket.co.in/");
		driver.manage().window().maximize();
	}
	
	
	@AfterMethod
	public void closebrowser() throws Throwable {
		Thread.sleep(4000);
		driver.quit(); 
	
	}
	
	public void screenshot() throws Throwable {
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\yoges\\Desktop\\mobile1"+".jpg");		
		FileUtils.copyFile(source, dest);
		
	}
	
	
}
