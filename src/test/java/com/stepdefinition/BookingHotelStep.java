package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.base.BaseClass;
import com.pageobjectmanager.PageObjectManager;

import cucumber.api.java.en.Then;
/**
 * 
 * @author Dell
 * @CreationDate 26/06/2022
 *	@Description Booking Hotel Step
 */
public class BookingHotelStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();

	/**
	 * 
	 * @param firstName
	 * @param lastname
	 * @param address
	 * @param dataTable
	 * @CreationDate 26/06/2022
	 *	@Description user Should Book Hotel And Save Generated Order ID
	 */
	@Then("User Should Book Hotel {string},{string},{string} and Save Generated Order ID")
	public void userShouldBookHotelAndSaveGeneratedOrderID(String firstName, String lastname, String address, io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> cd = dataTable.asMaps(String.class,String.class);	
		String ccNum =cd.get(2).get("CreditCardNo");
		String ccTYpe=cd.get(2).get("CreditCardType");
		String expMonth =cd.get(2).get("Month");
		String expYear =cd.get(2).get("Year");
		String ccvNo =cd.get(2).get("CCVNo");
		pom.getBookHotelPage().bookHotel(firstName, lastname, address, ccNum, ccTYpe, expMonth, expYear, ccvNo);
	}

	/**
	 * 
	 * @param string
	 * @CreationDate 26/06/2022
	 *	@Description user Should Verify Message After Booking
	 */
	@Then("User Should Verify Message After Booking {string}")
	public void userShouldVerifyMessageAfterBooking(String string) {

	}

	@Then("User Should Book Hotel Without Filling All Mandatory Feilds")
	public void userShouldBookHotelWithoutFillingAllMandatoryFeilds() {

		pom.getBookHotelPage().bookHotel();
	}
/**
 * 
 * @param firstNameError
 * @param lastNameError
 * @param addressError
 * @param ccNumeError
 * @param ccTypeError
 * @param expMonthError
 * @param ccNumError
 * @CreationDate 26/06/2022
 * @Description user Should Verify All Error Message After Booking And
 */
	@Then("User Should Verify All Error Message After Booking {string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldVerifyAllErrorMessageAfterBookingAnd(String firstNameError, String lastNameError, String addressError, String ccNumeError, String ccTypeError, String expMonthError, String ccNumError) {
		//		Assert.assertTrue(pom.getLoginPage().loginErrorMsg().contains(string));
		//	System.out.println(string+"/t"+pom.getBookHotelPage().firstNameError());
		Assert.assertTrue("fn",pom.getBookHotelPage().firstNameError().contains(firstNameError));
		Assert.assertTrue("ln",pom.getBookHotelPage().lastNameError().contains(lastNameError));
		Assert.assertTrue("add",pom.getBookHotelPage().addressError().contains(addressError));
		Assert.assertTrue("ccno",pom.getBookHotelPage().ccNumError().contains(ccNumeError));
		Assert.assertTrue("cctype",pom.getBookHotelPage().cardTypeError().contains(ccTypeError));
		Assert.assertTrue("expmonth",pom.getBookHotelPage().expMonthError().contains(expMonthError));
		Assert.assertTrue("cvv",pom.getBookHotelPage().cCardcvvError().contains(ccNumError));
	}

}
