package testclass;

import org.testng.annotations.Test;

import pageobjectclass.baseclass;
import pageobjectclass.homepage;

public class test1 extends baseclass {

	@Test
	public void homepagetest() throws Throwable {
		
		homepage home = new homepage(driver); 
		
		Thread.sleep(2000);
	//	home.closepopup();
		Thread.sleep(2000);
        home.pin();
		Thread.sleep(2000);
        home.searcharea(); 
		Thread.sleep(2000);
		//screenshot();
		home.shopcategory();
		Thread.sleep(2000);
		screenshot();

	}

	
	  
	

}
