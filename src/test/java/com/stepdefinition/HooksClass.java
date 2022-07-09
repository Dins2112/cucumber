package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
/**
 * 
 * @author Dell
 *  @CreationDate 27/06/2022
 *   @Description  HooksClass
 *
 */
public class HooksClass extends BaseClass{
	/**
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @CreationDate 27/06/2022
	 * @Description beforeScenario
	 */
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {
		getDriver(getPropertyFileValue("browserType"));
		loadUrl(getPropertyFileValue("url"));

	}
	/**
	 * 
	 * @param scenario
	 * @CreationDate 27/06/2022
	 * @Description afterScenario
	 */
	@After
	public void afterScenario(Scenario scenario) {
		TakesScreenshot screenshot= (TakesScreenshot)driver;
		byte[] b = screenshot.getScreenshotAs(OutputType.BYTES);
		scenario.embed(b, "Every Scenerio");
		
		closeAllWindow();
	}

}
