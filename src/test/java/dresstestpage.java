import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dresstestpage {
	dresspageobject dp;

	@Test
	public dresstestpage() {
		dp = new dresspageobject();
	}

	@Test
	public void verifybtn() {
			dp.Dressbtn().click();
		
	
Assert.assertTrue(dp.largebtn().isDisplayed(), "failed");
dp.clicklarge();
Assert.assertTrue(dp.mediumbtn().isDisplayed(), "failed");
dp.clickmedium();

Assert.assertTrue(dp.Smallbtn().isDisplayed(), "failed");
dp.clicksmall();
Assert.assertTrue(dp.getnumber() == dp.getproductcount(), "Failed:cannot match");


		
			}
}
