package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		google_search();

	}
	
	public static void google_search() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		
		//driver.findElement(By.xpath("//input[@name='btnK']")).click();
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}

}
