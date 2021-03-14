package tt.chase.pageAction;
import org.openqa.selenium.support.PageFactory;
import tt.utilities.SetupDrivers;
import tt.chase.pageElements.ChaseHelpfultipsResultLocators;

public class ChaseHelpfultipsResultActions {
	ChaseHelpfultipsResultLocators ChaseHelpfultipsResultLocatorsObj;
	
	public ChaseHelpfultipsResultActions(){
		ChaseHelpfultipsResultLocatorsObj = new ChaseHelpfultipsResultLocators();
		PageFactory.initElements(SetupDrivers.driver, ChaseHelpfultipsResultLocatorsObj);
	}
	public void ccsPage(){
		ChaseHelpfultipsResultLocatorsObj.cssPage.click();
		
		}
	public void htvPage(){
		ChaseHelpfultipsResultLocatorsObj.htvPage.click();
}
	public void pbPage(){
		ChaseHelpfultipsResultLocatorsObj.pbPage.click();
}
	public void rdcPage(){
		ChaseHelpfultipsResultLocatorsObj.rdcPage.click();
}
	public void verifyrdcPage(){
		ChaseHelpfultipsResultLocatorsObj.verifyrdcPage.click();
}
}
