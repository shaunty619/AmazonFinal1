package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import browser.Browser;
import locators.CartpageObject;

public class Cartpage extends Browser{
	
	public static void cartadd() {
		wait.until(ExpectedConditions.visibilityOf(CartpageObject.cartselect()));
		WebElement clickcart=CartpageObject.cartselect();
		clickcart.click();
		
	}
	public static void cartprice() {
		wait.until(ExpectedConditions.visibilityOf(CartpageObject.price()));
		WebElement clickprice=CartpageObject.price();
		System.out.println(clickprice.getText());
	}

}
