package pageAction;

import org.openqa.selenium.WebDriver;


import pageElement.HomePageElements;

public class HomeActions extends HomePageElements {

	public HomeActions(WebDriver driver) {
		super(driver);
		
	}

	public SignInActions clickOnsignIn() throws InterruptedException {
		//sign_link.click();
	   click( sign_link);
		Thread.sleep(3000);
		return new SignInActions(driver);
		}

 
	}
