package com.pageobjectmanager;

import com.pages.BookingHotelPage;
import com.pages.BookingConfrimationPage;
import com.pages.CancelBookingPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;
/**
 * 
 * @author Dell
 *@CreationDate 26/26/2022
 *@Description object for the step definition files
 */
public class PageObjectManager {
	
	private LoginPage loginPage;
	private SearchHotelPage searchHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookingHotelPage bookHotelPage;
	private BookingConfrimationPage bookingConfrimPage;
	private CancelBookingPage cancelBookingPage;
	
	/**
	 * 
	 * @return LoginPage
	 * @CreationDate 26/26/2022
	 * @Description getLoginPage
	 */
	public LoginPage getLoginPage() {
		return(loginPage==null) ? loginPage = new LoginPage(): loginPage;
		
	}
	/**
	 * 
	 * @return SearchHotelPage
	 * @CreationDate 26/26/2022
	 *  @Description getSearchHotelPage
	 */
	public SearchHotelPage getSearchHotelPage() {
		return(searchHotelPage==null) ? searchHotelPage = new SearchHotelPage(): searchHotelPage;
		
	}
	/**
	 * 
	 * @return SelectHotelPage
	 * @CreationDate 26/26/2022
	 * @Description getSelectHotelPage 
	 */
	public SelectHotelPage getSelectHotelPage() {
		return(selectHotelPage==null) ? selectHotelPage = new SelectHotelPage(): selectHotelPage;
	}
	/**
	 * 
	 * @return BookingHotelPage
	 *  @CreationDate 26/26/2022
	 * @Description getBookHotelPage   
	 * 
	 */
	public BookingHotelPage getBookHotelPage() {
		return(bookHotelPage==null) ? bookHotelPage = new BookingHotelPage(): bookHotelPage;
	}
	/**
	 * 
	 * @return BookingConfrimationPage
	 *  @CreationDate 26/26/2022
	 * @Description getBookingConfrimPage
	 */
	public BookingConfrimationPage getBookingConfrimPage() {
		return(bookingConfrimPage==null) ? bookingConfrimPage = new BookingConfrimationPage(): bookingConfrimPage;
	}
	/**
	 * 
	 * @return CancelBookingPage
	 * @CreationDate 26/26/2022 
	 * @Description getCancelBookingPage 
	 */
	public CancelBookingPage getCancelBookingPage() {
		return(cancelBookingPage==null) ? cancelBookingPage = new CancelBookingPage(): cancelBookingPage;
	}

}
