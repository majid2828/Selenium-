package page_classes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile_Page {
	
	@FindBy(xpath="//*[@aria-label='Account']")
	public WebElement btn_FacebookAccount;
	
	@FindBy(xpath="//*[text()='See your profile']")
	public WebElement Link_ProfileName;
	
	@FindBy (xpath="//*[text()='About']")
	public WebElement Btn_About;
	
	@FindBy (xpath="(//*[text()='About']/following::*[5])[1]")
	public WebElement Btn_Friends;
	
	
	public void windowPopupAlert() throws Exception {
		// Window pop up automation.
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void NavigatesTOMyprofilePage() throws InterruptedException {
		
		Thread.sleep(2000);
		btn_FacebookAccount.click();
		Thread.sleep(2000);
		Link_ProfileName.click();
		Thread.sleep(2000);
		Btn_About.click();
		Thread.sleep(2000);
		Btn_Friends.click();
	}
	
	public Profile_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
