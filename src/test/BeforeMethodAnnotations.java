package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodAnnotations {
	WebDriver driver;

	@Test
	public void validUserNameAndPass() {
		System.out.println("validUserNameAndPass");
		WebElement UserName_Textbox = driver.findElement(By.id("username"));
		UserName_Textbox.clear();
		UserName_Textbox.sendKeys("student");
		
		WebElement password_Textbox = driver.findElement(By.name("password"));
		password_Textbox.clear();
		password_Textbox.sendKeys("Password123");
		
		WebElement submit_button = driver.findElement(By.id("submit"));
		submit_button.click();
	}

	@Test
	public void inValidUserName() {
		System.out.println("In Valid UserName");
		WebElement UserName_Textbox = driver.findElement(By.id("username"));
		UserName_Textbox.clear();
		UserName_Textbox.sendKeys("student655");
		
		WebElement password_Textbox = driver.findElement(By.name("password"));
		password_Textbox.clear();
		password_Textbox.sendKeys("Password123");
		
		WebElement submit_button = driver.findElement(By.id("submit"));
		submit_button.click();
	}

	@Test
	public void inValidPassword() {
		System.out.println("In Valid Password");
		WebElement UserName_Textbox = driver.findElement(By.id("username"));
		UserName_Textbox.clear();
		UserName_Textbox.sendKeys("student");
		
		WebElement password_Textbox = driver.findElement(By.name("password"));
		password_Textbox.clear();
		password_Textbox.sendKeys("Password");
		
		WebElement submit_button = driver.findElement(By.id("submit"));
		submit_button.click();
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
//		driver.close();
	}

}
