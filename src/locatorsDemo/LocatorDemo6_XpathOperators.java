package locatorsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo6_XpathOperators {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Abhiraj");
		
		//and
		driver.findElement(By.xpath("//input[@name='lastname' and @class='form-control']")).sendKeys("Shinde");
		
		//or
		driver.findElement(By.xpath("//input[@type='email' or @class='form-cont']")).sendKeys("abhi22@gmail.com");
		
		
		//index
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("5657898987");
		
		//position()
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=5]")).sendKeys("test123");
		
		//index
		driver.findElement(By.xpath("(//input[@class='form-control'])[6]")).sendKeys("test123");
		
		
		//radio buttons
		//direct solution
		//driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		/*
		 * Get all radio buttons and select radio button which is not selected default 
		 */
		
		
		
		List<WebElement> list=driver.findElements(By.xpath("(//div[@class='col-sm-10'])[8]//input"));
		
		
		for(WebElement i:list)
		{
			if(!i.isSelected())//element  is not selected do click -yes
			{
				i.click();
				break;
			}
		}
		
		//checkbox
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		
		//continue btn
		driver.findElement(By.xpath("//input[@value='Continue']")).submit();
		
		
		
		
		
		
		
		
	}

}