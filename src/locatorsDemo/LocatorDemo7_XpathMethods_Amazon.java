package locatorsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo7_XpathMethods_Amazon {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
			
		//text()-BestSellers link
		driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]")).click();
		System.out.println("BestSellers Title: "+driver.getTitle());
		
		WebElement ele=driver.findElement(By.xpath("(//span[@class='a-carousel-page-count'])[1]"));
		
		System.out.println("Text of Page count is: "+ele.getText());
		
		//From BestSeller --->cart page normalize-space()
		driver.findElement(By.xpath("//span[normalize-space()='Cart']")).click();
		
		String carttext=driver.findElement(By.xpath("(//h2)[1]")).getText();
		System.out.println(carttext);
		
		
		//contains()--->cart --->search --->bags
		
		WebElement search=driver.findElement(By.xpath("//input[contains(@id,'searcht')]"));
		
		search.click();
		search.sendKeys("Bags",Keys.ENTER);
		
		//starts-with()
		driver.findElement(By.xpath("//input[starts-with(@id,'twotabs')]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@id,'twotabs')]")).sendKeys("Mobile",Keys.ENTER);
		
		
		
		
		
		
		
		

	}

}