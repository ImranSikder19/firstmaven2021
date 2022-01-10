package pageAction;

import org.openqa.selenium.WebDriver;

import pageElement.CreateAccountPageElements;

public class CreateAccountActions extends CreateAccountPageElements {

	public CreateAccountActions(WebDriver driver) {
		super(driver);
		
		
	}
  public void  fillTextInFirstName() {
	  //firstName_TextBox.sendKeys("biden");
	  fillText(firstName_TextBox,"biden");
  }

}
