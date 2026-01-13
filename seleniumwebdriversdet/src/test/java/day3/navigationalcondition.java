package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationalcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		//navigate to it is also like the driver.get() method but 
		//driver.get() =>It only allows the string format to be run.
		//driver.navigate().to() =>It allows both the string format and url Object to be run.
		// when it uses url obj as aguments it convert the url object to string format and then it to the get method and run it.
		
		
	     driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     driver.navigate().to("https://www.booking.com/");

		//back command
		driver.navigate().back();
		System.out.print(driver.getCurrentUrl());
		
		//forward command
		driver.navigate().forward();
		System.out.print(driver.getCurrentUrl());
		
		//refresh
		driver.navigate().refresh();

	}

}
