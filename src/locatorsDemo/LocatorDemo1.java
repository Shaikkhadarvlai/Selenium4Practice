package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo1 {

	public static void main(String[] args) 
	{
		// Create a driver session
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		
		//NoSuchElementException
		//driver.findElement(By.name("priyanka")).click();
		
		//username
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user1");
		
		//password
		driver.findElement(By.name("password")).sendKeys("secret_sauce1");
		
		//button
		driver.findElement(By.id("login-button")).click();
		
		

	}

}