package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import browser.Browser;

public class loginpageobject {
//	public static WebDriver driver;
	public static WebElement findlogin() {
		return Browser.driver.findElement(By.xpath("//div[@class='a-section a-spacing-medium']"));
		
	}public static WebElement findpassword() {
		return Browser.driver.findElement(By.xpath("//i[@class='a-icon a-icon-logo']"));
		
	}

}
