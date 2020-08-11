package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Radio_button_demo {
	
	
	@FindBy(xpath="//*[text()='Input Forms']")
	public WebElement input_forms;
	
	@FindBy(xpath="(//*[text()='Radio Buttons Demo'])[2]")
    public WebElement radio_button;
	
	@FindBy(xpath="(//*[@class='radio-inline'])[1]")
	public WebElement sex;
	
	@FindBy(xpath="(//*[@type='button'])[2]")
	public WebElement get_checked_value;
	
	@FindBy(xpath="(//*[@class='radio-inline'])[3]")
	public WebElement group_radio_button_demo_sex;
	
	@FindBy(xpath="(//*[@class='radio-inline'])[6]")
	public WebElement Age_group;
	
	@FindBy(xpath="(//*[@type='button'])[3]")
	public WebElement get_values;
	
	public Radio_button_demo(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		}
	public void radio_button_values() throws Exception{
		Thread.sleep(2000);
		input_forms.click();
		Thread.sleep(2000);
		radio_button.click();
		Thread.sleep(2000);
		sex.click();
		Thread.sleep(2000);
		get_checked_value.click();
		Thread.sleep(2000);
		group_radio_button_demo_sex.click();
		Thread.sleep(2000);
		Age_group.click();
		Thread.sleep(2000);
		get_values.click();
		
		
		
		
		
		
		
		
		
		
		
	}
}
