package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	
	@Test
	public void testLogin() {
		System.out.println("Login");
		
		Assert.assertEquals("Login Successfully", "Login Successfully");
		
		System.out.println("Payment");
	}
	
	@Test
	public void testCase() {
		
		SoftAssert sa = new SoftAssert();
		
		System.out.println("testCase");
		
		sa.assertEquals("Login Successfully", "Logout");
		
		System.out.println("testCase - Payment");
		sa.assertAll();  // very imp -> mandatory
		
	}

}
