package steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import pages.GoogleHomePage;
import utils.Driver;

public class Steps {

	GoogleHomePage googleHomePage = new GoogleHomePage();

	@Given("navigates to {string} google homepage")
	public void navigates_to_google_homepage(String url) {
		Driver.getDriver().get(url);
	}

	@Then("verify that page status code is {int}")
	public void verify_that_page_status_code_is(int int1) {
		Response response = RestAssured.get("https://www.google.com/");
		Assert.assertEquals(int1, response.statusCode());
	}

	@Then("verify the current url is {string}")
	public void verify_the_current_url_is(String expectedUrl) {
		String actual = Driver.getDriver().getCurrentUrl();
		Assert.assertEquals(expectedUrl, actual);

	}

	@Then("verify the current page title is {string}")
	public void verify_the_current_page_title_is(String expected) {
		String actual = Driver.getDriver().getTitle();
		Assert.assertEquals(expected, actual);
	}

	@Then("verfiy the search button is available")
	public void verfiy_the_search_button_is_available() {
		Assert.assertTrue(googleHomePage.searchBox.isDisplayed());
	}

}
