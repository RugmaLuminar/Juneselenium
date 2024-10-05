package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		
		 driver=new ChromeDriver();
		 driver.get("https://www.facebook.com");
		
	}
	@Test
	public void fb()
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1224");
		driver.findElement(By.name("login")).click();
		
		driver.navigate().back(); //back navigation
		
	}

}
