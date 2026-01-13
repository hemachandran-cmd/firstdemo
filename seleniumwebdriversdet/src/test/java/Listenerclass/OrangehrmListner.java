package Listenerclass;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class OrangehrmListner {
	
	WebDriver driver;
	@BeforeTest()
	void setup() throws InterruptedException {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	}
	@Test(priority=1)
	void testlogo() {
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		AssertJUnit.assertEquals(status,true);
	}
	@Test(priority=2)
	void testurl() {
		AssertJUnit.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/");
		
	}
	@Test(priority=3,dependsOnMethods={"testurl"})
	void testtitle() {
		AssertJUnit.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	@AfterTest()
	void logout() {
		driver.quit(); 
		
	}

}
