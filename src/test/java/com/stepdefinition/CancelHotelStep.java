package com.stepdefinition;

import org.junit.Assert;

import com.base.BaseClass;
import com.pageobjectmanager.PageObjectManager;

import cucumber.api.java.en.Then;
/**
 * 
 * @author Dell
 * @CreationDate 27/06/2022
 *@Description CancelHotelStep
 */
public class CancelHotelStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();
	@Then("User Should Cancel The Order Id")
	public void userShouldCancelTheOrderId() {
	    pom.getCancelBookingPage().cancelOrderId();
	}
/**
 * 
 * @param string
 * @CreationDate 27/06/2022
 * @Description userShouldVerifyMessageAfterCancelling
 * 
 */
	@Then("User Should Verify Message After Cancelling {string}")
	public void userShouldVerifyMessageAfterCancelling(String string) {
//		Assert.assertTrue(pom.getLoginPage().loginErrorMsg().contains(string));
		Assert.assertTrue(pom.getCancelBookingPage().cancellOrderMsg().contains(string));
		//Assert.assertTrue(pom.getCancelBookingPage().cancel().contains(string));
	   	}
/**
 * 
 * @param OrderId
 * @CreationDate 27/06/2022
 * @Description userShouldCancelThePreviouslyBookedOrderId
 */
	@Then("User Should Cancel The Previously Booked Order Id {string}")
	public void userShouldCancelThePreviouslyBookedOrderId(String OrderId) {
	   pom.getCancelBookingPage().cancelOrderId(OrderId);
	}


}
