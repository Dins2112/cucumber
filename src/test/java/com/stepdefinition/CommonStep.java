package com.stepdefinition;

import org.junit.Assert;

import com.base.BaseClass;
import com.pageobjectmanager.PageObjectManager;

import cucumber.api.java.en.Then;
/**
 * 
 * @author Dell
 *@CreationDate 27/06/2022
 *@Description CommonStep
 */ 

public class CommonStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();
	/**
	 * 
	 * @param string
	 * @CreationDate 27/06/2022
	 * @Description userShouldVerifyWelcomeMessageAfterLogin
	 */
	@Then("User Should Verify Welcome Message After Login {string}")
	public void userShouldVerifyWelcomeMessageAfterLogin(String string) {
		//Assert.assertTrue(pom.getLoginPage().loginErrorMsg().contains(string));
		//System.out.println(pom.getSearchHotelPage().helloRamMsg());
		Assert.assertTrue(pom.getSearchHotelPage().helloRamMsg().contains(string));
	}

}
