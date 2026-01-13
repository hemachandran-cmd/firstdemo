package handling1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		int noofBrokenLinks=0;
		for(WebElement linkele:links) {
			String hrefval=linkele.getAttribute("href");
			if(hrefval==null||hrefval.isEmpty()) {
				System.out.println("It is not possible");
				continue;
			}
			try {
			
	URL linkurl = new URL(hrefval);
	HttpURLConnection connection=(HttpURLConnection)linkurl.openConnection();
	connection.connect();
	if(connection.getResponseCode()>=400) {
		System.out.print("BRokenLink");
		noofBrokenLinks++;
	}
	else {
			System.out.print("Not a BRoken Link");
		}
			}
			catch(Exception e) {
				
			}
		}
		System.out.println(noofBrokenLinks);
	}
}
/*
 * 1.Check if the href has the value or not using for loop with the if condition
 * 2.If the href has the value then Hit the server through URL coz the href
 * values are in the string format 3.Then check the URL hit more than or equal
 * to the 400 4.Use it in the try catch block to handle the exception errors
 */
		
	

