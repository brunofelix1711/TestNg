package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilitiesExample {


	//main use of desired capabilities is to set the browser type , browser name , browser version 


	public static void main(String[] args) {
		
		DesiredCapabilities cp=new DesiredCapabilities();
		//cp.setCapability("ignoreProtectedModeSettings", true);
		//cp.setBrowserName("Chrome");
		//cp.setVersion("3.1");
		
		ChromeOptions options = new ChromeOptions();
		options.setCapability("ignoreProtectedModeSettings", true);

		WebDriverManager.chromedriver().setup();

		WebDriver driver =new ChromeDriver();

		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//body/div[1]/div[5]/div[2]/div[2]/a[1]")).click();
		
		


	}

}
