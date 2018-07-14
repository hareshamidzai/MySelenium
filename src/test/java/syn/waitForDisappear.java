package Syn;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class waitForDisappear extends TestBase{
	@Test
	public void waitForDisapper1() {
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.tagName("button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(
				ExpectedConditions.invisibilityOfElementLocated(
						By.id("loading")));
		
		assertTrue(driver.findElement(By.cssSelector("#finish h4")).isDisplayed());
		
		
		
		
	}

}
