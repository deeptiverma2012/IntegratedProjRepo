package org.Testing.TestScript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC2 {

	@ Test
	public void FBLanding() throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\Ashish\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");
	
	Thread.sleep(5000);
	
	driver.close();

}
}
