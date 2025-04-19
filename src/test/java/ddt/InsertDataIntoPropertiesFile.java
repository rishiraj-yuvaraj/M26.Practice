package ddt;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class InsertDataIntoPropertiesFile {
public static void main(String[] args) throws Throwable {
	
	Properties pro = new Properties();
	pro.setProperty("browser", "edge");
	pro.setProperty("url", "https://localhost:8888");
	pro.setProperty("username", "admin");
	pro.setProperty("password", "admin");
	
	FileOutputStream fos = new FileOutputStream("./src/test/resources/commondata7pm.properties");
	pro.store(fos, "myWish");
}
}
