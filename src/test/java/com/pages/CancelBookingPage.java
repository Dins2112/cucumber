package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
/**
 * 
 * @author Dell
 * @CreationDate 26/06/2022
 *	@Description to Cancel Booking Page
 *
 */
public class CancelBookingPage extends BaseClass {

	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement clickItinarary;

	@FindBy(xpath="//input[@type='button'][1]")
	private WebElement clickOrderId;

	@FindBy(id = "order_id_text")
	private WebElement clickSearchBox;

	@FindBy(id = "search_hotel_id")
	private WebElement clickGoButton;

	@FindBy(name = "ids[]")
	private WebElement selectId;

	@FindBy(name = "cancelall")
	private WebElement clickCancel;
	
	@FindBy(id="search_result_error")
	private WebElement cancelMsg;
    
	@FindBy(xpath="//input[contains(@id,'btn_id')]")
	private WebElement cancel;
	

	
	public WebElement getCancel() {
		return cancel;
	}
	public WebElement getCancelMsg() {
		return cancelMsg;
	}
	/**
	 * 
	 * @return WebElement
	 *  @CreationDate 26/06/2022
	 *	@Description getClickItinarary
	 */
	public WebElement getClickItinarary() {
		return clickItinarary;
	}
	/**
	 * 
	 * @return WebElement
	 *  @CreationDate 26/06/2022
	 *	@Description getClickOrderId
	 */
	public WebElement getClickOrderId() {
		return clickOrderId;
	}

	/**
	 * 
	 * @return WebElement
	 *  @CreationDate 26/06/2022
	 *	@Description getClickSearchBox
	 */
	public WebElement getClickSearchBox() {
		return clickSearchBox;
	}

	/**
	 * 
	 * @return WebElement
	 *  @CreationDate 26/06/2022
	 *	@Description getClickGoButton
	 */
	public WebElement getClickGoButton() {
		return clickGoButton;
	}

	/**
	 * 
	 * @return WebElement
	 *  @CreationDate 26/06/2022
	 *	@Description getSelectId
	 */
	public WebElement getSelectId() {
		return selectId;
	}

	/**
	 * 
	 * @return WebElement
	 *  @CreationDate 26/06/2022
	 *	@Description getClickCancel
	 */
	public WebElement getClickCancel() {
		return clickCancel;
	}


	public void cancelOrderId() {
		clickButton(getClickItinarary());
		clickButton(getClickOrderId());
		simpleAlerts();

	}

	/**
	 *  
	 * @param OrderId 
	 *  @CreationDate 26/06/2022
	 *	@Description cancelOrderId
	 */
	public void cancelOrderId(String OrderId) {
		clickButton(getClickItinarary());
		//sendText(clickSearchBox, OrderId);
		//clickButton(getClickGoButton());
		//clickButton(getSelectId());
		implicitWaits(5);
		clickButton(getCancel());
		simpleAlerts();
		//System.out.println("Deleted Successfully" );

	}
	public String cancellOrderMsg() {
		String cancellMsg = getText1(getCancelMsg());
		return cancellMsg;
	}
	public String cancel() {
		String cancel = getText1(getCancel());
		return cancel;
	}
}
