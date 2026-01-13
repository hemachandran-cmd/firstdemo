package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WithoutPageFac {
	WebDriver driver;
	//constructor=> which is used to initiate the webdriver
	WithoutPageFac(WebDriver driver){
		this.driver=driver;
	}
	
	//Locators
By username=By.xpath("//input[@placeholder='Username']");
By password=By.xpath("//input[@placeholder='Password']");
 By Login=  By.xpath("//button[normalize-space()='Login']");
 
 //actionmethods
 
 public void setUsername(String user) {
	 driver.findElement(username).sendKeys(user);
 }
	
 
 public void setpassword(String pwd) {
	 driver.findElement(password).sendKeys(pwd);
 }
 
 
 public void clickLogin() {
	 driver.findElement(Login).click();
 }
	

}


