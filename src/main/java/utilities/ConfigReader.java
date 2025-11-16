/*prop = new Properties();
→ Creates an empty Properties object to hold key–value pairs.

FileInputStream ip = new FileInputStream("src/test/resources/config.properties");
→ Opens the file located at the given path.
It tells Java: “Read the contents of this file.”

prop.load(ip);
→ Reads the file and loads all the key–value pairs into the prop object.
Example file content:

url=https://www.saucedemo.com/
username=standard_user
password=secret_sauce
Step-by-step:

if (prop == null)
→ Checks if the properties file hasn’t been loaded yet (e.g., first time calling).
If yes, it loads it by calling initializeProperties().

return prop.getProperty(key);
→ Retrieves the value of a specific key from the config.properties file.
Example:*/
package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	static Properties prop;

	public static Properties initialiseProperties() {

		prop = new Properties();// created empty property file

		try {
			FileInputStream fis = new FileInputStream("src/test/resources/config/config.properties");// fileinputstream
																										// open and read
																										// the property
																										// file
			prop.load(fis);// this method read the file and load all the key and value (e.g
							// url="www.https://)
		} catch (IOException e) {

			e.printStackTrace();
		}
		return prop;

	}

	public static String getProperties(String key) {

		if (prop == null) {
			initialiseProperties();
		}
		return prop.getProperty(key);//retrive value of specific key from the property file like username is key value='standard user'
	}

}
