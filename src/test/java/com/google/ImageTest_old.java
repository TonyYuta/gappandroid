package com.google;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//  import com.cheetahmobile.filemanager.pages.MainPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class ImageTest_old {

    AppiumDriver driver;
    HomePage homePage;

    public String getCapabilInfo() {
        return capabilInfo;
    }

    public void setCapabilInfo(String newCapabilInfo) {
        capabilInfo = newCapabilInfo;
    }

    // Capabilities
    private String capabilInfo;

    @BeforeMethod
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.setCapability("deviceName", "0d89015443e4b8fb");

        //Non-mandatory
        //capabilities.setCapability("clearSystemFiles", "true");
        //capabilities.setCapability("automationName", "Appium");
        //capabilities.setCapability("platformVersion", "5.1");
        //capabilities.setCapability("platformName", "Android");
        //capabilities.setCapability("activityName", "com.rhmsoft.fm.FileManager");

        //MANDATORY
        capabilities.setCapability("deviceName", "AndroidTestDeviceNexus5");
        capabilities.setCapability("app", "/Users/aolyva/Documents/MobileTesting/Apps/fm_v2.5.9-20590595_Android-4.0.apk");
        //capabilities.setCapability("app", "/Users/aolyva/Documents/MobileTesting/Apps/20580589.apk");

        /*
         * These two flags let you use already opened application
         * (opened on the phone) without reinstalling or reopening it.
         */
        capabilities.setCapability("fullReset", "false");

        capabilities.setCapability("noReset", "true");
        System.out.println("========== capabilities ========= : " + capabilities);


        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        homePage = new HomePage(driver);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }



    /*--------------------Test Cases--------------------T*/

    @Test(enabled = true, groups={"Images", "DryRun", "Regression"})
    public void quantityImages() throws NullPointerException, Exception {
        homePage.openImagePage();
    }

    @Test(enabled = true, groups={"Images", "DryRun", "Regression"})
    public void quantityImages2() {
    }




}