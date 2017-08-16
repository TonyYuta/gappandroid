package com.google;

/**
 * Created by aolyva on 5/24/17.
 */

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Environment {

    AppiumDriver driver;
    HomePage homePage;
    Helper helper;

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

        // creating instance of MainPage class
        homePage = new HomePage(driver);

        // creating instance of Helper class
        helper = new Helper(driver);

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
        capabilities.setCapability("app", "/Users/Yutaka/Documents/Mobile_Testing/Apk/com.rhmsoft.fm_v2.5.8-20580589_Android-4.0.apk");

        /*
         * These two flags let you use already opened application
         * (opened on the phone) without reinstalling or reopening it.
         */
        capabilities.setCapability("fullReset", "false");

        capabilities.setCapability("noReset", "true");
        System.out.println("========== capabilities ========= : " + capabilities);

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // implicit wait
        // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }



}