/**
 *   File Name: ExtData.java<br>
 *
 *   Yutaka<br>
 *   Created: Jul 8, 2017
 *   
 */

package com.google;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

/**
 * ExtData //ADDD (description of class)
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
public class ExtData {
	
    Properties pro;
    HashMap<String, String> maplocators;

	//@BeforeMethod(alwaysRun = true)
	public void getPropertiesData() {
		
        try {

        // Specify the file location I used . operation here because
        //we have object repository inside project directory only
        File file = new File("src/test/resources/locators.properties");

        // Create  FileInputStream object
        FileInputStream fis;
			fis = new FileInputStream(file);
		
	
        // Create Properties class object to read properties file
        pro = new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        maplocators = new HashMap(pro);
        System.out.println("===============++++++++++++++++++");
        System.out.println(maplocators);
        System.out.println("===============++++++++++++++++++");

        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
