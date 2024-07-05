package locatorsDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchObjectIdentification {

	public static void main(String[] args) 
	{
		// Create a session
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		
		
		//Identify+Action
		driver.findElement(By.id("APjFqb")).sendKeys("testNG");
		
		
		List<WebElement> list1=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
		System.out.println("Total options are: "+list1.size());
		
		for(WebElement i:list1)
		{
			System.out.println(i.getText());
			if(i.getText().contains("testng"))
			{
				i.click();
				break;
			}
		}
		
		
		
		
		
		
		
		/*
		//Technique 2:Identify+validate+Action
		
		WebElement ele=driver.findElement(By.id("APjFqb"));
		
		//validation on WebElement
		
		System.out.println("Is searchbox is displayed?: "+ele.isDisplayed());
		
		System.out.println("Is Searchbox is enabled?: "+ele.isEnabled());
		
		
		//Action
		ele.sendKeys("Selenium",Keys.ENTER);
		
		
		/*
		//By locator technique
		/*
		 * By is class in selenium
		 * By class help you to get/provide the locator
		 * By.locator always return By class object only
		 
		
		By serchEle=By.id("APjFqb");
		
		//To identify same address-WebElement is interface
		WebElement searchBox=driver.findElement(serchEle);
		
		//Action on WebElement
		searchBox.sendKeys("Java",Keys.ENTER);
		
		*/
		
		

	}

}