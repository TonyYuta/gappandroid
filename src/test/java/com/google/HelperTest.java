package com.google;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.URL;

/**
 * Created by aolyva on 5/10/17.
 */

public class HelperTest extends Environment {

    //
    @Test(enabled = true, groups={"Helper", "DryRun", "Regression"})
    public void helperTest() {
        int result = helper.qqqGetDeviceSNLength("abc");
        System.out.println("result = " + result);
    }

    @Test(enabled = true, groups = {"Helper", "DryRun", "Regression"})
    public void deviceCapabilitiesTest() {
        String deviceCapabilitiesInfo = "";
        deviceCapabilitiesInfo = helper.deviceCapabilities("abcdf");
        System.out.println("========= deviceCapabilitiesInfo ======= :" + deviceCapabilitiesInfo);
    }







}