package TestNGdep;

import org.testng.annotations.Test;

public class class2 {
  
	@Test(priority=1,groups="Regression")
	void SignEmail() {
		System.out.println("The email is signed");
	}
	@Test(priority=2,groups="Regression")
	void SignInsta() {
		System.out.println("The insta is signed");

	}
	@Test(priority=3,groups="Regression")
	void SignTwitter() {
		System.out.println("The twitter is signed");

	}
}
