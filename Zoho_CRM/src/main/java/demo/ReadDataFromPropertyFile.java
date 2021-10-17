package demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadDataFromPropertyFile {
	@Test
	public void readDataFromPropertyFile() throws IOException {
		/*read the data from properties file*/
		//step 1: get the 'java representation object' of the physical file*/
		FileInputStream fis = new FileInputStream("./Data/CommonData.properties");//relative path
		//step 2: create an 'object' of the properties class and load all keys and value pair
		Properties p = new Properties();
		p.load(fis);
		//step 3: read the values using get property("key")
		
		String url = p.getProperty("url");
		String browser = p.getProperty("browser");
		String un = p.getProperty("username");
		String pwd = p.getProperty("password");
	
		System.out.println(url);
		System.out.println(browser);
		System.out.println(un);
		System.out.println(pwd);
	}

}
