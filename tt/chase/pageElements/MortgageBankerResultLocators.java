package tt.chase.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class MortgageBankerResultLocators {
	
	//Mortgage
	@FindBy(xpath="//body/div[1]/footer[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[2]/p[1]/a[1]")
		public WebElement mPage;

	//Home Lending Advisor
	@FindBy(xpath="//a[contains(text(),'Chase Home Lending Advisor')]")
		public WebElement laPage;
	
	//Searchbar 
	@FindBy(xpath="//input[@id='q']")
	public WebElement sbPage;
	
	//Searchbutton
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div/div[3]/form/button")
	public WebElement sbbPage;		
	
	
	//Item page should have a Home Lending Advisor
	@FindBy(xpath="//div[contains(text(),'NMLS ID:')]")
	public WebElement verifymaPage;
	
}