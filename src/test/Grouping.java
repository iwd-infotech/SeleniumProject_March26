package test;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups = "smoke")
	public void login() {
		System.out.println("Login method");
	}

	@Test (groups = {"smoke", "regression"})
	public void dashboard() {
		System.out.println("Dashboard method");
	}

	@Test (groups = "smoke")
	public void payment() {
		
		System.out.println("Payment method");
	}

	@Test (groups = "regression")
	public void address() {
		System.out.println("Address method");
	}
	
	@Test (groups = "regression")
	public void show() {
		System.out.println("Show method");
	}

}
