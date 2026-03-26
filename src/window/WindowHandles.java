package window;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandles {

	@Test
	public void windowHandling() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[text()='    click   ']")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for (String childWindow : allWindows) {
			if (!childWindow.equals(parentWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println("Switched to Child Window");
			}
			
		}
		
		System.out.println("Child Window Title: " +driver.getTitle());
		driver.switchTo().window(parentWindow);
		System.out.println("Back to Parent Window");
		System.out.println("Parent Window Title: " +driver.getTitle());
		
//		driver.quit();

	}

}
