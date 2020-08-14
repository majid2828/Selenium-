package samples_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdul.lodi\\OneDrive - Regeneron Pharmaceuticals, Inc\\Desktop\\Mypersonal_Folder\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("Facebook");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
		Thread.sleep(5000);
		driver.close();

	}
}
