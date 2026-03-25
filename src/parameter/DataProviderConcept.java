package parameter;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderConcept {

	@Test(dataProvider = "loginData")
	public void loginTest(String user, String pass) {
		System.out.println("Before Method");
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement UserName_Textbox = driver.findElement(By.id("username"));
		UserName_Textbox.clear();
		UserName_Textbox.sendKeys(user);
		
		WebElement password_Textbox = driver.findElement(By.name("password"));
		password_Textbox.clear();
		password_Textbox.sendKeys(pass);
		
		WebElement submit_button = driver.findElement(By.id("submit"));
		submit_button.click();


	}

	@DataProvider
	public Object[][] loginData() {
		return new Object[][] {
			{ "student", "Password123" },
			{ "student123", "Password123" },
			{ " ", "45636" },
		};
	}
}
