package com.utils.neotech;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
	// --- Step 3 ---
	//Create an instance variable for Properties so we can reach it from outside of our method.
	private static Properties prop;
  /**
   * This method will read the properties file
   * We will use try and catch in case of exceptions
   * @param filePath
   */
	   //Create a method to read the Properties
	public static void readProperties(String filePath) {
		try{
	    //Read the file from filePath
		FileInputStream file=new FileInputStream(filePath);
		//Create Properties object
		prop=new Properties();
		//Load Properties then close
		prop.load(file);
		file.close();
		}
		//to catch FileNotFoundException
		catch(FileNotFoundException fnfe) {
			System.out.println("Filepath is wrong");
		}
		//to catch IOException
		catch(IOException ioe) {
			System.out.println("File is not readable");
		}
	
	}
	/**
	 * This method will return the value for a specified key
	 * @param String key
	 * @return String value
	 */
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

}
