/**
 *   File Name: ScreenshotsPage.java<br>
 *
 *   Yutaka<br>
 *   Created: Jul 4, 2017
 *   
 */

package com.google;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

/**
 * ScreenshotsPage //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class ScreenshotsPage extends Common {
	
	String screenshotsImageNameIdLoc = "com.rhmsoft.fm:id/name";
	
	public ScreenshotsPage(AppiumDriver driver) {
		super(driver);
	}

	public int  quantityScreenshots() {
		List<WebElement> quantityScreenshots = driver.findElements(By.id(screenshotsImageNameIdLoc)); 
		return quantityScreenshots.size();
	}
	
	
	
}
