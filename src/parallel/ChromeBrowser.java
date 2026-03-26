package parallel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeBrowser {
	
	@Test
	public void testcase1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("TestCase1 - " +Thread.currentThread().getId());
		
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
	public void testcase2() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("TestCase2 - " +Thread.currentThread().getId());
		
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
	public void testcase3() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("TestCase3 - " +Thread.currentThread().getId());
		
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
