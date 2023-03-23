package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowser {
	//WebDriver manager
	@Test
	public void TestGooglePage() {
		WebDriverManager.chromiumdriver().setup();
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(option);
		 driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("www.tekdojo.us", Keys.ENTER);
		System.out.println("Title:" +driver.getTitle());
	}
}
