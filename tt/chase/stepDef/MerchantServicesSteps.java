package tt.chase.stepDef;
import tt.chase.pageAction.ChaseHomepageActions;
import tt.chase.pageAction.MerchantServicesResultActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MerchantServicesSteps {
	
	ChaseHomepageActions ChaseHomepageActionsObj = new ChaseHomepageActions();
	MerchantServicesResultActions MerchantServicesResultActionsObj = new MerchantServicesResultActions();

	

	@When("^Search for Business Service$")
	public void search_for_Customer_Service() throws Throwable {
		System.out.println("Search for Business Service");
		MerchantServicesResultActionsObj.bbPage();
	}

	@When("^Select Merchant Services$")
	public void select_More_helpful_tips_videos() throws Throwable {
		System.out.println("Select More helpful tips videos");
		MerchantServicesResultActionsObj.msPage();
	}

	@Then("^Item page should have Merchant Services$")
	public void item_page_should_have_helpful_tips() throws Throwable {
		System.out.println("Item page should have Merchant Services");
		MerchantServicesResultActionsObj.verifymsPage();
	}

}