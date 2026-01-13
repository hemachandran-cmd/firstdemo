package day2;

import java.io.PrintStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
		
//locators
		//name//sendkeys which means we should enter a value
		driver.findElement(By.name("q")).sendKeys("Watches for men");
		
		//name//isdisplay we should verify is that icon or the text is displayed
		boolean cartdisplaystatus=	driver.findElement(By.className("_3RX0a-")).isDisplayed();
		System.out.print(cartdisplaystatus);
		
		//Linktext-->where the name given btw the links using anchor tag <a></a>
		driver.findElement(By.linkText("tables")).click();
		
		
		//for multiple web elements we should use findelementS
		List<WebElement> headerfile = driver.findElements(By.className(" "));
				
			System.out.print("total number of links"+ headerfile.size());
		
		//images
	List<WebElement> images=driver.findElements(By.tagName("img"));
	System.out.print("Total number of images ="+ images.size());
		 
	}

}
