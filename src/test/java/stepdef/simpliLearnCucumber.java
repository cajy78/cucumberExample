package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class simpliLearnCucumber
{
	WebDriver driver = CucumberSetup.driver;
	
	public ExtentReports extent;
	public ExtentTest logger;

    @Given("^The user is already on the Amazon Home Page$")
    public void the_user_is_already_on_the_amazon_home_page() throws Throwable {
    	//System.setProperty("webdriver.chrome.driver", "./drivers/windows/chromedriver.exe");
    	//driver = new ChromeDriver();
    	driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    }

    @When("^User click on search bar and type (.+)$")
    public void user_click_on_search_bar_and_type(String productname) throws Throwable {
    	WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
        searchBar.sendKeys(productname);
        //driver.findElement(By.className("nav-input")).click();
        searchBar.submit();
        extent = new ExtentReports(System.getProperty("user.dir") +"/extent-report.html", false);
        logger = extent.startTest(productname);
        logger.log(LogStatus.PASS, "Search completed with product: "+productname);
    }

    @Then("^User should be shown all the available \"([^\"]*)\" in the inventory$")
    public void user_should_be_shown_all_the_available_something_in_the_inventory(String productname) throws Throwable {
    	System.out.println("Then statement");
    	extent.endTest(logger);
    	extent.flush();
    	extent.close();
    }

    @But("^User should not see the \"([^\"]*)\"$")
    public void user_should_not_see_the_something(String excludedproduct) throws Throwable {
    	System.out.println("But statement");
    }
}
