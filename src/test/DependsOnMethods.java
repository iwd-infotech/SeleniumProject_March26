package test;

import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test 
	public void login() {
		System.out.println("Login method");
	}

	@Test (dependsOnMethods = "login")
	public void dashboard() {
		System.out.println("Dashboard method");
	}

	@Test (dependsOnMethods = "dashboard")
	public void payment() {
		int a = 0;
		int b = 10;
		System.out.println(b/a);
		System.out.println("Payment method");
	}

	@Test (dependsOnMethods = "payment")
	public void address() {
		System.out.println("Address method");
	}

}
