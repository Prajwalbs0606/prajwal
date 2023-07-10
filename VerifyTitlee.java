package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitlee {

		public static void main(String[] args)
		{
		//1) Open the broswer
		ChromeDriver driver = new ChromeDriver();

		//2) navigate to apllication
		//object.method() driver.get("https://www.facebook.com/");

		//3) Verify the visitor on the page sees the title - 'facebook- log in or sing up'
		String expectedTitle ="Facebook – log in or sign up"; String actualTitle = driver.getTitle();

		System.out.println(expectedTitle); System.out.println(actualTitle);

		if(expectedTitle.equals(actualTitle))
		{


		}
		else {

		}

		System.out.println("Test Case Passed"); System.out.println("Test case Failed");

		//4) Close the browser driver.quit();
		}

		}

