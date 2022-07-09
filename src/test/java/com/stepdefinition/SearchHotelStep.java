package com.stepdefinition;

import org.junit.Assert;

import com.base.BaseClass;
import com.pageobjectmanager.PageObjectManager;

import cucumber.api.java.en.Then;

/**
 * 
 * @author Dell
 * @CreationDate 28/06/2022
 * @Description SearchHotelStep
 *
 */
public class SearchHotelStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * 
	 * @param string
	 * @param string2
	 * @param string3
	 * @param string4
	 * @param string5
	 * @param string6
	 * @param string7
	 * @param string8
	 * @CreationDate 28/06/2022
	 * @Description userShouldFillSubmitAllFeildsInSearchHotelPageAnd
	 */
	@Then("User Should Fill & Submit All Feilds In Search Hotel Page {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldFillSubmitAllFeildsInSearchHotelPageAnd(String string, String string2, String string3,
			String string4, String string5, String string6, String string7, String string8) {
		pom.getSearchHotelPage().searchHotel(string, string2, string3, string4, string5, string6, string7, string8);
	}

	/**
	 * 
	 * @param string
	 * @CreationDate 28/06/2022
	 * @Description userShouldVerifyMessageAfterSearch
	 */
	@Then("User Should Verify Message After Search {string}")
	public void userShouldVerifyMessageAfterSearch(String string) {

	}

	/**
	 * 
	 * @param string
	 * @param string2
	 * @param string3
	 * @param string4
	 * @param string5
	 * @CreationDate 28/06/2022
	 * @Description userShouldFillSubmitOnlyMandatoryFeildsInSearchHotelPageAnd
	 */
	@Then("User Should Fill & Submit Only Mandatory Feilds In Search Hotel Page {string},{string},{string},{string} and {string}")
	public void userShouldFillSubmitOnlyMandatoryFeildsInSearchHotelPageAnd(String string, String string2,
			String string3, String string4, String string5) {
		pom.getSearchHotelPage().searchHotel(string, string2, string3, string4, string5);
	}

	/**
	 * 
	 * @param string
	 * @param string2
	 * @CreationDate 28/06/2022
	 * @Description userShouldVerifyInvalidDateErrorMessageAfterSearch
	 */
	@Then("User Should Verify Invalid Date Error Message After Search {string},{string}")
	public void userShouldVerifyInvalidDateErrorMessageAfterSearch(String string, String string2) {

		Assert.assertTrue(pom.getSearchHotelPage().checkInDateError().contains(string));
		Assert.assertTrue(pom.getSearchHotelPage().checkOutDateError().contains(string2));
	}

	@Then("User Should Submit Search Hotel Page Without Filling Any Details")
	public void userShouldSubmitSearchHotelPageWithoutFillingAnyDetails() {
		pom.getSearchHotelPage().searchHotel();

	}

	/**
	 * 
	 * @param string
	 * @CreationDate 28/06/2022
	 * @Description userShouldVerifyErrorMessageAfterSearch
	 */
	@Then("User Should Verify Error Message After Search {string}")
	public void userShouldVerifyErrorMessageAfterSearch(String string) {
	//	Assert.assertTrue("verify error message",getText1(pom.getSearchHotelPage().getVerifyText()).contains(string));
		Assert.assertTrue(pom.getSearchHotelPage().location().contains(string));
	}
}
