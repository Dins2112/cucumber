package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
/**
 * 
 * @author Dell
 * @CreationDate 26/06/2022
 * @Description to conform the booking
 *
 */
public class BookingConfrimationPage extends BaseClass {
	
	public BookingConfrimationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement getAttributeValue;

	@FindBy(xpath = "//td[text()='Booking Confirmation']")
	private WebElement verifyBookingConfirmation;
/**
 * 
 * @return WebElement
 *  @CreationDate 26/06/2022
 *  @Description getGetAttributeValue
 * 
 */
	public WebElement getGetAttributeValue() {
		return getAttributeValue;
	}
/**
 * 
 * @return WebElement
 * @CreationDate 26/06/2022
 * @Description getVerifyBookingConfirmation 
 * 
 */
	public WebElement getVerifyBookingConfirmation() {
		return verifyBookingConfirmation;
	}
/**
 * 
 * @return String
 * @CreationDate 26/06/2022
 * @Description getOrderId
 * 
 */
	public String getOrderId() {
		
		String orderID = getAttribute(getOrderId());
		return orderID;

	}

	

}
