package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleValidation {

	public static void main(String[] args) {
		/*
 Test case: Test for google application title
=================================================
step 1: Open Google application in browser
step 2: Access current page title
step 3: Validate with expected title
step 4: Print the result
step 5: close the browser
		 */
		
		//create a session
		WebDriver driver=new ChromeDriver();
		
		//step 1: Open Google application in browser
		driver.get("https://www.google.com");
		
		//step 2: Access current page title-getTitle() returns string type
		String actTitle=driver.getTitle();
		System.out.println("Current title of google page is: "+actTitle);
		
		//step 3: Validate with expected title-Google
		
		if(actTitle.equals("Google"))
		{
			System.out.println("Test Pass!.....Title matched");
			
		}else
		{
			System.out.println("Test Fail!....Title not matched");
		}
		
		/*
		 * step 5: close the browser
		 * close()
		 * quit()
		 */
		
		//driver.close();
		
		driver.quit();
		
		
		
		
		
		
		
		

	}

}