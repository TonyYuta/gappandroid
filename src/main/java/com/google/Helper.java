package com.google;

import io.appium.java_client.AppiumDriver;

/**
 * Created by aolyva on 5/10/17.
 */
public class Helper {

    AppiumDriver driver;

    Helper(AppiumDriver driver) {
        this.driver = driver;
    }

    public int qqqGetDeviceSNLength (String device) {
        int deviceLength = device.toUpperCase().length();
        return deviceLength;
    }

    public String deviceCapabilities(String testDevice) {
        return "============== qqq ================";
    }
    
}