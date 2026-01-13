package Handlingconcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Statictable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Static Table=> It is a type of table where the data cannot be changed remains the same.
		int rows= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.print(rows);
		
		//read the specific data and from the row and column(Ex:5th row 1st column)
		String data= driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.print(data);
	}

}
