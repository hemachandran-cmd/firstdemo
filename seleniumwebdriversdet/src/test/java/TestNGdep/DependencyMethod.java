package TestNGdep;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethod {
      
	
	@Test(priority=1)
	void OpenApp() {
		Assert.assertEquals(1,2);
	}
	@Test(priority=2,dependsOnMethods={"OpenApp"})
	void Login() {
		
		Assert.assertEquals(2,2);

	}
	@Test(priority=3,dependsOnMethods={"OpenApp","search"})
	void search() {
		Assert.assertEquals(1,1);

		
	}
	
	@Test(priority=4,dependsOnMethods={"OpenApp","Logout"})
	void Logout() {
		Assert.assertEquals(2,2);

	}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            