package week6.classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{
     @Test
	public void runCreateLead() {
		

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

		
		/* * WebElement eleTool =
		 * driver.findElement(By.id("createLeadForm_dataSourceId")); Select dd = new
		 * Select(eleTool); dd.selectByValue("LEAD_CONFERENCE");
		 * driver.findElement(By.name("submitButton")).click();
		 */
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Software Test Automation");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("srathi.msc@gmail.com");
		// find select class element
		WebElement Element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		// create object for Select class
		Select dropdown = new Select(Element);
		// choose the option
		dropdown.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);

		String text = driver.findElement(By.id("viewLead_description_sp")).getText();
		if (text.equals("Software Test Automation")) {
			System.out.println("This text is correct");
		} else {
			System.out.println("This text is not correct");

		}

	}

}
