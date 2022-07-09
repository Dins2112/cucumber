package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
/**
 * 
 * @author Dell 
 * @CreationDate 26/06/2022
 *	@Description to Login Page
 *
 */
public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtUserName;

	@FindBy(id = "password")
	private WebElement txtPassword;

	@FindBy(id = "login")
	private WebElement btnLogin;

	@FindBy(xpath="//b[contains(text(),'Invalid Login details or Your Password might have expired. ')]")
	private WebElement loginErrorMsg;


	/**
	 * 
	 * @return WebElement
	 * @CreationDate 26/06/2022
	 *	@Description getLoginErrorMsg
	 */
	public WebElement getLoginErrorMsg() {
		return loginErrorMsg;
	}
	/**
	 * 
	 * @return WebElement
	 * @CreationDate 26/06/2022
	 *	@Description getLoginErrorMsg
	 */
	public WebElement getTextUserName() {
		return txtUserName;
	}
	/**
	 * 
	 * @return WebElement
	 * @CreationDate 26/06/2022
	 *	@Description getTextPassword
	 */
	public WebElement getTextPassword() {
		return txtPassword;
	}
	/**
	 * 
	 * @return WebElement
	 * @CreationDate 26/06/2022
	 *	@Description getbtnLogin
	 */
	public WebElement getbtnLogin() {
		return btnLogin;
	}

	public void login(String userName, String password) {
		sendText(getTextUserName(), userName);
		sendText(getTextPassword(), password);
		clickButton(getbtnLogin());

	}

	public void loginWithEnter(String userName, String password) throws AWTException {
		sendText(getTextUserName(), userName);
		sendText(getTextPassword(), password);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		

	}

	public void login() {
		clickButton(getbtnLogin());
	}

	/**
	 * 
	 * @return String
	 *  @CreationDate 26/06/2022
	 *	@Description loginErrorMsg
	 */
	public String loginErrorMsg() {
		String errorMsg = getText1(getLoginErrorMsg());
		return errorMsg;
	}

}


