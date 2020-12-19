package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberSetup
{
	public static WebDriver driver;
	
	@Before("@Amazon")
	public void startChrome()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/linux/chromedriver");
		driver = new ChromeDriver();
	}
	@After("@Amazon")
	public void endChrome()
	{
		driver.quit();
	}
}
