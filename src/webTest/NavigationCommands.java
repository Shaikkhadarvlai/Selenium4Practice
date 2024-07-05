package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException 
	{

		//create a session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println("Title : "+driver.getTitle());
		
		//google--->facebook
		
		driver.navigate().to("https://www.facebook.com");
		System.out.println("Title : "+driver.getTitle());
		
		//Static wait in selenium
		Thread.sleep(2000);
		
		
		//back()
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		//forward()
		driver.navigate().forward();
		
		Thread.sleep(2000);
		//refresh()
		driver.navigate().refresh();
		
		
		
		
		
		
		
		
		
		
		

	}

}