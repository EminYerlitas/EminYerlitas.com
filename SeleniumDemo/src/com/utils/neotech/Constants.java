package com.utils.neotech;

public class Constants {
	// --- Step 2 --- 
	//Create a Filepath to reach configs.properties, 
	//Make it public static final, 
	//So we can reach it from different package but it is immutable.
	public static final String CONFIGURATION_FILEPATH = System.getProperty("user.dir") + "\\configs\\configs.properties";

}
