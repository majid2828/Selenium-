package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Seleniumeasy {
	
	@FindBy(name="first_name")
	public WebElement txtBox_Firstname;
	
	@FindBy(name="last_name")
	public WebElement txtBox_Lastname;
	
	@FindBy(xpath="//*[@name='email']")
	public WebElement txtbox_email;
	
	@FindBy(xpath="//*[@name='phone']")
	public WebElement txtbox_Phone;
	
	@FindBy(xpath="//*[@name='address']")
	public WebElement txtbox_address;
	
	@FindBy(xpath="//*[@name='city']")
	public WebElement txtbox_city;
	
	@FindBy(xpath="//*[@name='state']")
	public WebElement drop_down_state;
	
	@FindBy(xpath="//*[@name='zip']")
	public WebElement txtbox_zip;
	
	@FindBy(xpath="//*[@name='website']")
	public WebElement txtbox_website;
	
	
	@FindBy(xpath="(//*[@type='radio'])[2]")
	public WebElement radiobtn_host;
	
	@FindBy(xpath="(//*[@class='form-control'])[9]")
	public WebElement txtbox_project_description;
	
	@FindBy(xpath="//*[@type='submit']")
	public WebElement Btn_send;
	
	public Seleniumeasy(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void form_submission() throws Exception {
		
		Thread.sleep(2000);
		txtBox_Firstname.sendKeys("abdul");
		Thread.sleep(2000);
		txtBox_Lastname.sendKeys("lodi");
		Thread.sleep(2000);
		txtbox_email.sendKeys("aaaaa@gmail.com");
		Thread.sleep(2000);
		txtbox_Phone.sendKeys("7185211010");
		Thread.sleep(2000);
		txtbox_address.sendKeys("170-22 90th");
		Thread.sleep(2000);
		txtbox_city.sendKeys("jamaica");
		Thread.sleep(2000);
		Select state_Dropdown=new Select(drop_down_state);
		state_Dropdown.selectByVisibleText("California");
		Thread.sleep(2000);
		txtbox_zip.sendKeys("11432");
		Thread.sleep(2000);
		txtbox_website.sendKeys("majid");
		Thread.sleep(2000);
		radiobtn_host.click();
		Thread.sleep(2000);
		txtbox_project_description.sendKeys("hhhhhhhhh");
		Thread.sleep(2000);
		Btn_send.click();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
