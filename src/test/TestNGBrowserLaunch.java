package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGBrowserLaunch {

//	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.guru99.com/test/newtours/register.php");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//	}
	
	WebDriver driver;
	
	@Test (priority = 1)
	public void browserLaunch() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	@Test (priority = 2)
	public void aLoginTest() {
		WebElement UserName_Textbox = driver.findElement(By.id("username"));
		UserName_Textbox.clear();
		UserName_Textbox.sendKeys("student");
		
		WebElement password_Textbox = driver.findElement(By.name("password"));
		password_Textbox.clear();
		password_Textbox.sendKeys("Password123");
		
		WebElement submit_button = driver.findElement(By.id("submit"));
		submit_button.click();
	}
	

}
