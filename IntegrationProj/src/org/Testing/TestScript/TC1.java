package org.Testing.TestScript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class TC1 {

	@ Test
	public void YTubeLanding() {
	

	System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\Ashish\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();

	driver.get("https://www.youtube.com/");
	
	driver.close();

}
}
