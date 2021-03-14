package tt.chase.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class MerchantServicesResultLocators {
	//Business Banking
	@FindBy(xpath="//a[contains(text(),'Business Banking')]")
		public WebElement bbPage;

	//Merchant Services
	@FindBy(xpath="//a[contains(text(),'Merchant Services')]")
		public WebElement msPage;
	//Verify
	@FindBy(xpath="//span[contains(text(),'Experience You Can Trust:')]")
	public WebElement verifymsPage;
	//VerifySearchBar
	@FindBy(xpath="//span[contains(text(),'Experience You Can Trust:')]")
	public WebElement verifySearchbar1Page;
	
	}