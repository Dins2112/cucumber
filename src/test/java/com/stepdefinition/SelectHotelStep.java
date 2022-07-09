package com.stepdefinition;

import org.junit.Assert;

import com.base.BaseClass;
import com.pageobjectmanager.PageObjectManager;

import cucumber.api.java.en.Then;
/**
 * 
 * @author Dell
 *@CreationDate 28/06/2022
 *@Description SelectHotelStep
 */
public class SelectHotelStep extends BaseClass {
	
	PageObjectManager pom = new PageObjectManager();

	@Then("User Should Select Hotel")
	public void userShouldSelectHotel() {
		pom.getSelectHotelPage().selectHotel();
	   
	}
/**
 * 
 * @param string
  *@CreationDate 28/06/2022
 *@Description userShouldVerifyMessageAfterSelect
 *
 */
	@Then("User Should Verify Message After Select {string}")
	public void userShouldVerifyMessageAfterSelect(String string) {
	    
	}

	@Then("User Should Continue To Book Hotel Page Without Selecting Hotel")
	public void userShouldContinueToBookHotelPageWithoutSelectingHotel() {
		pom.getSelectHotelPage().selectContinue();
	   
	}
/**
 * 
 * @param string
 *@CreationDate 28/06/2022
 *@Description userShouldVerifyErrorMessageAfterNotSelectingHotel
 */
	@Then("User Should Verify Error Message After Not Selecting Hotel {string}")
	public void userShouldVerifyErrorMessageAfterNotSelectingHotel(String string) {
		 Assert.assertTrue(pom.getSelectHotelPage().selectHotelError().contains(string));
	   
	}
}
