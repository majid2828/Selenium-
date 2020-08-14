package sample_programsg2;


import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import page_classes.FaceBookLogin_PageClass;
import page_classes.Profile_Page;
import page_classes.Send_text;

public class PageObject_FrameWorkMainMethod {

	public static void main(String[] args) throws Exception {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\abdul.lodi\\\\OneDrive - Regeneron Pharmaceuticals, Inc\\\\Desktop\\\\Mypersonal_Folder\\\\chromedriver_win32\\\\chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
 		driver.get("https://www.facebook.com/");
 		Thread.sleep(4000);
		FaceBookLogin_PageClass Login=new FaceBookLogin_PageClass(driver);
		Login.LoginToFacebbok();
		Profile_Page ProfilePage=new Profile_Page(driver);
		ProfilePage.windowPopupAlert();
		ProfilePage.NavigatesTOMyprofilePage();
		Send_text obj1= new Send_text(driver);
		obj1.navigate_to_my_frined_name();
//		driver.switchTo().activeElement().sendKeys("hi how are you");
		obj1.sendtext_message();
		
		//https://www.seleniumeasy.com/test/input-form-demo.html
	}
}
