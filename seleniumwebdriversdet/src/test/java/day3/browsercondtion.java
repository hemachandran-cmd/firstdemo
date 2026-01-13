package day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class browsercondtion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM')]")).click();
		//storing the ID of the web pages using set collections coz it does not allow the duplicates.
		 Set<String> WindowsId = driver.getWindowHandles();
		 //convert the set into list coz By using list we can pass the index value 
		 List<String> Windowlist = new ArrayList<>(WindowsId);
		  String childID =Windowlist.get(0);
		String ParentId = Windowlist.get(1);
		//by using switch case we can change the constant page where it takes the first page as continous and we can change to childId.
		 driver.switchTo().window(ParentId);
		 System.out.print(driver.getTitle());
		 
		 
         
	}

}
