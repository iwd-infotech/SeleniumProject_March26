package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
//		Locators ID
		WebElement UserName_Textbox = driver.findElement(By.id("username"));
		UserName_Textbox.clear();
		UserName_Textbox.sendKeys("student");
		
//		Name
		WebElement password_Textbox = driver.findElement(By.name("password"));
		password_Textbox.clear();
		password_Textbox.sendKeys("Password123");
		
		WebElement submit_button = driver.findElement(By.id("submit"));
		submit_button.click();
		
		String expectedTite = "Logged In Successfull";
		String actualTitle = driver.findElement(By.xpath("//*[text()='Logged In Successfully']")).getText();
		
		if (expectedTite.equals(actualTitle)) {
			System.out.println("Logged In Successfully");
		} else {
			System.out.println("Logged In not Successfully");
		}
		
		
	}

}
