package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo4_CssSelector {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/login.html");

		//tagname with id
		driver.findElement(By.cssSelector("input#email-id")).sendKeys("test@gmail.com");
		
		//tagname with attribute
		
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("test123");
		
		
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		
		//tagname with classname
		//driver.findElement(By.cssSelector("button.btn-primary")).click();
		
		//tagname with class name , attribute
		driver.findElement(By.cssSelector("button.btn-primary[type='submit']")).click();
		
		
		
	}

}