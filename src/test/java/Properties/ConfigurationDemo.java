/**
 * 
 */
/**
 * @author hhami
 *
 */
package Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationDemo {
	
	public static void main(String[] args) throws IOException {
		String path = "./configuration.properties ";
	// Java can only read the input stream it cannot open file
		FileInputStream input = new FileInputStream(path);
		// Properities is class that can read properties files
		Properties properties = new Properties();
	// load the values in the file to the properties object
		properties.load(input);
	// properties can give the values based on the keys passed
		String val = properties.getProperty("url");
		System.out.println(val);
		
		
	}
	
	
}