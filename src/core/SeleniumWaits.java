package core;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
//		Thread.sleep(3000);    - This is a hard wait
//		1. ImplicitlyWait
//		Global Wait
//		Disadvantages:
//		1. Applicable to every web elements
//		2. No recommended for framework
//		3. Slow test Framework
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		2. Explicit wait:
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		WebElement CusID = driver.findElement(By.name("cusid"));
		wait.until(ExpectedConditions.visibilityOf(CusID));
		CusID.sendKeys("Seem_ID01");
		
		WebElement submit_Button = driver.findElement(By.xpath("//input[@type='submit']"));
		wait.until(ExpectedConditions.elementToBeClickable(submit_Button));
		submit_Button.click();
		
//		3. Fluent Wait
//		max time wait - 30 sec  - 25 sec skip
//		polling frequency - 5 sec 
		
		FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		WebElement element = fWait.until(d ->
					driver.findElement(By.id("login")));
				
		Alert alert = driver.switchTo().alert();
		String popupText_msg = alert.getText();
		System.out.println(popupText_msg);
		alert.accept();

	}

}
