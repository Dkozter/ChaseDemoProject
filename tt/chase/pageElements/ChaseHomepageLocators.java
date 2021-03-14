package tt.chase.pageElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChaseHomepageLocators {
	
	//Customer Service 
	@FindBy(xpath="//a[contains(text(),'Chase customer service')]")
	public WebElement txtFilter;
}

