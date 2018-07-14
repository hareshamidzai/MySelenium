package Syn;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExplicitWait extends TestBase {
	
	@Test
	public void oneWhereImplicitDoesNotWork() throws InterruptedException {
		
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		
		driver.findElement(By.tagName("button")).click();
		// we can locate the message
  //		Thread.sleep(5000); // will work if you wait here 
		WebElement message = driver.findElement(By.cssSelector("#finish h4"));
	// assertion will fail since the message is not loaded
		assertTrue(message.isDisplayed(), "Message should have been displayed");
		Assert.assertEquals(message.getText(), "Hello World!");
		
		}
		
}
