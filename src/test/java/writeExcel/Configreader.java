package writeExcel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configreader {
	public static String URL;
	public static String User;
	public static String Pass;

	public  void propertiesread() {
	Properties prop = new Properties();
	try {
		FileInputStream ip = new FileInputStream("E:\\Eclipse_Work_Space\\amazontest\\src\\test\\resources\\config.properties");
		prop.load(ip);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Configreader.URL = prop.getProperty("Url");
	Configreader.User =prop.getProperty("User");
	Configreader.Pass =prop.getProperty("Pass");
	
	
	

}
}