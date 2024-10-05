package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Createpage;
import pagepkg.Fbloginpage;

public class Fblogintest extends Baseclass {
	
	
	
	@Test
	public void test()
	{
		Fbloginpage login=new Fbloginpage(driver);
		login.setValues("abc@gmail.com", "agj");
		login.loginclick();
		driver.navigate().back();
		
	}
	
	
	

}
