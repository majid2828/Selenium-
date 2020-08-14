package sample_programsg2;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException, Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\abdul.lodi\\\\OneDrive - Regeneron Pharmaceuticals, Inc\\\\Desktop\\\\Mypersonal_Folder\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("6466518570");
Thread.sleep(200);
driver.findElement(By.xpath("(//*[@type='password'])[1]")).sendKeys("Majid3829");
Thread.sleep(200);
driver.findElement(By.xpath("//*[@value='Log In']")).click();
Thread.sleep(10000);
// Window pop up automation.
Robot r=new Robot();
r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);
r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(5000);						
driver.findElement(By.xpath("//*[@aria-label='Account']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='See your profile']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//*[text()='About']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='About']/following::*[5])[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='All Friends']/following::span[8]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Message']")).click();
Thread.sleep(5000);
driver.switchTo().activeElement().sendKeys("Hi",Keys.ENTER);
Thread.sleep(2000);
driver.close();
		

	}
}
