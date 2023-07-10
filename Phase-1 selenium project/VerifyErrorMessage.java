package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class VerifyErrorMessage {

	public static void main(String[] args) {
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		//navigate to application
		driver.get("http://facebook.com");
		//enter email id
		driver.findElement(By.id("email")).sendKeys("batman554466@gmail.com");
		//enter the password
		driver.findElement(By.id("pass")).sendKeys("password123");
		//click login button
		driver.findElement(By.name("login")).click();
		//verify user sees the error message
		String expectedErrMsg = "The email address you entered isn't connected to an account. Find your account and log in.";
		//String actualErrMsg = driver.findElement(By.cssSelector("#email_container > div._9ay7")).getText();
		String actualErrMsg = driver.findElement(By.xpath("(//div[contains(@class,'ay')])[3]")).getText();
		if(expectedErrMsg.equals(actualErrMsg)) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("fail");
		}
		//close the browser
		driver.quit();

	}

}
