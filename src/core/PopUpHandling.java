package core;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
//		Thread.sleep(3000);    - This is a hard wait
		
		WebElement CusID = driver.findElement(By.name("cusid"));
		CusID.sendKeys("Seem_ID01");
		
		WebElement submit_Button = driver.findElement(By.xpath("//input[@type='submit']"));
		submit_Button.click();
		
		Alert alert = driver.switchTo().alert();
		String popupText_msg = alert.getText();
		System.out.println(popupText_msg);
		alert.accept();
//		alert.dismiss();

	}

}
