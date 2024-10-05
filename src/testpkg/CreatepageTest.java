package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Createpage;

public class CreatepageTest extends Baseclass{
	
	
	
	@Test
	public void createpagetest()
	{
		Createpage cpage=new Createpage(driver);
		cpage.createPageClick();
		cpage.textVerification();
	}
	

}
