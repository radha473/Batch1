import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.Return;
public class dresspageobject extends BasePage{

	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement Dresstab;
	
	@FindBy(xpath="//*[@id=\'ul_layered_id_attribute_group_1\']/li[3]/label/a/span")
	private WebElement Dresstab1;

	@FindBy(xpath="//*[@id=\'ul_layered_id_attribute_group_1\']/li[2]/label")
	private WebElement Dresstab2;
   
@FindBy(xpath="//*[@id=\'ul_layered_id_attribute_group_1\']/li[1]/label/a/span")
private WebElement smalbtn;
@FindBy(xpath="//*[@id=\'center_column\']/h1/span[2]")
private WebElement header;
@FindBys(@FindBy(xpath="//*[@id=\'center_column\']/ul/li"))
private List<WebElement>products;


public dresspageobject() {
	PageFactory.initElements(driver, this);
}
public WebElement Dressbtn() {
	return Dresstab;
}
public void clickdresstab() {
	Dresstab.click();
}
	public WebElement largebtn() {
		return Dresstab1;
	}
	public void clicklarge() {
		Dresstab1.click();
	}
	public WebElement mediumbtn() {
		return Dresstab2;
	} 
	public void clickmedium() {
		Dresstab2.click();
	}
		public WebElement Smallbtn() {
			return smalbtn;
		}
		public void clicksmall() {
			smalbtn.click();
		}
		public int getnumber() {
			String text=header.getText();
			String[] arr=text.split(" ");
			String value=arr[2];
			int number=Integer.parseInt(value);
			return number;
			
			
		} 
		public int getproductcount() {
			int num=products.size();
			return num;
		}

		}
		
	


