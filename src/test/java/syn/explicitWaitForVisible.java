package Syn;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class explicitWaitForVisible extends TestBase{
	
	@Test
	public void explicitWaitForVisible1() {
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.tagName("button")).click();
		
		WebElement message = driver.findElement(By.cssSelector("#finish h4"));
	// WebDriverWait --> class which enables explicit waiting
		//we pass the driver and the expected wait time as constructor
		WebDriverWait wait = new WebDriverWait(driver, 5);
		// wait.untill() --> actually starts waiting
		//ExpeatedConditions --> contains the wait conditions
		//which can be passed to untill() method
	//visibilityOf --> one of the conditions from the ExpectedConditions class
		//waits for the Element to be visible
		wait.until(ExpectedConditions.visibilityOf(message));
		
		assertTrue(message.isDisplayed(),"Messge should be displayed");
		Assert.assertEquals(message.getText(), "Hello World!");
	}
	
	

}
