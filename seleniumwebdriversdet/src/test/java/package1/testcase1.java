package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//launch the browser
		//ChromeDriver driver= new ChromeDriver();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String act_title= driver.getTitle();
				if(act_title.equals("Flipkart"))
				{
					System.out.print("Test is passed");
					
				}
				else {
					System.out.print("Test is failed");
				}
				//Thread.sleep(5000);
		//driver.close();
			
	}

}


        
  