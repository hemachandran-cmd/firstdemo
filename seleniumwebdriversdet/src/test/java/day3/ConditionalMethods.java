package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/register");
		boolean Reg=driver.findElement(By.xpath("//div[@class='page-title']/child::h1")).isDisplayed();
	     System.out.println(Reg);
	     
	     boolean firstname= driver.findElement(By.id("FirstName")).isEnabled();
	     System.out.println(firstname);
	}

}
