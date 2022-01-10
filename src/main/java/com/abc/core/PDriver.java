package com.abc.core;
import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PDriver {
	public WebDriver driver = null;
	public WebDriver createDriver() throws IOException, InterruptedException {
		ReadProperty configProperty = new ReadProperty("config");	
		ReadProperty envProperty = new ReadProperty("env");
		String browserName=configProperty.getKeyValue("browser");  

		System.out.println("Name of Browser: "+browserName);
		if(browserName.equalsIgnoreCase("chrome")) {		
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\imran\\eclipse-workspace\\firstmavenProject\\Drivers\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();	 
		}
		else if(browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"Drivers\\Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();	
			driver.manage().window().maximize();
		}else {
			
		}
		Thread.sleep(5000);
		SetDimention();
		/*
		 * String testEnv = null; 
		 * String env= System.getProperty("env");
		 *  if(env != null){
		 *  testEnv = env 
		 *  }else { 
		 *  
		  testEnv = configProperty.getKeyValue("env"); 
		  tesrUrl = envProperty.getKeyValue(testEnv); 
		  driver.get(tesrUrl); 
		 * }
		 */
		String testEnv = configProperty.getKeyValue("env");
		System.out.println("Value of env: "+testEnv);	
		String testUrl = envProperty.getKeyValue(testEnv);		
		driver.get(testUrl);
		return driver;	
	}
	public void SetDimention() throws IOException {
		ReadProperty configProperty =new ReadProperty("config");
		//String deviceVlue = null;
		//String device = System.getProperty("device");
		//if(device != null) {
			//deviceVlue = device
		//}else {
		//	deviceVlue =configProperty.getKeyValue("device")
		//}
		
		
		String deviceVlue = configProperty.getKeyValue("device");
		System.out.println("Value of Device: "+deviceVlue);	
		ReadProperty deviceProperty =new ReadProperty("device");
		if(!deviceVlue.equalsIgnoreCase("")) {
			String d =deviceProperty.getKeyValue(deviceVlue);
			System.out.println();
			String xy[] = d.split("X");		
			int x = Integer.valueOf(xy[0]);//new Integer(xy[0])
			int y = new Integer(xy[1]);		
			System.out.println(x+"-"+y);		
			driver.manage().window().setSize(new Dimension(x,y));	
		}
	}
	  
	public void click(WebElement element) {
		System.out.println("click");
		element.click();
	}
	public void fillText(WebElement element,String text) {
	  System.out.println("test data :"+text);
	  element.sendKeys(text);  
	}
	public void switchToDefaultContent(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	public void switchToframeByWebElement(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
}
