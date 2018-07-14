package Syn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {WebDriver driver;
@BeforeMethod
public void setUp() {
  System.out.println("Setting Up WebDriver Before Class");
  WebDriverManager.chromedriver().setup();
  driver = new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 //page loading for fist time//  .pageLoadTimeout(150, TimeUnit.SECONDS);
  							//  .setScripTimeout(30, TimeUnit.SECONDS);
  driver.manage().window().maximize();

}


//@AfterMethod
	public void tearDown() {
// driver.close();  // only closes the last window your on
		driver.quit();
}

}
