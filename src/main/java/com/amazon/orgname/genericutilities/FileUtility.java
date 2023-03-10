package com.amazon.orgname.genericutilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class FileUtility {
	/**
	 * This method is to read the data from property file and returns value upon 
	 * key as a parameter
	 * @author Yogesh K U
	 * @param key
	 * @return String
	 * @throws IOException
	 */
public String readDataFromPropertyFile(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/amazon.properties");
	Properties pobj=new Properties();
	pobj.load(fis);
	String value = pobj.getProperty(key);
	return value;
}
}
