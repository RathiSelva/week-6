package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EditLead extends BaseClass {
  @Test
	public void runEditLead() {
				
		WebElement eleUsername = driver.findElement(By.id("username"));
		eleUsername.sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");		
		driver.findElement(By.className("decorativeSubmit")).click();		
		driver.findElement(By.linkText("CRM/SFA")).click();		
		driver.findElement(By.linkText("Leads")).click();		
		driver.findElement(By.linkText("Create Lead")).click();		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rathi");		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Selva");		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("S.Rathi");	
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Software Test Automation");		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("srathi.msc@gmail.com");		
		WebElement Element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));		
		Select dropdown = new Select(Element);		
		dropdown.selectByVisibleText("New York");		
		driver.findElement(By.name("submitButton")).click();		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Get successful learning");		
		driver.findElement(By.name("submitButton")).click();
  }	
}
