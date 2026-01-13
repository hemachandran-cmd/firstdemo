package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class asserttype {
	@Test
	void Softassert() {
		
		System.out.println("It is before softassertion");
		 SoftAssert sa = new SoftAssert();
		 sa.assertEquals(1,2);
	
		System.out.println("It is after the softassertion");
		 
		
	}
	@Test
void Hardassert() {
		
		System.out.println("It is before  the HardAssertion");
		 
		 Assert.assertEquals(1,2);
	
		System.out.println("It is after the  hard assertion");
		 
		
	}

}
