package com.abc.search;

import org.testng.annotations.Test;

import com.abc.base.BaseTest;

import pageAction.CreateAccountActions;
import pageAction.HomeActions;
import pageAction.SignInActions;

public class GooglePage extends BaseTest {	
	HomeActions homePage = null;
	
	@Test
	public void T() throws Exception {
		homePage=new HomeActions(driver);
		SignInActions signInPage = homePage.clickOnsignIn();
		CreateAccountActions createAccount =signInPage.selectMySelfOpstionToCreateAccount();
		createAccount.fillTextInFirstName();
		
	}

}
