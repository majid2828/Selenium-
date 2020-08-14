package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLogin_PageClass {
	
	//Elements Decelerations
	
	
	@FindBy (xpath="//input[@type='email']")
	public WebElement Username;
	
	@FindBy (xpath="(//*[@type='password'])[1]")
	public WebElement password;
	
	@FindBy (xpath="//*[@value='Log In']")
	public WebElement LoginButton;
	
    public FaceBookLogin_PageClass(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	// Operational Method 
	
	public void LoginToFacebbok() throws InterruptedException {
		Thread.sleep(2000);
		Username.sendKeys("6466518570");
		Thread.sleep(2000);
		password.sendKeys("Majid3829");
		Thread.sleep(2000);
		LoginButton.click();
		Thread.sleep(10000);
	}

	
}
