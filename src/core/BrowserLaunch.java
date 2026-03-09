package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
//		WebDriver - Interface
//		driver - reference variable
//		new - keyword
//		ChromeDriver() - Constructor
//		ChromeDriver - Class
//		new ChromeDriver(); - Object of ChromeDriver
		
//		ChromeDriver driver2 = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();

	}

}
