package com.abc.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	Properties prop=null;
	public ReadProperty(String propertiesFileName ) throws IOException {
		File file=new File
	(System.getProperty("user.dir")+"/src/main/resources/"+propertiesFileName+".properties");
		FileInputStream inputStream=new FileInputStream(file);
		prop=new Properties();
		prop.load(inputStream);					
		}
	public String getKeyValue(String keyName) {
		return prop.getProperty(keyName);
	}
	
	
	

}

	
		
	

	
		
		
		
	


