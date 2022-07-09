package com.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.base.BaseClass;
import com.pageobjectmanager.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/**
 * 
 * @author Dell
 * @CreationDate 27/06/2022
 * @Description LoginPageStep
 * 
 *
 */
public class LoginPageStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();
	/**
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 *@CreationDate 27/06/2022
	 *@Description LoginPageStep
	 */
	@Given("User is on the Adactin Home Page")
	public void userIsOnTheAdactinHomePage() throws FileNotFoundException, IOException {

		maximize();
		implicitWaits(30);

	}
/**
 * 
 * @param UserName
 * @param Password
 *@CreationDate 27/06/2022
 *@Description LoginPageStep
 */
	@When("User Should Perform Login {string},{string}")
	public void userShouldPerformLogin(String UserName, String Password) {
		pom.getLoginPage().login(UserName, Password);

	}
/**
 * 
 * @param UserName
 * @param Password
 * @throws AWTException
 *@CreationDate 27/06/2022
 *@Description LoginPageStep
 */
	@When("User Should Perform Login {string},{string} With Help of ENTER key")
	public void userShouldPerformLoginWithHelpOfENTERKey(String UserName, String Password) throws AWTException {
		pom.getLoginPage().loginWithEnter(UserName, Password);

	}
/**
 * 
 * @param string
 *@CreationDate 27/06/2022
 *@Description LoginPageStep
 */
	@Then("User Should Verify Login Error Message Contains After Login {string}")
	public void userShouldVerifyLoginErrorMessageContainsAfterLogin(String string) {

		//	Assert.assertEquals(string,pom.getLoginPage().loginErrorMsg());
		Assert.assertTrue(pom.getLoginPage().loginErrorMsg().contains(string));

	}

}
