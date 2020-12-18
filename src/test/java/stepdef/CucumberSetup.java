package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberSetup
{
	public static WebDriver driver;
	
	@Before("@Amazon")
	public void startChrome()
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		driver = new FirefoxDriver();
	}
	
	@After("@Amazon")
	public void endChrome()
	{
		driver.quit();
	}
}
