package jsexectutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//
		js.executeScript("window.scrollby(0,1500)","");
		System.out.print(js.executeScript("return window.pageYOffset;"));
		
		//scrollIntoView() for where we need to the see the exact line onthe page instead of scrolling

		
		// js.executeScript("window.scrollby document.body.scrollHeight() for the last page
	}

}
