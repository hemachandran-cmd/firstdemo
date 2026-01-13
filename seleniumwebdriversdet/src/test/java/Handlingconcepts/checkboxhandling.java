package Handlingconcepts;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> checkboxes=  driver.findElements(By.xpath("//input[@class='form-check-input'and @type='checkbox']"));
		
		for( WebElement checkbox:checkboxes) {
			checkbox.click();
		}

	}

}
