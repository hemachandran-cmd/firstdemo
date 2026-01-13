package packager;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;    
public class datepicker {
	static void MonthandYear(WebDriver driver,String month,String year) {
		  while(true) {
	    	   String cur_mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	    	   String cur_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	    	   if(cur_mon.equals(month)&& cur_year.equals(year)) {
	    		   break;
	    	   }
	    	   driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
	       }
	}
	static void date(WebDriver driver, String date) {
		List<WebElement>dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
	       
	       for(WebElement dt:dates) {
	    	 if(dt.getText().equals(date)){//here the dt.gettext() is the dates in the table on the frame 1to30 or 31
	    	 dt.click();
	    	 break;
	    	 }
	    	   }
	}
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/datepicker/");
       driver.switchTo().frame(0);
       
       String year = "2025";
       String month ="May";
       String date ="30";
       
       driver.findElement(By.xpath("//input[@id='datepicker']")).click();   
       
       MonthandYear(driver,month,year);
       date(driver,date);
	}

}
