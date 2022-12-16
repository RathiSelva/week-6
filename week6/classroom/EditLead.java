package week6.classroom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
  @Test
	public void runEditLead() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Enter UserName and Password Using Id Locator
		WebElement eleUsername = driver.findElement(By.id("username"));
		eleUsername.sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
		// Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		// Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		// Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rathi");
		// Enter LastName Field Using id Locatorql
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Selva");
		// Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("S.Rathi");
		// Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		// Enter Description Field Using any Locator of your choice
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Software Test Automation");
		// Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("srathi.msc@gmail.com");
		// find select class element
		WebElement Element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		// create object for Select class
		Select dropdown = new Select(Element);
		// choose the option
		dropdown.selectByVisibleText("New York");
		// Click on Create Button
		driver.findElement(By.name("submitButton")).click();
		// Click on edit button
		driver.findElement(By.linkText("Edit")).click();

		driver.findElement(By.id("updateLeadForm_description")).clear();

		// Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Get successful learning");
		// 19. Click on update button
		driver.findElement(By.name("submitButton")).click();
		// Get the Title of Resulting Page
		String title = driver.getTitle();
		System.out.println(title);
	}
}
