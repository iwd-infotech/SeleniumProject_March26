package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
//		WebDriver - Interface
//		driver - reference variable
//		new - keyword
//		ChromeDriver() - Constructor
//		ChromeDriver - Class
//		new ChromeDriver(); - Object of ChromeDriver
		
//		ChromeDriver driver2 = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();

	}

}


//https://demo.guru99.com/test/newtours/register.php
//https://demo.guru99.com/test/delete_customer.php
//https://www.globalsqa.com/demo-site/draganddrop/
//https://the-internet.herokuapp.com/windows
