package week6.classroom;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	 public ChromeDriver driver;
   
	 @BeforeMethod
	public void preCondition() {
    	WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();}
	 
		@AfterMethod
	public void postCondition() {
       driver.close();
	}

}
