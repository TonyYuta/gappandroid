/**
 *   File Name: CameraRollPage.java<br>
 *
 *   Yutaka<br>
 *   Created: Jul 3, 2017
 *   
 */

package com.google;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

/**
 * CameraRollPage //ADDD (description of class)
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
public class CameraRollPage extends Common {
	
	CameraRollPage(AppiumDriver driver) {
		super(driver);
	}
	
    String cameraRollImage01XPLoc  = "//android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]";
    String cameraRollImageNameIdLoc  = "com.rhmsoft.fm:id/name";
    
    public int quantityCameraRollImages() {
//    	System.out.println("\n=========\n================ quantityCameraRollImages() ==== starts ==== 40 ========\n=========\n");
    	List<WebElement> quantityCameraRollImages = driver.findElements(By.id(cameraRollImageNameIdLoc));
//    	System.out.println("\n========================= quantityCameraRollImages.size(): " + quantityCameraRollImages.size() + " =========================\n");
//    	System.out.println("\n========================= quantityCameraRollImages() ====  ends  ==== 43 =================\n");
    	return quantityCameraRollImages.size();
    }

}
