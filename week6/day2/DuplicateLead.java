package week6.day2;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import week6.classroom2.BaseClass;


public class DuplicateLead extends BaseClass {
	@BeforeClass
    public void settingData() {
		filename = "DuplicateLead";	
    }	
	
	@Test(dataProvider = "gettingData")
    public void duplicateLead(String cName, String fName, String lName,String fNLocal,String dName) {
		
		driver.findElement(By.linkText("CRM/SFA")).click();	
		driver.findElement(By.linkText("Leads")).click();		
		driver.findElement(By.linkText("Create Lead")).click();		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(fNLocal);
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(dName);
		/*
		 * WebElement Element =
		 * driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")); Select
		 * dropdown = new Select(Element); dropdown.selectByVisibleText("New York");
		 * driver.findElement(By.name("submitButton")).click(); // Get the Title of
		 * Resulting Page String title = driver.getTitle(); System.out.println(title);
		 * driver.findElement(By.linkText("Duplicate Lead")).click();
		 * 
		 * driver.findElement(By.id("createLeadForm_companyName")).clear();
		 * driver.findElement(By.id("createLeadForm_companyName")).
		 * sendKeys("TestLeaf Chennai");
		 * 
		 * // 19.Clear the FirstName Field using .clear() And Enter new FirstName
		 * driver.findElement(By.id("createLeadForm_firstName")).clear();
		 * driver.findElement(By.id("createLeadForm_firstName")).sendKeys("RATHI"); //
		 * 20.Click on Create Lead Button
		 * driver.findElement(By.className("smallSubmit")).click(); // 21. Get the Title
		 * of Resulting Page(refer the video) using driver.getTitle()
		 */
		String title1 = driver.getTitle();
		System.out.println(title1);

	}

}
