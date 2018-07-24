/**
 * 
 */
package com.savaari.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author Raghav
 *
 */
public class ReadProperty {
	
	
	public static String getPropData(String attribute) throws Exception{

	File src = new File("C:\\Users\\Raghav\\workspace\\Savaari Car Rental Automation\\ConfigurationPropertyFile\\config.property");
	FileInputStream inputstream= new FileInputStream(src);
	Properties pro= new Properties();
	pro.load(inputstream);
	String value= pro.getProperty(attribute);
	inputstream.close();
	return value;
	
	
	
	}	
	
}
