package Handlingconcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement dropsele= driver.findElement(By.xpath("//select[@id='country']"));
		Select drpsle= new Select(dropsele);
		
		drpsle.selectByVisibleText("France");
		drpsle.selectByValue("France");
		drpsle.selectByIndex(4);
				
	}

}
