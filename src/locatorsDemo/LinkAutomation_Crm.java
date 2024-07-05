package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkAutomation_Crm {

	public static void main(String[] args)
	{
		//Create a driver session
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/");
		
		//signIn- link
		//driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.partialLinkText("In")).click();
		
		//login
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("test123");
		//checkbox
		driver.findElement(By.id("remember")).click();
		driver.findElement(By.name("submit-name")).click();
		
		//logout
		
		driver.findElement(By.linkText("Sign Out")).click();
		
		//to get text
		
		WebElement ele=driver.findElement(By.tagName("p"));
		System.out.println("Text is: "+ele.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}