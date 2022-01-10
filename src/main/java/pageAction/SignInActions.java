package pageAction;

import org.openqa.selenium.WebDriver;

import pageElement.SignInPageElements;

public class SignInActions extends SignInPageElements {

	public SignInActions(WebDriver driver) {
		super(driver);
		
	}
	public CreateAccountActions selectMySelfOpstionToCreateAccount() throws InterruptedException {
		createAccount_button.click();
		//click(createAccount_button);
		mySelf_button.click();
		//click(mySelf_button);
		Thread.sleep(3000);
		return new CreateAccountActions(driver);
		
	}

}
