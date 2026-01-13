package typesofannotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/*
 * 1.LOGIN--->@BeforeMethod
 * 2.SEARCH----->@test
 * 3.LOGOUT---->@aftermethod
 * 4.LOGIN--->@BeforeMethod
 * 5.ADVANCESEARCH----->@test
 * 6.LOGOUT---->@aftermethod
 * Here the search and the advance search is the main test cases to be run
 * For the felxibility of the code we can use those type of annotations.
 */



/*
 *                        METHODS
 * 
 * These type will executed when it should execute for each cases which means for 
 * every @test the @beforemethod
 * 
 */

import org.testng.annotations.Test;

public class methodtype {
	@Test(priority=1)
	void search() {
		System.out.println("The application has the search option");
	}
	
    @Test(priority=2)
	void advancesearch() {
    	System.out.println("The application has the advanedsearch option");
	}
    
    @BeforeMethod
   void Login() {
    	System.out.println("The application is Logged IN");
   }
    
    @AfterMethod
	void Logout() {
    	System.out.println("The application is Logged OUT");
	}
}
