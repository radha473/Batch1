import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import org.testng.Assert;


public class WomenTestPage {
	WomenPageObject wp;
	public WomenTestPage() {
		wp=new WomenPageObject();
		}
@Test
public void verify() {
	wp.clickWomen();
	
	Assert.assertTrue(wp.search().isDisplayed(), "fail:mismatch");
	
	wp.search().sendKeys("Blouse");
	wp.clicksearch();
	
}
}
