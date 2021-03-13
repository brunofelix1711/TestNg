package testpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertieFileExample {
	
	static WebDriver driver=null;
	public static String browserName=null;
	public static String appUrl=null;
	
	static Properties prop=new Properties();
	static String projectpath=System.getProperty("user.dir");
   

	public static void main(String[] args)  {
		
		getbrowser();
		
		
	}
		
		 public static  void getbrowser() {
	
			
			try {
				InputStream input=new FileInputStream(projectpath +"\\src\\test\\java\\com\\configuration\\config.properties");
			     prop.load(input);
			     String browser=prop.getProperty("browserName");
			     System.out.println(browser);
			     if(browser.equalsIgnoreCase("chrome")) {
			    	 System.setProperty("webdriver.chrome.driver", projectpath+"\\driver\\chromedriver.exe");
			    	 driver=new ChromeDriver();
			     }else if
			     
			     (browser.equalsIgnoreCase("firefox")) {
			    	 System.setProperty("webdriver.gecko.driver", projectpath+ "\\driver\\geckodriver.exe");
			    	 driver=new FirefoxDriver();
			     }
			}
	 catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
		 }
			
			//driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
			String application=prop.getProperty("appUrl");
			driver.get(application);
			
}
		 
}