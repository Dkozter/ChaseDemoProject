package tt.chase.pageAction;
import org.openqa.selenium.support.PageFactory;
import tt.utilities.SetupDrivers;
import tt.chase.pageElements.MortgageBankerResultLocators;

public class MortgageBankerResultActions {
	MortgageBankerResultLocators MortgageBankerResultLocatorsObj;
	
	public MortgageBankerResultActions(){
		MortgageBankerResultLocatorsObj = new MortgageBankerResultLocators();
		PageFactory.initElements(SetupDrivers.driver, MortgageBankerResultLocatorsObj);
	}
	
	public void mPage(){
		MortgageBankerResultLocatorsObj.mPage.click();		
	}
	public void laPage(){
		MortgageBankerResultLocatorsObj.laPage.click();
	}
	public void sbPage(){
		MortgageBankerResultLocatorsObj.sbPage.clear();
		MortgageBankerResultLocatorsObj.sbPage.sendKeys("33076");
		MortgageBankerResultLocatorsObj.sbbPage.click();
		MortgageBankerResultLocatorsObj.sbPage.sendKeys("0");
		MortgageBankerResultLocatorsObj.sbbPage.click();
	}
	public void HLAzipcodePage(String HLAzipcode)throws Throwable{
		if (HLAzipcode.equals("33076")){
			MortgageBankerResultLocatorsObj.sbPage.sendKeys("33076");
		}else if(HLAzipcode.equals("0"));
		MortgageBankerResultLocatorsObj.sbPage.sendKeys("0");
		
	}
	public void verifymaPage(){
		MortgageBankerResultLocatorsObj.verifymaPage.click();
	}
	}