package page_classes;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Send_text {
	
	public WebDriver driver;
	
	@FindBy(xpath="//*[text()='All Friends']/following::span[8]")
	public WebElement Btn_Frineds;
	
	@FindBy(xpath="//*[text()='Message']")
	public WebElement Btn_message;
	
	public Send_text(WebDriver driver){
		
	PageFactory.initElements(driver, this);
		
	}
	
	public void navigate_to_my_frined_name() throws Exception {
		
		Thread.sleep(2000);
		Btn_Frineds.click();
		Thread.sleep(2000);
		Btn_message.click();
		Thread.sleep(3000);
	}
	
	public void sendtext_message() throws Exception {
		
		Thread.sleep(4000);
		driver.switchTo().activeElement().sendKeys("hi how are you",Keys.ENTER);
		
	}
	
	public void close() throws Exception {
		
		Thread.sleep(10000);
		driver.close();
		
	}


}
