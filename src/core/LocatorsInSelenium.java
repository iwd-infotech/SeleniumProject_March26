package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
//		3. LinkText
//		WebElement Home_Link = driver.findElement(By.linkText("Home"));
//		Home_Link.click();
//		
//		4. id
		WebElement Contact_Link = driver.findElement(By.id("menu-item-18"));
		Contact_Link.click();
		
//		5. Xpath
		WebElement name_Textbox = driver.findElement(By.xpath("//input[@name= 'wpforms[fields][0][first]']"));
		name_Textbox.sendKeys("123455");
		
//		5. css selector
		WebElement email_Textbox = driver.findElement(By.cssSelector("input[name= 'wpforms[fields][1]']"));
		email_Textbox.sendKeys("test@test.com");
		
	}

}
