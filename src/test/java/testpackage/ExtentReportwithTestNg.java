package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportwithTestNg {

	WebDriver driver=null;

	@BeforeSuite 

	public void x() {

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");

		ExtentReports extentReport=new ExtentReports();

		extentReport.attachReporter(htmlReporter);





	}

	@BeforeTest

	public void open_the_broser() {

		WebDriverManager.chromedriver().setup();

		driver=new ChromeDriver();	

	}



	@Test

	public void M() {

		ExtentTest test=extentReport.createTest("MyLoginPage","To check the login page functionality");	

		test.pass("driver instance is created successfully");

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		test.pass("Url is launched successfully");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("felixbruno1993@gmail.com");

		test.pass("username entered successufully");


		driver.findElement(By.xpath(("//input[@id='passwd']"))).sendKeys("password5");

		test.pass("password entered successufully");

		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();

		test.pass("click button is working");

		test.pass("pass", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

		test.addScreenCaptureFromPath("screenshot.png");

		extentReport.flush();


	}
}
