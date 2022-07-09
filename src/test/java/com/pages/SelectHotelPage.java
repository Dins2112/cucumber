package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
/**
 * 
 * @author Dell
 * @CreationDate 26/06/2022
 *	@Description Select Hotel Page
 */
public class SelectHotelPage extends BaseClass {
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement selectHotel;

	@FindBy(id = "continue")
	private WebElement selectContinue;

	@FindBy(xpath = "//td[@class='login_title'])[2]")
	private WebElement verifyBookAHotel;

	@FindBy(xpath="//*[@class='reg_error']")
	private WebElement selectHotelError;

	/**
	 * 
	 * @return WebElement
	 * @CreationDate 26/06/2022
	 *	@Description getSelectHotelError
	 */
	public WebElement getSelectHotelError() {
		return selectHotelError;
	}

	/**
	 * 
	 * @return WebElement
	 * @CreationDate 26/06/2022
	 *	@Description getSelectHotel
	 */
	public WebElement getSelectHotel() {
		return selectHotel;
	}

	/**
	 * 
	 * @return WebElement
	 * @CreationDate 26/06/2022
	 *	@Description getSelectContinue
	 */
	public WebElement getSelectContinue() {
		return selectContinue;
	}
	/**
	 * 
	 * @return WebElement
	 * @CreationDate 26/06/2022
	 *	@Description getVerifyBookAHotel
	 */
	public WebElement getVerifyBookAHotel() {
		return verifyBookAHotel;
	}

	public void selectHotel() {
		clickButton(getSelectHotel());
		clickButton(getSelectContinue());

	}


	public void selectContinue() {
		clickButton(getSelectContinue());

	}
	/**
	 * 
	 * @return String
	 * @CreationDate 26/06/2022
	 *	@Description selectHotelError
	 */
	 
	public String selectHotelError() {
		String HotelError = getText1(getSelectHotelError());
		return HotelError;
	}
}
