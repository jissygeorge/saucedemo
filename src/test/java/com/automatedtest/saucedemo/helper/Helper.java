package com.automatedtest.saucedemo.helper;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Helper extends EventFiringWebDriver {
	
	private static Properties CONFIG=null;
	private static String SAUCEDEMO_URL;
	private static WebDriver REAL_DRIVER;
	private static String CHROME_DRIVER_PATH;
	private static String USERNAME;
	private static String PASSWORD;
	
	static {
		CONFIG = new Properties();
		File file=new File("src//test//java//com//automatedtest//saucedemo//config//Config.properties");
		
		try {
		FileInputStream input = new FileInputStream(file.getAbsolutePath());
		CONFIG.load(input);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		SAUCEDEMO_URL=CONFIG.getProperty("SAUCEDEMO_URL");
		USERNAME=CONFIG.getProperty("USERNAME");
		PASSWORD=CONFIG.getProperty("PASSWORD");
		
	
	    file=new File("src//test//java//com//automatedtest//saucedemo//browserDriver//chromedriver");
	    CHROME_DRIVER_PATH=file.getAbsolutePath();
	   
	}  
	
	public Helper(WebDriver driver) {
		super(REAL_DRIVER);
	   }
	
	public static void openBrowser() { 
		
		System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
	    REAL_DRIVER=new ChromeDriver();

		REAL_DRIVER.manage().window().maximize();
		REAL_DRIVER.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		REAL_DRIVER.get(SAUCEDEMO_URL);
	}
		
	public static WebDriver getWebDriver(){
		return REAL_DRIVER;
	}
	
	public static String getURL(){
		return CONFIG.getProperty("SAUCEDEMO_URL");
	} 
	
	public static String getuserName(){
		return CONFIG.getProperty("USERNAME");
	}
	
	public static String getPassword(){
		return CONFIG.getProperty("PASSWORD");
	}
	
	protected WebElement element(By by){
		return getWebDriver().findElement(by);
	}
	
	protected Select dropdown(By by){
		return new Select(element(by));
	}	
}	
