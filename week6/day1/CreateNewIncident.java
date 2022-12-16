package week6.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewIncident {

	public static void main(String[] args) {
		
	    	WebDriverManager.chromedriver().setup();
	    	ChromeDriver driver = new ChromeDriver();
			driver.get("http://developer.servicenow.com");
			driver.manage().window().maximize();
			List<WebElement> noOfFrames = driver.findElements(By.tagName("iframe"));
			int size = noOfFrames.size();
			System.out.println(size);
			driver.switchTo().frame(7);
			driver.findElement(By.linkText("Agree and Proceed")).click();
			
			//driver.manage().deleteAllCookies();
			//driver.manage().deleteCookieNamed(servicenow);
		
			//driver.switchTo().frame("//iframe[@class='gwt-Frame']");
			//driver.switchTo().frame("//iframe[@title='TrustArc Cookie Consent Manager']");
			/*driver.findElement(By.xpath("//a[@class='call']")).click();
			driver.findElement(By.xpath("/html/body/dps-app//div/main/dps-home-unauth//div/div[1]/div[1]/dps-link")).click();
			driver.findElement(By.id("firstName")).sendKeys("Rathi");
			driver.findElement(By.id("lastName")).sendKeys("Selva");
			driver.findElement(By.id("email")).sendKeys("srathi.msc@gmail.com");
			WebElement dropdown = driver.findElement(By.id("country"));
			Select select = new Select(dropdown);
			select.selectByVisibleText("IN-India");
			driver.findElement(By.id("password")).sendKeys("RSelva@123");
			driver.findElement(By.id("confirmPassword")).sendKeys("RSelva@123");
			driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();
			driver.findElement(By.xpath("//label[@class='UF-check']")).click();
			driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
			driver.findElement(By.linkText("Login")).click();*/
			
			
			
			
		 }
	}


