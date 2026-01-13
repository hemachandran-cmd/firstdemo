package TestNGcases;

import org.testng.annotations.Test;

/*
 * 1.OPEN
 * 2.LOGIN
 * 3.LOGOUT
 * 
 * We have to create a method for the each steps
 */


//By default TestNG runs the method in the alphabetical order
//We can control the Order by PRIORITY
//If we give the priority to the method it doesn't consider the order
//The priority number may be in random not in the consecutive number
//The default value of the priority  is (0)
//If the priority have the same number then it will consider the alphabetical order
//Negative values are allowed in the Priority


public class FirstTestcase {
	@Test(priority=1)
	void Openapp() {
		System.out.println("The app is opened");
	}
	
	@Test(priority=2)
	void Loginapp() {
		System.out.println("The app is Logged IN");
	}
	
	@Test(priority=3)
	void Logoutapp() {
		System.out.println("The app is Logged OUT");
	}

}
