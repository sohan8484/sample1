package demo;

import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;


public class ReadDataFromJSON {
	public static void main(String[] args) throws Throwable, Exception {
		
	//read the data from the json file
	FileReader file = new FileReader("./Data/CommonData.json");
	
	//convert the json file into java object
	JSONParser jsonobj = new JSONParser();
	Object jobj=jsonobj.parse(file);
	
	//type cast java ob to hashmap
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
