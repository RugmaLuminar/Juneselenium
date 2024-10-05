package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		
		 driver=new ChromeDriver();
		 driver.get("https://www.google.com");
		
	}
	
	@Test
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		String exptitle="Google";
		if(actualtitle.equals(exptitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	@Test
	public void textVerification()
	{
		String src=driver.getPageSource();
		if(src.contains("images"))
		{
			System.out.println("text present");
		}
		else
		{
			System.out.println("not present");
		}
		
		
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	

}
