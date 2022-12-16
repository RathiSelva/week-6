package week6.classroom2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class CreateLeaddataProvider extends BaseClass{
	
	@BeforeClass
    public void settingData() {
		filename = "createLead";	
    }
		
		@Test(dataProvider = "gettingData")
		public void paraCreateLead(String cName, String fName, String lName) {
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
			driver.findElement(By.name("submitButton")).click();
		}
     
		
			
			
			/*
			 * String[][] data = new String[2][3];
			 * 
			 * data[0][0] = "TestLeaf"; data[0][1] = "Rathi"; data[0][2] = "SR";
			 * 
			 * data[1][0] = "QEagle"; data[1][1] = "Selva"; data[1][2] = "BS";
			 
			return data;*/
		}
		
     		
