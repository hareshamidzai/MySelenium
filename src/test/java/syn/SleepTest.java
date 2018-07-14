package Syn;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class SleepTest extends TestBase{

	@Test
	public void test() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		
		driver.findElement(By.tagName("button")).click();
		// locate element that is already in the html
		WebElement message = driver.findElement(By.xpath("//h4[.='Hello World!']"));
		
		//wait
		Thread.sleep(5000);// fail if you don't wait
		
		
		// verify element visible
		assertTrue(message.isDisplayed(),"Message not displayed");
	}
	
	
}
