package tt.chase.pageAction;
import org.openqa.selenium.support.PageFactory;
import tt.utilities.SetupDrivers;
import tt.chase.pageElements.MerchantServicesResultLocators;

public class MerchantServicesResultActions {
	MerchantServicesResultLocators MerchantServicesResultLocatorsObj;
	
	public MerchantServicesResultActions(){
		MerchantServicesResultLocatorsObj = new MerchantServicesResultLocators();
		PageFactory.initElements(SetupDrivers.driver, MerchantServicesResultLocatorsObj);
	}
	public void bbPage(){
		MerchantServicesResultLocatorsObj.bbPage.click();	
	}
	public void msPage(){
		MerchantServicesResultLocatorsObj.msPage.click();
	}
	public void verifymsPage(){
		MerchantServicesResultLocatorsObj.verifymsPage.click();
	}
}
