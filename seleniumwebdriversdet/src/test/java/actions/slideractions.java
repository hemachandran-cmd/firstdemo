package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slideractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	driver.get("https://jqueryui.com/resources/demos/slider/range.html");
	Actions act= new Actions(driver);
	
	WebElement min_sl =driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default' and @style='left: 60%;']"));
     //getlocation is the method from web element
	//the getlocation give us the point type of objects in the reslut(x,y).
	//If we want only x axis and yaxis  getx(),gety().
	System.out.print(min_sl.getLocation().getX());
	act.dragAndDropBy(min_sl,50,80).perform();
	System.out.print(min_sl.getLocation());

	}

}
