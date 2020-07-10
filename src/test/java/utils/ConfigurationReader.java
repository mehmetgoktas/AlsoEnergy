package utils;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader{
	
	private static Properties configFile;
	
	
	static {
		String path = "Config.properties";
		try {
			FileInputStream file = new FileInputStream(path);
			configFile = new Properties();
			configFile.load(file);
			file.close();
			
		}catch(IOException e) {
		 e.printStackTrace();
		}}
	public static  String getProperty(String keyName) {
	return configFile.getProperty(keyName);
	
}}