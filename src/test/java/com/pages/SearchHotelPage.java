package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
/**
 * 
 * @author Dell
 * @CreationDate 26/06/2022
 *	@Description to Search Hotel Page
 *
 */
public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement searchLocation;

	@FindBy(id = "hotels")
	private WebElement searchHotel;

	@FindBy(id = "room_type")
	private WebElement searchRoomType;

	@FindBy(id = "datepick_in")
	private WebElement searchCheckInDate;

	@FindBy(id = "datepick_out")
	private WebElement searchCheckOutDate;

	@FindBy(id = "adult_room")
	private WebElement searchAdultRoom;

	@FindBy(id = "child_room")
	private WebElement searchChildRoom;

	@FindBy(id = "Submit")
	private WebElement searchSubmit;

	@FindBy(xpath = "//td[@class='login_title']")
	private WebElement verifyText;

	@FindBy(xpath="//span[contains(text(),'Check-In Date shall be before than Check-Out Date')]")
	private WebElement checkIndateErrorMsg;

	@FindBy(xpath="//span[contains(text(),'Check-Out Date shall be after than Check-In Date')]")
	private WebElement checkOutdateErrorMsg;
	
	@FindBy(id="username_show")
	private WebElement helloRam;
	
	@FindBy(id="location_span")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHelloRam() {
		return helloRam;
	}

	/**
	 * 
	 * @return WebElement
	 * @CreationDate 26/06/2022
	 *	@Description getCheckIndateErrorMsg
	 */
	public WebElement getCheckIndateErrorMsg() {
		return checkIndateErrorMsg;
	}

	/**
	 * 
	 * @return WebElement
	 * @CreationDate 26/06/2022
	 *	@Description getCheckOutdateErrorMsg
	 */
	public WebElement getCheckOutdateErrorMsg() {
		return checkOutdateErrorMsg;
	}

	/**
	 * 
	 * @return WebElement
	 * @CreationDate 26/06/2022
	 *	@Description getSearchLocation
	 */
	public WebElement getSearchLocation() {
		return searchLocation;
	}

	/**
	 * 
	 * @return WebElement
	 * @CreationDate 26/06/2022
	 *	@Description getSearchHotel
	 */
	public WebElement getSearchHotel() {
		return searchHotel;
	}

	/**
	 * 
	 * @return WebElement
	 * @CreationDate 26/06/2022
	 *	@Description getSearchRoomType
	 */
	public WebElement getSearchRoomType() {
		return searchRoomType;
	}

	/**
	 * 
	 * @return WebElement
	 * @CreationDate 26/06/2022
	 *	@Description getSearchCheckInDate
	 */
	public WebElement getSearchCheckInDate() {
		return searchCheckInDate;
	}

	/**
	 * 
	 * @return WebElement
	 * @CreationDate 26/06/2022
	 *	@Description getSearchCheckOutDate
	 */
	public WebElement getSearchCheckOutDate() {
		return searchCheckOutDate;
	}

	/**
	 * 
	 * @return WebElement
	 * @CreationDate 26/06/2022
	 *	@Description getSearchAdultRoom
	 */
	public WebElement getSearchAdultRoom() {
		return searchAdultRoom;
	}

	/**
	 * 
	 * @return WebElement
	 * @CreationDate 26/06/2022
	 *	@Description getSearchChildRoom
	 */
	public WebElement getSearchChildRoom() {
		return searchChildRoom;
	}

	/**
	 * 
	 * @return WebElement
	 * @CreationDate 26/06/2022
	 *	@Description getSearchSubmit
	 */
	public WebElement getSearchSubmit() {
		return searchSubmit;
	}

	/**
	 * 
	 * @return WebElement
	 * @CreationDate 26/06/2022
	 *	@Description getVerifyText
	 */
	public WebElement getVerifyText() {
		return verifyText;
	}

	public void searchHotel(String location, String hotelName, String roomType, String numOfRooms, String checkIndate,
			String checkOutDate, String adultPerRoom, String childPerRoom) {
		sendText(getSearchLocation(), location);
		sendText(getSearchHotel(), hotelName);
		sendText(getSearchRoomType(), roomType);
		clearText(getSearchCheckInDate());
		sendText(getSearchCheckInDate(), checkIndate);
		clearText(getSearchCheckOutDate());
		sendText(getSearchCheckOutDate(), checkOutDate);
		sendText(getSearchAdultRoom(), adultPerRoom);
		sendText(getSearchChildRoom(), childPerRoom);
		clickButton(getSearchSubmit());

	}

	public void searchHotel(String location, String numOfRooms, String checkIndate, String checkOutDate,
			String adultPerRoom) {
		sendText(getSearchLocation(), location);

		clearText(getSearchCheckInDate());
		sendText(getSearchCheckInDate(), checkIndate);
		clearText(getSearchCheckOutDate());
		sendText(getSearchCheckOutDate(), checkOutDate);
		sendText(getSearchAdultRoom(), adultPerRoom);
		clickButton(getSearchSubmit());
	}

	public void searchHotel() {
		clickButton(getSearchSubmit());
	}
	/**
	 * 
	 * @return String
	 * @CreationDate 26/06/2022
	 *	@Description checkInDateError
	 */
	public String checkInDateError() {
		String checkInerrormsg = getText1(checkIndateErrorMsg);
		return checkInerrormsg;
	}
	
	/**
	 * 
	 * @return String
	 * @CreationDate 26/06/2022
	 *	@Description checkOutDateError
	 */
	public String checkOutDateError() {
		String checkOuterrormsg = getText1(checkOutdateErrorMsg);
		return checkOuterrormsg;
	}
	/**
	 * 
	 * @return String
	 * @CreationDate 26/06/2022
	 *	@Description checkOutDateError
	 */
	
	public String helloRamMsg() {
		   String helloRam = getAttribute(getHelloRam(), "value");
		   return helloRam; 

	}
	/**
	 * 
	 * @return String
	 * @CreationDate 26/06/2022
	 *	@Description checkOutDateError
	 */
	public String location() {
		String errorLocation = getText1(getLocation());
		return errorLocation;
	}
}



