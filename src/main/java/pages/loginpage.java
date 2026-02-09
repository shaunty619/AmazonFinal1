package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import browser.Browser;
import locators.loginpageobject;

public class loginpage extends Browser {
	
	public static void link() {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@class='nav-line-2 ']"))));
		driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).click();
		wait.until(ExpectedConditions.visibilityOf(loginpageobject.findlogin()));
		driver.findElement(By.xpath("//input[@id='ap_email_login']")).sendKeys("8475987858");
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		wait.until(ExpectedConditions.visibilityOf(loginpageobject.findpassword()));
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Shaunty@123");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		
	}

}
