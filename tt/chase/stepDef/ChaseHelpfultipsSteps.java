package tt.chase.stepDef;
import tt.chase.pageAction.ChaseHomepageActions;
import tt.chase.pageAction.ChaseHelpfultipsResultActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChaseHelpfultipsSteps {
	
	ChaseHomepageActions ChaseHomepageActionsObj = new ChaseHomepageActions();
	ChaseHelpfultipsResultActions ChaseHelpfultipsResultActionsObj = new ChaseHelpfultipsResultActions();

	
	@Given("^Open Chase Website$")
	public void open_Chase_Website() throws Throwable {
		System.out.println("Open Chase Website");
		ChaseHomepageActionsObj.loadChaseHomepage();
	}
	@When("^Search for Customer Service$")
	public void search_for_Customer_Service() throws Throwable {
		System.out.println("Search for Customer Service");
		ChaseHelpfultipsResultActionsObj.ccsPage();
	}

	@When("^Select More helpful tips videos$")
	public void select_More_helpful_tips_videos() throws Throwable {
		System.out.println("Select More helpful tips videos");
		ChaseHelpfultipsResultActionsObj.htvPage();
	}
	
	@When("^Select Personal Banking$")
	public void Select_Personal_Banking() throws Throwable {
		System.out.println("Select More helpful tips videos");
		ChaseHelpfultipsResultActionsObj.pbPage();
	}
	
	@When("^select Replace your debit card$")
	public void select_Replace_your_debit_card() throws Throwable {
		System.out.println("Select More helpful tips videos");
		ChaseHelpfultipsResultActionsObj.rdcPage();
	}

	@Then("^Item page should play video$")
	public void item_page_should_play_video() throws Throwable {
		System.out.println("Item page should have helpful tips");
		ChaseHelpfultipsResultActionsObj.verifyrdcPage();
	}

}