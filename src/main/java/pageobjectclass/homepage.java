package pageobjectclass;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class homepage {
	WebDriver ldriver;
	
	@FindBy(xpath="//div[@id='btnClosePopUpBox']") WebElement closeadd;
	@FindBy(xpath="//input[@id='ctl00_txtSearchServicablePin']") WebElement pincode ;
	@FindBy(xpath="//input[@id='txt']") WebElement pincodetxt ;

	
	@FindBy(xpath="//input[@id='btnAddPin']") WebElement submitbtn; 
	@FindBy(xpath="//input[@id='btnAddPin']") WebElement pinok ;
	@FindBy(xpath="//input[@id='ctl00_txtMasterSearch1']") WebElement searchbar ;
	@FindBy(xpath="//input[@id='ctl00_ImgSearch']") WebElement searchbtn ;
	@FindBy(xpath="//*[@id='ctl00_ContentPlaceHolder1_divSearchData']/div[1]/div/div[6]/div[2]/div") WebElement add ;
	@FindBy(xpath="//span[text()='shop by category']") WebElement shopbycategory ;
	@FindBy(xpath="//li[@id='ctl00_Li11']") WebElement summer ;
	@FindBy(xpath="//div[@id='DIVSUPERCATEGORYID_1']") WebElement gifting ;
	@FindBy(xpath="//li[@id='ctl00_dataid5']") WebElement fruitsandvegitables ;
	@FindBy(xpath="//li[@id='ctl00_Li7']") WebElement cheesemeetandplatters ;
	@FindBy(xpath="//li[@id='ctl00_dataid2']") WebElement DelicatessenandCheese ;
	@FindBy(xpath="//li[@data-id='4']") WebElement InternationalCuisine ;
	@FindBy(xpath="//div[@id='DIVSUPERCATEGORYID_8']") WebElement Health ;
	@FindBy(xpath="//div[@id='DIV6']") WebElement IndianGrocery  ;
	@FindBy(xpath="//a[text()='gifting']") WebElement Gifting;
	

//	@FindBy(xpath="") WebElement ;
//	@FindBy(xpath="") WebElement ;
//	@FindBy(xpath="") WebElement ;

	
	
	public homepage(WebDriver rdriver) {                         //constructor
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
//	public void closepopup() {
//		closeadd.click();
//	}q
	public void pin() throws Throwable {
		pincode.click();
		Thread.sleep(2000);
		pincodetxt.sendKeys("411045");
		Thread.sleep(2000);
		submitbtn.click();
		Thread.sleep(2000);
		pinok.click();
	}
	
	public void searcharea() throws Throwable {
		String path = "C:\\Users\\yoges\\Desktop\\aryabhat\\book1.xlsx";
		FileInputStream excel = new FileInputStream(path);
		String value = WorkbookFactory.create(excel).getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
		searchbar.click();
		searchbar.sendKeys(value);
		Thread.sleep(2000);
		searchbtn.click();
		Thread.sleep(2000);
		add.click();
		Thread.sleep(2000);

		ldriver.navigate().back();
	}
	
	public void shopcategory() throws Throwable{
		shopbycategory.click();        Thread.sleep(2000);
		summer.click();                Thread.sleep(2000); ldriver.navigate().back();Thread.sleep(2000); shopbycategory.click(); ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		gifting.click();               Thread.sleep(2000); ldriver.navigate().back();Thread.sleep(2000); shopbycategory.click(); ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fruitsandvegitables.click();   Thread.sleep(2000); ldriver.navigate().back();Thread.sleep(2000); shopbycategory.click(); ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		cheesemeetandplatters.click(); Thread.sleep(2000); ldriver.navigate().back();Thread.sleep(2000); shopbycategory.click(); ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		DelicatessenandCheese.click(); Thread.sleep(2000); ldriver.navigate().back();Thread.sleep(2000); shopbycategory.click(); ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		InternationalCuisine.click();  Thread.sleep(2000); ldriver.navigate().back();Thread.sleep(2000); shopbycategory.click(); ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Health.click();                Thread.sleep(2000); ldriver.navigate().back();Thread.sleep(2000); shopbycategory.click(); ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		IndianGrocery.click();         Thread.sleep(2000); ldriver.navigate().back();Thread.sleep(2000); shopbycategory.click(); ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Gifting.click();			   Thread.sleep(2000);
		
		Set<String> windows = ldriver.getWindowHandles() ;
		Iterator<String> it=windows.iterator();
		String parent = it.next();
		String child  = it.next();
		
		ldriver.switchTo().window(parent);
	}

	
	}
	


