package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		
		 driver=new ChromeDriver();
		 driver.get("https://www.google.com");
		
	}
	
	@Test
	public void test()
	{
		WebElement searchfield=driver.findElement(By.name("q"));
		searchfield.sendKeys("books",Keys.ENTER);
		//searchfield.submit();
		//driver.findElement(By.name("btnK")).click();
		
	}

}
