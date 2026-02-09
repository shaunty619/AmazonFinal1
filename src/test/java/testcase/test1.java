package testcase;

import org.testng.annotations.Test;

import browser.Browser;
import pages.Cartpage;
import pages.Filterpage;
import pages.Searchpage;
import pages.loginpage;

public class test1 {
	@Test
	public void init() throws InterruptedException {
		Browser.openBrowser();
		Browser.navigate("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		//Thread.sleep(3000);
		loginpage.link();
		//Thread.sleep(3000);
		Searchpage.searchbar();
		//Thread.sleep(5000);
		Filterpage.filter();
		
		//Thread.sleep(3000);
		Cartpage.cartadd();
		Cartpage.cartprice();
		//Browser.closeBrowser();
	}

}
