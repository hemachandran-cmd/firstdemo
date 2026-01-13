package TestNGdep;

import org.testng.annotations.Test;

public class class1 {
  
	@Test(priority=1,groups="sanity")
	void LoginEmail() {
		System.out.println("The email is loggedIn");
	}
	@Test(priority=2,groups="sanity")
	void LoginInsta() {
		System.out.println("The insta is loggedIn");

	}
	@Test(priority=3,groups="sanity")
	void LoginTwitter() {
		System.out.println("The twitter is loggedIn");

	}
}
