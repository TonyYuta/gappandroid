package com.google;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Yutaka on 5/24/17.
 */

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class ImageTest {

    AppiumDriver driver;
    
    DesiredCapabilities capabilities;
    
    // creating instance of Helper class
    Helper helper;
    
    // creating instance of Common class
    Common common;
    
    // creating instance of HomePage class
    HomePage homePage;
    
    // creating instance of ExtData class
    ExtData extData;
    
    // creating instance of ImagePage class
    ImagePage imagePage;
    
    // creating instance of CameraRollPage class    
    CameraRollPage cameraRollPage; 
    
    // creating instance of ScreenshotsPage class    
    ScreenshotsPage screenshotsPage; 

    // xpath
    String searchBtnXpath;
    String homeBtnXpath;
    String recentBtnXPath;

    // id
    String recentBtn;
    String homeBtn;
    String imageBtn;
    String audioBtn;
    String videoBtn;
    String docBtn;
    String deviceBtn;
    String largeFilesBtn;
    String unnecessaryFilesBtn;
    String usedApkBtn;
    String installedAppsBtn;
    String allFilesBtn;
    String hotAppsNearby;
/*
    Properties pro;

    Map<String, String> maplocators;
*/
    
    public String getCapabilInfo() {
        return capabilInfo;
    }

    public void setCapabilInfo(String newCapabilInfo) {
        capabilInfo = newCapabilInfo;
    }

    // Capabilities
    public String capabilInfo;

    //@BeforeClass(alwaysRun = true)
    /**
     * @throws IOException
     */
    @BeforeMethod(alwaysRun = true)
      public void setUp() throws IOException {
    	
    	System.out.println("\n============\n===========\n @BeforeMethod === starts ===== line 83 \n===========\n=============\n");       

        //DesiredCapabilities capabilities = new DesiredCapabilities();
    	capabilities = new DesiredCapabilities();
     //   capabilities.setCapability("deviceName", "AndroidTestDeviceNexus5");
        capabilities.setCapability("deviceName", "AndroidTestDevice01");
        capabilities.setCapability("app", "/Users/Yutaka/Documents/Mobile_Testing/Apk/com.rhmsoft.fm_v2.5.8-20580589_Android-4.0.apk");
        capabilities.setCapability("fullReset", "false");
        capabilities.setCapability("noReset", "true");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        // creating instance of Common class
        common = new Common(driver);
        
        // creating instance of HomePage class
        homePage = new HomePage(driver);
        
        // creating instance of Helper class
        imagePage = new ImagePage(driver); 
        
        // creating instance of CameraRollPage class
        cameraRollPage = new CameraRollPage(driver); 
        
        // creating instance of ScreenshotsPage class
        screenshotsPage = new ScreenshotsPage(driver); 
        
        // creating instance of Helper class
        helper = new Helper(driver); 
        
        // creating instance of ExtData class
        extData = new ExtData();
        
        extData.getPropertiesData();
        
     /*   
        // creating instance of ExtData_old class
        ExtData_old extData_old = new ExtData_old();
    	extData_old.printMap(); 	
    	
        // Specify the file location I used . operation here because
        //we have object repository inside project directory only
        File file = new File("src/test/resources/locators.properties");

        // Create  FileInputStream object
        FileInputStream fis;
        fis = new FileInputStream(file);
	
        // Create Properties class object to read properties file
        pro = new Properties();
		pro.load(fis);
        maplocators = new HashMap(pro);
        System.out.println("===============++++++++++++++++++");
        System.out.println(maplocators);
        System.out.println("===============++++++++++++++++++");
*/
        
    	System.out.println("\n===========\n============\n @BeforeMethod ===   end   === line 113 \n============\n============\n");
   }
    
    //@AfterClass(alwaysRun = true)
    /**
     * @throws IOException
     */
    @AfterMethod(alwaysRun = true)
    public void closeApp() throws IOException {
        driver.closeApp();
        driver.quit();
    }
    
    /*--------------------Test Cases--------------------T*/
    
	/**
     * @throws Exception 
     * @throws NullPointerException 
     */
    @Test(enabled = true, groups={"images", "dryrun", "regression", "all"}, priority=0)
    public void quantityCameraRollImages() throws NullPointerException, Exception {
    	int expected = 3;	// Camera Roll: 3
    	homePage.openImagePage();
    	int actual = imagePage.cameraRollQty();
    	Assert.assertEquals(expected, actual, "QTY Camera Roll images doesn't match to 3");
    }
    
	/**
     * @throws Exception 
     * @throws NullPointerException 
     */
    @Test(enabled = true, groups={"images", "dryrun", "regression", "all"}, priority=0)
    public void quantityScreenshots() throws NullPointerException, Exception {
    	int expected = 2;	// Screenshots: 2
    	homePage.openImagePage();
    	int actual = imagePage.screenshotsQty();
    	Assert.assertEquals(expected, actual, "QTY Screenshots doesn't match to 2");
    }
    
	/**
     * @throws Exception 
     * @throws NullPointerException 
     */
    @Test(enabled = true, groups={"images", "dryrun", "regression", "all"}, priority=0)
    public void quantityImages() throws NullPointerException, Exception {
    	int expected = 5;	// Camera Roll: 3  + Screenshots: 2
    	homePage.openImagePage();
    	int actual = imagePage.cameraRollQty() + imagePage.screenshotsQty();
    	Assert.assertEquals(expected, actual);
    }
    
    @Test(enabled = true, groups = {"cameraroll", "images", "dryrun", "regression", "all"}, priority = 1)
    public void qtyCamerarollImages() throws NullPointerException, Exception {
    	int expected = 3;	// Camera Roll: 3
    	homePage.openImagePage();
    	imagePage.openCameraRollPage();
    	Assert.assertEquals(cameraRollPage.quantityCameraRollImages(), expected, "QTY Camera Roll images doesn't match to " + expected);
    }
    
    @Test(enabled = true, groups = {"screenshots", "images", "dryrun", "regression", "all"}, priority = 1)
    public void qtyScreenshots() throws NullPointerException, Exception {
    	int expected = 2;
    	homePage.openImagePage();
    	imagePage.openScreenshotsPage();
    	Assert.assertEquals(screenshotsPage.quantityScreenshots(), expected, "QTY screenshots doesn't match to " + expected);
    }
    
    /**
     * using hardcoded element locator from ImagePageTest
     * @throws NullPointerException
     * @throws Exception
     */
    @Test(enabled = true, groups = {"home", "dryrun", "regression", "all"}, priority = 1)
    public void navigateToHomePageFromImagePage() throws NullPointerException, Exception {
    	homePage.openImagePage();
    	imagePage.navigateToHomePage();
    }
    
    @Test(enabled = true, groups = {"", "home", "dryrun", "regression", "all"}, priority = 1)
    public void printMapFromProperies() throws NullPointerException, Exception {
    	
    }
    
    

}
