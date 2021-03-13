package testpackage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4jDemo {
	
	public static  Logger logger=LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello world");
		
		logger.info("this is permission message");
		
		logger.error("this is error");
		
		logger.fatal("this is warning message");
		
		logger.trace("this is trace message");

 
 

	}

}
