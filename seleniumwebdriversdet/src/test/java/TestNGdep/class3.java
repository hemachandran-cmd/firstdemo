package TestNGdep;

import org.testng.annotations.Test;

public class class3 {

		  
		@Test(priority=1,groups="Functional")
		void OpenEmail() {
			System.out.println("The email is Open");
		}
		@Test(priority=2,groups="Functional")
		void OpenInsta() {
			System.out.println("The insta is Open");

		}
		@Test(priority=3,groups="Functional")
		void OpenTwitter() {
			System.out.println("The twitter is Open");

		}
	}


