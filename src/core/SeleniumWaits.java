package core;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement CusID = driver.findElement(By.name("cusid"));
		CusID.sendKeys("Seem_ID01");
		
		WebElement submit_Button = driver.findElement(By.xpath("//input[@type='submit']"));
		submit_Button.click();
		
		Alert alert = driver.switchTo().alert();
		String popupText_msg = alert.getText();
		System.out.println(popupText_msg);
		alert.accept();

	}

}
