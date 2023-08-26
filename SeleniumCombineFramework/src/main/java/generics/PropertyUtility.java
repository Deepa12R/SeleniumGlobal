package generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility implements IAutoConstants {
	/**
	 * this method is used to read the data from property file
	 * 
	 * @param key
	 * @return
	 */
	public String readingDataFromPropertyFile(String key) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(PROPERTYFILEPATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties ppt = new Properties();
		try {
			ppt.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ppt.getProperty(key);
	}
}
