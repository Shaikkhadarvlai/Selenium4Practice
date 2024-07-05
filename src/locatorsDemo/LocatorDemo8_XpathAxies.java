package locatorsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo8_XpathAxies {

	public static void main(String[] args)
	{
		//ctrl+shift+o to resolve import issue

		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/customers.html?email-name=test%40gmail.com&password-name=ghjgjhg&submit-name=");
		
		System.out.println("****get the Ancestor from John********");
		WebElement ele1=driver.findElement(By.xpath("//td[text()='John']//ancestor::tbody"));
		System.out.println(ele1.getText());
		
		
		
		
		
		System.out.println("****get the Parent from John********");
		WebElement parent=driver.findElement(By.xpath("//td[text()='John']//parent::tr"));
		System.out.println(parent.getText());
		
		System.out.println("****get the Child from row 4********");
		List<WebElement> child=driver.findElements(By.xpath("(//tbody//tr)[4]//child::td"));
		System.out.println("Total child elements are: "+child.size());
		
		for(WebElement i:child)
		{
			System.out.println(i.getText());
		}
		System.out.println("****get the all previous elements of John********");

		List<WebElement> preData=driver.findElements(By.xpath("//td[text()='John']//preceding::td"));
		System.out.println("Total Match: "+preData.size());
		
		System.out.println("****get the preceding sibling of John********");
		String text1=driver.findElement(By.xpath("//td[text()='John']//preceding-sibling::td")).getText();
		System.out.println("Preceding sibling for John is: "+text1);
		
		
		
		System.out.println("****get the all elements after the John********");

		List<WebElement> follData=driver.findElements(By.xpath("//td[text()='John']//following::td"));//13
		System.out.println("Total Match: "+follData.size());
		
		System.out.println("****get the following sibling of John********");
		
		List<WebElement> list=driver.findElements(By.xpath("//td[text()='John']//following-sibling::td"));
		
		System.out.println("Following siblings are: "+list.size());

		for(WebElement i: list)
		{
			System.out.println(i.getText());
		}
		
		
		
		
		
		
		
		
		

	}

}