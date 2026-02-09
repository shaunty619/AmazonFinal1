package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import browser.Browser;
import locators.FilterpageObject;

public class Filterpage extends Browser{

	
	public static void filter() throws InterruptedException {
		
		System.out.print("Inside filter");

        Set<String> windowHandles = driver.getWindowHandles();

        String[] handles = windowHandles.toArray(new String[0]);
        driver.switchTo().window(handles[1]);

        System.out.println("Original Tab Title: " + driver.getTitle());

				
		WebElement addCartBtn = FilterpageObject.addCart();
		wait.until(ExpectedConditions.visibilityOf(addCartBtn));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", addCartBtn);
		
		wait.until(ExpectedConditions.elementToBeClickable(addCartBtn));
		addCartBtn.click();
		
	}

}
