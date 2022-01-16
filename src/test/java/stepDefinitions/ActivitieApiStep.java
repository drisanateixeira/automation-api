package stepDefinitions;

import pageObjects.ActivitieApiPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
public class ActivitieApiStep {
	ActivitieApiPage api = new ActivitieApiPage();

	@Given("I make the post with the data id {int} and title {string}, so validate the return status code is {int}")
	public void post(Integer idActivitie, String title, Integer status)throws Exception {
		api.createActivitie(idActivitie, title, status);
	}
	
	@When("I do the GET to id of first step, so validate the title is {string} and the return status code is {int}")
	public void getId( String nameActivitie, Integer status) {
		api.validateIdActivitie( nameActivitie, status);
	}
	
	@Then("to do the GET for all, so validate the return is {int}")
	public void getAll(Integer status)throws Exception {
		api.getAllActivities(status);
	}
	
}
