package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WithPageFactory {
	WebDriver driver;
	//constructor
	WithPageFactory(WebDriver driver){
	 PageFactory.initElements( driver,this);
	}
	//locators
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement Login;
	                                                                          
	//actionmethods
	
	 public void setUsername1(String user) {
		 username.sendKeys(user);
	 }
	 public void setpass(String passw) {
		password.sendKeys(passw);
	 }
	 public void LT() {
		 Login.click();
	 }

}
