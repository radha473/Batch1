import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPageObject extends BasePage {
	@FindBy(xpath="//a[@title='Women']")
	private WebElement WomenTab;
	@FindBy(xpath="//*[@id=\'search_query_top\']")
	private WebElement searchtab;
	@FindBy(xpath="//*[@id=\'searchbox\']/button")
	private WebElement searchtab2;
	public WomenPageObject() {
		PageFactory.initElements(driver, this);
		
	}
	public WebElement Womenbtn() {
		return WomenTab;
	}
	public void clickWomen() {
		WomenTab.click();
	}
	public WebElement search() {
		return searchtab;
	}
	public void clicksearch() {
		searchtab2.click();
	}
	
}
