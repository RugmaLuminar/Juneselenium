package pagepkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@class='btn btn_primary btn_small btn_inventory ']")
	List<WebElement> addtocart;
	@FindBy(id="pass")
	WebElement fbpass;
	@FindBy(name="login")
	WebElement fbloginbutton;
	
	
	public Fbloginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void setValues(String email,String password)
	{
		fbemail.sendKeys(email);
		fbpass.sendKeys(password);
	}
	
	public void loginclick()
	{
		fbloginbutton.click();
	}
	
	

}
