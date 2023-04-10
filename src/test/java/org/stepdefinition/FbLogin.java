package org.stepdefinition;

import org.Pojo.FbloginPojo;
import org.base.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin extends BaseClass {
	
	
	FbloginPojo f;
	@Given("To launch the chrome browser and maximize window")
	public void to_launch_the_chrome_browser_and_maximize_window() {
		launchBrowser();
		windowMaximize();
	   
	}

	@When("To launch the url of the facebook application")
	public void to_launch_the_url_of_the_facebook_application() {
		launchUrl("https://en-gb.facebook.com/");
	   
	}

	@When("User has to pass the data {string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String em) {
		f = new FbloginPojo();
		passText(em, f.getEmail());
	    
	}
	
	@When("User has to pass the data {string} in password field")
	public void user_has_to_pass_the_data_in_password_field(String pass) {
		f = new FbloginPojo();
		passText(pass, f.getPassword());
	   
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		f = new FbloginPojo();
		ClickBtn(f.getLoginBtn());
	    
	}

	
	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowser();
	   
	}

	

	



}
