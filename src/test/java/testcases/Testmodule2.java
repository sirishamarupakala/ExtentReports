package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testmodule2 {
	public static WebDriver d;
	
	@Test(priority=1)
	public void login()
	{
		 d=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		d.manage().window().maximize();
		d.get("https://www.facebook.com");
		
	}

	@Test(priority=2)
	public void enterUserCredentials()
	{
		d.findElement(By.id("email")).sendKeys("test123@gmail.com");
		d.findElement(By.id("pass1")).sendKeys("testpassword");
	}
	
	
}
