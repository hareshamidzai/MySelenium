package Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration1 {
	private Configuration1() {}
	private static Properties properties;
	static {
		try {
		properties= new Properties();	
		FileInputStream inputStream = new FileInputStream("./configuration.properties");
		properties.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//to lock so no one changes key
	public static String getProperty(String key) {
		return properties.getProperty(key);
		
	}

}
