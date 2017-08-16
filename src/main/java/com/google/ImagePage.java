package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Yutaka on 5/9/17.
 */

import io.appium.java_client.AppiumDriver;

public class ImagePage extends Common {

    /**
	 * @param driver
	 */
	ImagePage(AppiumDriver driver) {
		super(driver);
	}

    WebDriverWait wait;
    
    String screenshotsQtyXPLoc   = "//android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.GridView[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.TextView[2]";
    String cameraRollTitleXPLoc  = "//android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.GridView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]";
    String cameraRollQtyXPLoc    = "//android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.GridView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[2]";
    String cameraRollBtnXPLoc    = "//android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.GridView[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]";
    String screenshotsBtnXPLoc   = "//android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.GridView[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.ImageView[1]";
    
    public int cameraRollQty() {
    	WebElement cameraRollQtyEl = driver.findElement(By.xpath(cameraRollQtyXPLoc));
    	return Integer.parseInt(cameraRollQtyEl.getText());
    }

    public int screenshotsQty() {
    	WebElement screenshotsQtyEl = driver.findElement(By.xpath(screenshotsQtyXPLoc));
    	return Integer.parseInt(screenshotsQtyEl.getText());
    }
 
    /**
     * open Image Page by tap on Image Btn
     */
    public void openCameraRollPage() throws NullPointerException, Exception {   	
        WebElement cameraRollBtnEl = driver.findElement(By.xpath(cameraRollBtnXPLoc));
        cameraRollBtnEl.click();
    }
    
    public void openScreenshotsPage() throws NullPointerException, Exception {
    	WebElement screenshotsBtnEl = driver.findElement(By.xpath(screenshotsBtnXPLoc));
    	screenshotsBtnEl.click();
    }

    


}