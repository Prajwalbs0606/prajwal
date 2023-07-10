package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) {
		// 1.open the browser
        ChromeDriver driver = new ChromeDriver();
        //navigate the application
        //object.method
        driver.get("https://facebook.com");
        //verify the visitor on page sees the title
        String expectedTitle = "Facebook � log in or sign up";
        String actualTitle = driver.getTitle();
        
        System.out.println(expectedTitle);
        System.out.println(actualTitle);
        
        if(expectedTitle.equals(actualTitle)) {
        	System.out.println("test case passed");
        }
        else {
        	System.out.println("test case failed");
        }
        driver.quit();
	}

}
