package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Submission_Ajaxform {
	
	@FindBy(xpath="//*[text()='Input Forms']")
	public WebElement input_forms;
	
	@FindBy(xpath="(//*[text()='Ajax Form Submit'])[2]")
	public WebElement Ajax_form_submit_link;
	
	@FindBy(xpath="//*[@type='text']")
	public WebElement name;
	
	@FindBy(xpath="//*[@rows='5']")
	public WebElement commnet;
	
	@FindBy(xpath="(//*[@type='button'])[2]")
	public WebElement submit;
	
	public Submission_Ajaxform(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	public void Ajax_submit_form() throws Exception {
		
		Thread.sleep(2000);
		input_forms.click();
		Thread.sleep(2000);
		Ajax_form_submit_link.click();
		Thread.sleep(2000);
		name.sendKeys("majid");
		Thread.sleep(2000);
		commnet.sendKeys("ggggggg");
		Thread.sleep(2000);
		submit.click();
}
}

