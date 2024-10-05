package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Createpage {
WebDriver driver;
	
	By fbcreatepage=By.xpath("");
	
	public Createpage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void createPageClick()
	{
		driver.findElement(fbcreatepage).click();
	}
	
	public void textVerification()
	{
	String src=	driver.getPageSource();
	if(src.contains("Create a page"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	}

}
