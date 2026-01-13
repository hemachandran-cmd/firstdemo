package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ZmainMethodtoRun {
	WebDriver driver;
	
	@BeforeTest
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
  void login() {
		WithPageFactory pm= new WithPageFactory(driver);
	  pm.setUsername1("Hema");
	  pm.setpass("hema@123");
	  pm.LT(); 
	  
	  Assert.assertEquals(driver.getTitle(), "OrangeHRM");
  }
  @AfterTest
  void exit() {
	  driver.quit();
  }
}



