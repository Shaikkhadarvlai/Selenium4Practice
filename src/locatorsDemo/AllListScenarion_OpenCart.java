package locatorsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllListScenarion_OpenCart {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		List<WebElement> list1=driver.findElements(By.xpath("//div[@class='list-group']//a"));
		
		System.out.println("Total Elements: "+list1.size());
		
		for(WebElement i:list1)
		{
			System.out.println(i.getText());
		}
		
		
		
		
		
		
		
		

	}

}