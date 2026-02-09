package locators;

import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browser.Browser;

public class SearchpageObject {
	public static WebElement element; 
	public static List<WebElement>  productlist(){
		//Browser.wait.until(ExpectedConditions.visibilityOf(Browser.driver.findElement(By.xpath("//div[@class='left-pane-results-container']"))));
		
		return Browser.driver.findElements(By.xpath("//a[@class='a-link-normal s-line-clamp-2 puis-line-clamp-3-for-col-4-and-8 s-link-style a-text-normal']"));
		
	}
//div[contains(@role, 'gridcell')]
}
