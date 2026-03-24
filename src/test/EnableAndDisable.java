package test;

import org.testng.annotations.Test;

public class EnableAndDisable {
	
	@Test 
	public void login() {
		System.out.println("Login method");
	}

	@Test (enabled = true)
	public void dashboard() {
		System.out.println("Dashboard method");
	}

	@Test (enabled = false)
	public void payment() {
		System.out.println("Payment method");
	}

	@Test (enabled = false)
	public void address() {
		System.out.println("Address method");
	}

}
