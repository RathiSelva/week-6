package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FindLead extends BaseClass {		
			@Test
	public void main() throws InterruptedException {
				
				driver.findElement(By.id("username")).sendKeys("democsr");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();				
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Find Leads")).click();
				driver.findElement(By.xpath("//span[text()='Phone']")).click();
				driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				Thread.sleep(2000);
				String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
						.getText();
				driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
				
				
				}
			}
		


