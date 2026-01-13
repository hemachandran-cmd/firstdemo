package typesofannotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


/*
 * 1.LOGIN--->@BeforeMethod
 * 2.SEARCH----->@test
 * 3.ADVANCESEARCH----->@test
 * 4.LOGOUT---->@aftermethod
 * Here the search and the advance search is the main test cases to be run
 * For the felxibility of the code we can use those type of annotations.
 */



/*
 *                        CLASS
 * 
 * These type will executed when it should execute Only once for whole testcase 
 * every @test the @beforeclass&@afterclass
 * 
 */

import org.testng.annotations.Test;

public class classtype {
	@Test(priority=1)
	void search() {
		System.out.println("The application has the search option");
	}
	
    @Test(priority=2)
	void advancesearch() {
    	System.out.println("The application has the advanedsearch option");
	}
    
    @BeforeClass
   void Login() {
    	System.out.println("The application is Logged IN");
   }
    
    @AfterClass
	void Logout() {
    	System.out.println("The application is Logged OUT");
	}
}
