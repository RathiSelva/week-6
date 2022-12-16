package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import week6.classroom2.BaseClass;

public class EditLead extends BaseClass {
	@BeforeClass
    public void settingData() {
		filename = "EditLead";   	
    }	
	
	@Test(dataProvider = "gettingData")
    public void duplicateLead(String cName, String fName, String lName,String fNLocal,String dName,String desc) {
		
		driver.findElement(By.linkText("CRM/SFA")).click();		
		driver.findElement(By.linkText("Leads")).click();		
		driver.findElement(By.linkText("Create Lead")).click();		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(fNLocal);		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(dName);		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Software Test Automation");		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("srathi.msc@gmail.com");		
		WebElement Element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));		
		Select dropdown = new Select(Element);		
		dropdown.selectByVisibleText("New York");		
		driver.findElement(By.name("submitButton")).click();		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys(desc);	
		driver.findElement(By.name("submitButton")).click();
		
	}
}
