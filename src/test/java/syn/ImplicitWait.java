package Syn;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ImplicitWait extends TestBase {
	

	@Test
	public void WaitTest() {
		
		
		
		driver.get("http://the-internet.herokuapp.com/dynamic_controls");

		 
	    driver.findElement(By.id("btn")).click();
	    
	    WebElement message = driver.findElement(By.id("message"));
	    
	    assertTrue(message.isDisplayed(), "Message should be displayed");
	    
	    assertEquals(message.getText(), "It's gone!");
	    
	    driver.findElement(By.id("btn")).click();
	    
	    
	    message = driver.findElement(By.id("message"));
	    
	    assertTrue(message.isDisplayed(), "Message should be displayed");
	    
	    assertEquals(message.getText(), "It's back!");
	    
	    
	    
		
		
	}

}
