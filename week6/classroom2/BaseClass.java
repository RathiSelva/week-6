package week6.classroom2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	 public ChromeDriver driver;
	 public String filename;
	 @Parameters({"url", "username", "password"})
	 @BeforeMethod
	public void preCondition(String url,String username,String password) {
    	WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	    driver.findElement(By.id("username")).sendKeys(username);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();}
	 
		@AfterMethod
	   public void postCondition() {
       driver.close();
		}
      
		@DataProvider(name="gettingData")
		public String[][] setData() throws IOException {
	    return ReadExcel.readData(filename);
		}}
       
       
	


