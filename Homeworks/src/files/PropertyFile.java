package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public static void main(String[] args) throws IOException  {
		/*
		 * Homework 1: Create a PROPERTY file to store following configurations:
		 * browser= url= username= password=
		 */
		//1-locate the file
        String file="/Users/eminy/eclipse-workspace/Homeworks/src/files/Property1";
        //2-Read the file
        FileInputStream fis=new FileInputStream(file);
       //3-Create an object
        Properties prop=new Properties();
        //4-Load the file
        prop.load(fis);
        //5-Update properties
        prop.setProperty("browser","yandex");
        prop.setProperty("url","https://www.yandex.com");
        prop.setProperty("username","emin");
        prop.setProperty("password","10111213");
        //6-Write them to file
        FileOutputStream fos=new FileOutputStream(file);
        //7-Store them to execute
        prop.store(fos,"Updated");

        
	}

}
