package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwiggySearchStepDef
{
    @Given("^user accesses swiggy website$")
    public void user_accesses_swiggy_website() throws Throwable {
        System.out.println("Given run");
    }

    @When("^user selects search and enteres dish or restaurant names$")
    public void user_selects_search_and_enteres_dish_or_restaurant_names() throws Throwable {
    	System.out.println("When run");
    }

    @Then("^results should display either dishes or restaurants in location$")
    public void results_should_display_either_dishes_or_restaurants_in_location() throws Throwable {
    	System.out.println("Then run");
    }
    
    @And("^user enters location$")
    public void user_enters_location() throws Throwable {
    }
}
