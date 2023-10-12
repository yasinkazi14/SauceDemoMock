package com.SauceDemo.TestBase;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class TestBase {
	public static WebDriver driver;
	//public static Logger logger;
	@BeforeTest
	//public void start()
	/*{
		logger = Logger.getLogger("Sauce Demo Framework");
		PropertyConfigurator.configure("Log4J.properties");
		
		logger.info("Framework Execution Started");
	}
	
	@AfterTest
	public void end()
	{
		//logger.info("Framework Execution Ended");
	}
	*/

		@BeforeMethod
		public void setUp()
		{
			String br="Chrome";
			if(br.equalsIgnoreCase("Chrome"))
			{
				driver= new ChromeDriver();
			}
			else if(br.equalsIgnoreCase("edge"))
			{
				driver=new EdgeDriver();
			}
			else if (br.equalsIgnoreCase("firefox"))
			{
				driver= new FirefoxDriver();
			}
			else if (br.equalsIgnoreCase("safari"))
			{
				driver= new SafariDriver();
			}
			else
			{
				System.out.println("enter correct browser name");
			}
			
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//("browser launches, window maximizes, implicitly waits");
			
		}
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}
	}
		
	
