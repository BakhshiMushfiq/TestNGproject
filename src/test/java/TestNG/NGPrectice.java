package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NGPrectice {
WebDriver driver;
	public void browser() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		
		driver.get("https://www.facebook.com");
		
	
		driver.findElement(By.id("email")).sendKeys("mushfiqbakhshi@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("318Street$");
		
	}
	public void login() {
		driver.findElement(By.id("loginbutton")).click();
	}
	
}
