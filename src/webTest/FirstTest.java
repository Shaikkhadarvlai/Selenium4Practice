package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

	public static void main(String[] args)
	{

		//Create Driver session
		System.out.println("Launching the chrome browser");
		WebDriver driver1=new ChromeDriver();
		
		System.out.println("Launching the Firefox Broser");
		WebDriver driver2=new FirefoxDriver();
			
		System.out.println("Launching the Edge Browser");
		WebDriver driver3=new EdgeDriver();
		

	}

}