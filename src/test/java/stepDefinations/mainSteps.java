package stepDefinations;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainSteps {
	
	@Given("User is on Netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user landed on net banking page");
	}
	@When("User login into application")
	public void user_login_into_application() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user login into application");
	}
	
	@When("^User login into application with (.+) and password (.+)$")
	public void user_login_into_application_with_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(username + " and password is " + password);

	}
	
	
	/*@When("User login into application with {string} and password {string} combination")
	public void user_login_into_application_with_and_password_combination(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(username + " and password is " + password);
	}
	*/
	
	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
        System.out.println("home page displayed");
	}
	@Then("Card are displayed")
	public void card_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
        System.out.println("cards are displayed");
	}
	
	@Given("User is on Practice landing page")
	public void user_is_on_practice_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on Practice landing page");
	}
	
	
	@When("User Signup into application")
	public void user_signup_into_application(List<String> data) {
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	}
	
	
	@Given("setup the entries in database")
	public void setUpDB() {
		
		System.out.println("**************************");
		System.out.println("setup the entries in database");
	}
	
	
	@When("launch the browser from config variables")
	public void launchBrowserConfig() {
		
		System.out.println("launch the browser from config variables");
	}
	
	@When("hit the home page url of banking site")
	public void hitUrl() {
		
		System.out.println("hit the home page url of banking site");
	}

}









