package sample_programsg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mercurytour {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdul.lodi\\OneDrive - Regeneron Pharmaceuticals, Inc\\Desktop\\Mypersonal_Folder\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		Thread.sleep(400);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(400);
		driver.findElement(By.name("firstName")).sendKeys("Abdul");
		driver.findElement(By.name("lastName")).sendKeys("lodi");
		driver.findElement(By.name("phone")).sendKeys("123456789");
		driver.findElement(By.name("userName")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Blue street");
		driver.findElement(By.name("city")).sendKeys("jamaica");
		driver.findElement(By.name("state")).sendKeys("New york");
		driver.findElement(By.name("postalCode")).sendKeys("111432");
		// Drop down Automation Code (Select Tag) 
		
		WebElement dropdown=driver.findElement(By.name("country"));
		Select s=new Select(dropdown);
//		s.selectByVisibleText("AMERICAN SAMOA");
		s.selectByValue("AMERICAN SAMOA");
		
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Abc@1234");
		driver.findElement(By.name("confirmPassword")).sendKeys("Abc@1234");
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
