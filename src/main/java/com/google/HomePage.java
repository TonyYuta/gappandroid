package com.google;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class HomePage extends Common {

    /**
	 * @param driver
	 */
	HomePage(AppiumDriver driver) {
		super(driver);
	}

	AppiumDriver driver;
    WebDriverWait wait;

    ExtData_old extData;
    
/*
    HomePage(AppiumDriver driver) {
        this.driver = driver;
        // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
*/
  
    
    /*
    public void navigateToImagePage() throws NullPointerException {

       // WebElement imageBtn = driver.findElement(By.id("com.rhmsoft.fm:id/home_classify_text_images"));
        WebElement imageBtnEl = driver.findElement(By.id(imageBtnLoc));
        imageBtnEl.click();

    }
    */




}