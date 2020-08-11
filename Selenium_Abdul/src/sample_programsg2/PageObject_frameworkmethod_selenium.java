package sample_programsg2;

import org.openqa.selenium.chrome.ChromeDriver;

import page_classes.Radio_button_demo;
import page_classes.Seleniumeasy;
import page_classes.Submission_Ajaxform;

public class PageObject_frameworkmethod_selenium {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\abdul.lodi\\\\OneDrive - Regeneron Pharmaceuticals, Inc\\\\Desktop\\\\Mypersonal_Folder\\\\chromedriver_win32\\\\chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
 		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
 		Thread.sleep(4000);
 		Seleniumeasy nice= new Seleniumeasy(driver);
 		nice.form_submission();
 		Submission_Ajaxform obj1= new Submission_Ajaxform(driver);
 		obj1.Ajax_submit_form();
 		Radio_button_demo obj2= new Radio_button_demo(driver);
 		obj2.radio_button_values();
 		
 		
 		

	}
}
