package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
/**
 * 
 * @author Dell
 *  @CreationDate 26/06/2022
 *	@Description to book hotel page
 */
public class BookingHotelPage extends BaseClass {

	public BookingHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement typeFirstName;

	@FindBy(id = "last_name")
	private WebElement typeLastName;

	@FindBy(id = "address")
	private WebElement typeAddress;

	@FindBy(id = "cc_num")
	private WebElement typeCCNum;

	@FindBy(id = "cc_type")
	private WebElement typeCCType;

	@FindBy(id = "cc_exp_month")
	private WebElement typeExpMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement typeExpYear;

	@FindBy(id = "cc_cvv")
	private WebElement typeCCVNo;

	@FindBy(xpath = "(//input[@class='reg_button'])[1]")
	private WebElement selectBookNow;

	@FindBy(id = "book_now")
	private WebElement verifyBookingConfirmation;

	@FindBy(id="first_name_span")		
	private WebElement firstNameError;

	@FindBy(id="last_name_span")
	private WebElement lastNameError;

	@FindBy(id="address_span")
	private WebElement addressError;

	@FindBy(id="cc_num_span")
	private WebElement ccNumError;

	@FindBy(id="cc_type_span")
	private WebElement ccTypeError;

	@FindBy(id="cc_expiry_span")
	private WebElement expMonthError;

	@FindBy(id="cc_cvv_span")
	private WebElement expCvvError;

	/**
	 * 
	 *  @return WebElement
	 *  @CreationDate 26/06/2022
	 *  @Description getFirstNameError
	 */
	public WebElement getFirstNameError() {
		return firstNameError;
	}

	/**
	 * 
	 * @return WebElement
	 * @CreationDate 26/06/2022
	 * @Description getLastNameError
	 * 
	 */
	public WebElement getLastNameError() {
		return lastNameError;
	}

	/**
	 * 
	 * @return WebElement
	 *  @CreationDate 26/06/2022
	 * @Description getAddressError
	 */

	public WebElement getAddressError() {
		return addressError;
	}

	/**
	 *  
	 * @return WebElement
	 *   @CreationDate 26/06/2022
	 * @Description getCcNumError
	 */
	public WebElement getCcNumError() {
		return ccNumError;
	}

	/**
	 * 
	 * @return WebElement
	 * @CreationDate 26/06/2022
	 * @Description getCcTypeError
	 */
	public WebElement getCcTypeError() {
		return ccTypeError;
	}

	/**
	 * 
	 * @return WebElement
	 *  @CreationDate 26/06/2022
	 *   @Description getExpMonthError
	 */
	public WebElement getExpMonthError() {
		return expMonthError;
	}

	/**
	 * 
	 * @return WebElement
	 *	@CreationDate 26/06/2022
	 *	  @Description getExpCvvError
	 */
	public WebElement getExpCvvError() {
		return expCvvError;
	}

	/**
	 * 
	 * @return WebElement
	 *	@CreationDate 26/06/2022
	 *	  @Description getTypeFirstName
	 */
	public WebElement getTypeFirstName() {
		return typeFirstName;
	}
	/**
	 * 
	 * @return WebElement
	 *	@CreationDate 26/06/2022
	 *	  @Description getTypeLastName
	 */
	
	public WebElement getTypeLastName() {
		return typeLastName;
	}
	/**
	 * 
	 * @return WebElement
	 *	@CreationDate 26/06/2022
	 *	  @Description getTypeAddress
	 */
	
	public WebElement getTypeAddress() {
		return typeAddress;
	}
	/**
	 * 
	 * @return WebElement
	 *	@CreationDate 26/06/2022
	 *	  @Description getTypeCCNum
	 */
	
	public WebElement getTypeCCNum() {
		return typeCCNum;
	}
	/**
	 * 
	 * @return WebElement
	 *	@CreationDate 26/06/2022
	 *	  @Description getTypeCCType
	 */
	
	public WebElement getTypeCCType() {
		return typeCCType;
	}
	/**
	 * 
	 * @return WebElement
	 *	@CreationDate 26/06/2022
	 *	  @Description getTypeExpMonth
	 */
	
	public WebElement getTypeExpMonth() {
		return typeExpMonth;
	}
	/**
	 * 
	 * @return WebElement
	 *	@CreationDate 26/06/2022
	 *	  @Description getTypeExpYear
	 */
	
	public WebElement getTypeExpYear() {
		return typeExpYear;
	}
	/**
	 * 
	 * @return WebElement
	 *	@CreationDate 26/06/2022
	 *	  @Description getTypeCCVNo
	 */
	
	public WebElement getTypeCCVNo() {
		return typeCCVNo;
	}
	/**
	 * 
	 * @return WebElement
	 *	@CreationDate 26/06/2022
	 *	  @Description getSelectBookNow
	 */
	
	public WebElement getSelectBookNow() {
		return selectBookNow;
	}
	/**
	 * 
	 * @return WebElement
	 *	@CreationDate 26/06/2022
	 *	  @Description getVerifyBookingConfirmation
	 */
	
	public WebElement getVerifyBookingConfirmation() {
		return verifyBookingConfirmation;
	}

	/**
	 * 
	 * @param firstName  
	 * @param lastName 
	 * @param address
	 * @param ccNum
	 * @param ccTYpe
	 * @param expMonth
	 * @param expYear
	 * @param ccvNo
	 * @CreationDate 26/06/2022
	 *  @Description To book hotel method 
	 */
	public void bookHotel(String firstName, String lastName, String address, String ccNum, String ccTYpe,
			String expMonth, String expYear, String ccvNo) {
		sendText(getTypeFirstName(), firstName);
		sendText(getTypeLastName(), lastName);
		sendText(getTypeAddress(), address);

		sendText(getTypeCCNum(), ccNum);
		sendText(getTypeCCType(), ccTYpe);
		sendText(getTypeExpMonth(), expMonth);
		sendText(getTypeExpYear(), expYear);
		sendText(getTypeCCVNo(), ccvNo);
		clickButton(getSelectBookNow());

	}

	
	public void bookHotel() {
		clickButton(getSelectBookNow());

	}

	/**
	 * 
	 * @return String
	 * @CreationDate 26/06/2022
	 *	  @Description firstNameError
	 */
	public String firstNameError() {

		String firstNameError = getText1(getFirstNameError());
		
		return firstNameError;
	}
	
	/**
	 * 
	 * @return String
	 * @CreationDate 26/06/2022
	 *	  @Description lastNameError
	 */
	public String lastNameError() {
		String lastNameError = getText1(getLastNameError());
		
		
		return lastNameError;
	}
	/**
	 * 
	 * @return String
	 * @CreationDate 26/06/2022
	 *	  @Description addressError
	 */
		
	public String addressError() {
		String addressError = getText1(getAddressError());
		return addressError;
	}
	
	/**
	 * 
	 * @return String
	 * @CreationDate 26/06/2022
	 *	  @Description ccNumError
	 */
	public String ccNumError() {
		String ccNumeError = getText1(getCcNumError());
		return ccNumeError;

	}
	
	/**
	 * 
	 * @return String
	 * @CreationDate 26/06/2022
	 *	  @Description cardTypeError
	 */
	public String cardTypeError() {
		String ccTypeError = getText1(getCcTypeError());
		return ccTypeError;

	}
	
	/**
	 * 
	 * @return String
	 * @CreationDate 26/06/2022
	 *	  @Description expMonthError
	 */
	public String expMonthError() {
		String expMonthError = getText1(getExpMonthError());
		return expMonthError;
	}
	/**
	 * 
	 * @return String
	 * @CreationDate 26/06/2022
	 *	  @Description cCardNumError
	 */
	
	public String cCardcvvError() {
		String ccNumError = getText1(getExpCvvError());
		return ccNumError;
	}

}



