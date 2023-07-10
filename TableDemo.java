package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open browser
		ChromeDriver driver = new ChromeDriver();
		//maximize it
		driver.manage().window().maximize();
		//navigate to application
		driver.get("https://letcode.in/table");
		//sum up all the price shown in table and verify it should be equal to 858
		WebElement firstTable = driver.findElement(By.id("shopping"));
		
		List<WebElement> rows = firstTable.findElements(By.tagName("tr"));
		int sum = 0;
		for(int i=1;i<rows.size();i++) {
			WebElement row = rows.get(i);
			List<WebElement> columns = row.findElements(By.tagName("td"));
			
			int price = Integer.parseInt(columns.get(1).getText());
			sum =sum + price;
		}
		
		int expectedSum = 858;
		if(expectedSum == sum) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		

	}

}
