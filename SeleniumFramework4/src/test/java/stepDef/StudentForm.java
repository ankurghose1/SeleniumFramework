package stepDef;

import common.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentForm extends Base {
	
	
	
	@Given("^I am on the Tools QA website$")
	public void i_am_on_the_Tools_QA_website() {
	    getdriver();
	    
	    
	}

	@Given("^I start filling out the form info$")
	public void i_start_filling_out_the_form_info() {
	    
	}

	@When("^I get to submit button and click it$")
	public void i_get_to_submit_button_and_click_it() {
	   
	}

	@Then("^I should have sumbitted my form$")
	public void i_should_have_sumbitted_my_form() {
	    
	}

	
	
	
	
	
	

}
