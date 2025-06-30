package GenericUtilityNinza;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyFileUtility {
	
	public String propertyFileUtil(String key) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Nis\\Desktop\\Browser.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty(key).toString();
		return data;
			
	}

}
