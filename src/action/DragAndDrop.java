package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		
//		Source -> Destination
		driver.switchTo().frame(3);
		WebElement source = driver.findElement(By.xpath("//*[text()='High Tatras']"));
		WebElement destination = driver.findElement(By.id("trash"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(source).moveToElement(destination).release().perform();

	}

}
