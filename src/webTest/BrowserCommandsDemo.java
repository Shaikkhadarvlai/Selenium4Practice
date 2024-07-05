package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommandsDemo {

	public static void main(String[] args) 
	{
		//Create a driver session
		WebDriver driver=new ChromeDriver();
		
		//open application-get(url)
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//To capture title- getTitle()
		String title=driver.getTitle();
		System.out.println("Title is: "+title);
		
		//To get current url of application - getCurrentUrl()
		
		String curl=driver.getCurrentUrl();
		System.out.println("Current url is: "+curl);
		
		
		//To get page source -getPageSource()
		String source=driver.getPageSource();
	
		System.out.println(source);
		
		
		//to close the browser close/quit
		
		driver.quit();
		
		
		
		
		
		
		


	}

}