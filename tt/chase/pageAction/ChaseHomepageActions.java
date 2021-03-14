package tt.chase.pageAction;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import tt.chase.pageElements.ChaseHomepageLocators;
import tt.utilities.SetupDrivers;

public class ChaseHomepageActions {
	
	ChaseHomepageLocators ChaseHomepageLocatorsObj;

	public ChaseHomepageActions(){
		ChaseHomepageLocatorsObj = new ChaseHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver,  ChaseHomepageLocatorsObj);
	}
	
	public void loadChaseHomepage() throws Exception {
//		SetupDrivers.driver.get("https://www.chase.com");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}