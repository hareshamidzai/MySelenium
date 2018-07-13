package Properties;



import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class PropertiesDemo2 extends TestBase{
	
	
	@Test
	public void getUrl() {
		String url = Configuration1.getProperty("url");
		String name = Configuration1.getProperty("username");
		String pass = Configuration1.getProperty("password");
		driver.get(url);
		
		driver.findElement(By.name("user_name")).sendKeys(name);
		driver.findElement(By.name("username_password")).sendKeys(pass);
		driver.findElement(By.id("bigbutton")).click();
	}
	
	
	

}
