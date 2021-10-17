package demo;

import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

/**
 * This class is to read data from json
 * @author SOHAN
 * @return jsonValue
 * @throws Throwable
 */
public class ReadDataFromJsonFile {
	//	@Test
	//	public void getDataFromJson( ) throws Throwable {
	//	FileReader reader = new FileReader("./Data/CommonData.json");
	//	JSONParser parser = new JSONParser();
	//	Object object = parser.parse(reader);
	//	JSONObject jsonObject = (JSONObject)object;
	//	String url = jsonObject.get("url").toString();
	//	String us = jsonObject.get("username").toString();
	//	System.out.println(us);
	//	System.out.println(url);

	@Test
	public void readDataFromJSON() throws Throwable
	{
		//read the data from the Json file
		FileReader file = new FileReader("./Data/CommonData.json");

		//convert the Json file into java object
		JSONParser jsonobj = new JSONParser();

		Object jobj=jsonobj.parse(file);

		//type cast java object to Hashmap
		@SuppressWarnings("rawtypes")
		HashMap map = (HashMap)jobj;
		
		String un= map.get("username").toString();
		System.out.println(un);
		String pwd = map.get("password").toString();
		System.out.println(pwd);
		String url = map.get("url").toString();
		System.out.println(url);
	}
}

