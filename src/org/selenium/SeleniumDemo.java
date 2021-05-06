package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\SeleniumFirstDay\\WebDriver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	// to launch the url
	
	driver.get("https://www.facebook.com/");
	
	//to get title
	
	 String title = driver.getTitle();

System.out.println(title);
	
	//to get the current url
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	// to close the browser
	
	driver.quit();
	System.out.println("webpage closed");
	
	System.out.println("remote pushing");
	
}
}
