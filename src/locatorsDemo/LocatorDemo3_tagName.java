package locatorsDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo3_tagName {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		
		//Number of input Boxes
		List<WebElement> textBoxes=driver.findElements(By.tagName("input"));
		System.out.println("Total Text boxes are: "+textBoxes.size());
		
		
		//Number of images
		int count=driver.findElements(By.tagName("img")).size();
		System.out.println("Number of images are: "+count);
		
		
		String exp="https://www.youtube.com/c/OrangeHRMInc";
		//Number of Links 
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total Links are: "+allLinks.size());//5
		
		for(WebElement i:allLinks)
		{
		System.out.println(i.getText());
		System.out.println(i.getAttribute("href"));
//		if(i.getAttribute("href").contains(exp))
//		{
//			System.out.println("Link found.....Test Pass!");
//			i.click();
//			break;
//		}
		
		}
		
		
		
		
		//driver.quit();
		
	}

}