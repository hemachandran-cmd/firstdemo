package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	   WebDriver driver = new ChromeDriver();
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       Thread.sleep(5000);
	   String title=driver.getTitle();
	   System.out.println(title);
	   System.out.println(driver.getCurrentUrl());
	   System.out.println(driver.getPageSource());
	  // System.out.println(driver.getWindowHandle());
	   
	   driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
	   
	   Thread.sleep(5000);
	   System.out.println(driver.getWindowHandles());
	   driver.quit();
	}

}
