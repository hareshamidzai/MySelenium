package Syn;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.NoSuchElementException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;



public class FluentWaitDemo extends TestBase{

	@Test
	public void fluentWaits() {
		
		driver.get("http://the-internet.herokuapp.com/dynamic_controls");
		
		driver.findElement(By.id("btn")).click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				
				.withTimeout(Duration.ofSeconds(5))
				
				.pollingEvery(Duration.ofSeconds(1))
				
				.ignoring(NoSuchElementException.class);
		// old way
//		WebElement element = wait.until(
//				new Function<WebDriver, WebElement>(){
//			public WebElement apply(WebDriver driver) {
//				return driver.findElement(By.id("message"));
//		}
//	});
		  // the condition which the wait object will wait for
   WebElement message = wait.until(dr -> dr.findElement(By.id("message")));	
		
		assertTrue(message.isDisplayed());
		assertEquals(message.getText(),"It's gone!");
		
	}}
