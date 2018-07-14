package Syn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavascriptExecutorExamples extends TestBase{
	
	@Test
	public void alerts() {
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		
		// class that enables executiong js commands
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// takes a js code as a string argument and executes on the browser
		js.executeScript("alert ('WARNING: some bad things are happening')");
	}
	
	@Test
	public void scroll() {
		driver.get("http://amazon.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		 WebElement element = driver.findElement(By.xpath("//*[.='Get to Know Us']"));
		
		 js.executeScript("arguments[0].scrollIntoView(true)",element);
		
		
	}
	
		@Test
		public void clickWithJavaScript() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.get("http://amazon.com");
			 WebElement element = driver.findElement(By.partialLinkText("Manage Your"));
			    
			    js.executeScript("arguments[0].click()", element);
			
			
			
		}

}
