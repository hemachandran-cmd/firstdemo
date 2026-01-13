package day2x;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		
		//boolean electronics=driver.findElement(By.xpath("(//img[@class='_2puWtW _3a3qyb'])[12]")).isDisplayed();
	//System.out.print(electronics);
	
	
		//WebElement img = driver.findElement(By.xpath("(//img[@class='_2puWtW _3a3qyb'])[12]"));
//System.out.println(img.isDisplayed());
	
	
	
	//input[@name='search'][@placeholder='search']-->multiple attributes
	
	
	
	//AND/OR operators
	//input[@name='search' and @placeholder='search']
	//input[@name='search'or @placeholder='search']
		
		
		//xpath using text() method
	driver.findElement(By.xpath("//span[text()='Fashion']")).click();
	
	
//xpath using contains function
	driver.findElement(By.xpath("//input[contains(placeholder,sea)")).sendKeys("Tshirts");
		
	}

}
