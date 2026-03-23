package test;

import org.testng.annotations.Test;

public class TestNGTestCases {
	
//	Alphabetic order execution without priority

	@Test (priority = -5)
	public void login() {
		System.out.println("Login method");
	}

	@Test (priority = 0)
	public void dashboard() {
		System.out.println("Dashboard method");
	}

	@Test (priority = 4)
	public void payment() {
		System.out.println("Payment method");
	}

	@Test (priority = 3)
	public void address() {
		System.out.println("Address method");
	}

}
